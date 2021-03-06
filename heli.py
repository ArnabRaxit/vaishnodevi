# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class UntitledTestCase(unittest.TestCase):
    def setUp(self):
        # self.driver = webdriver.Chrome()
        chrome_options = webdriver.ChromeOptions()
        chrome_options.add_argument('--headless')
        chrome_options.add_argument('--no-sandbox')
        chrome_options.add_argument('--disable-dev-shm-usage')
        self.driver = webdriver.Chrome(chrome_options=chrome_options)
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_untitled_test_case(self):
        driver = self.driver
        try:
            driver.get("https://www.maavaishnodevi.org/OnlineServices/LogIn.aspx")
            driver.find_element_by_id("agree").click()
            driver.find_element_by_id("Btn_Submit").click()
            driver.find_element_by_link_text("×").click()
            driver.find_element_by_id("txtuser").send_keys("SamirRaxit")
            driver.find_element_by_id("txtpassword").send_keys("HambaGoru123")
            driver.find_element_by_id("Btn_Submit").click()
            driver.find_element_by_id("Image4").click()
            driver.find_element_by_id("DrpResvDate").click()
            Select(driver.find_element_by_id("DrpResvDate")).select_by_visible_text("27-Feb-2020")
            # driver.find_element_by_id("BtnAccept").click()
        finally:
            driver.find_element_by_link_text("Logout").click()
    
    def is_element_present(self, how, what):
        try: self.driver.find_element(by=how, value=what)
        except NoSuchElementException as e: return False
        return True
    
    def is_alert_present(self):
        try: self.driver.switch_to_alert()
        except NoAlertPresentException as e: return False
        return True
    
    def close_alert_and_get_its_text(self):
        try:
            alert = self.driver.switch_to_alert()
            alert_text = alert.text
            if self.accept_next_alert:
                alert.accept()
            else:
                alert.dismiss()
            return alert_text
        finally: self.accept_next_alert = True
    
    def tearDown(self):
        self.driver.quit()
        self.assertEqual([], self.verificationErrors)

if __name__ == "__main__":
    unittest.main()

