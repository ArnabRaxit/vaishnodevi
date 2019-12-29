import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.maavaishnodevi.org/OnlineServices/LogIn.aspx')

WebUI.click(findTestObject('Object Repository/2/Page_Shri Mata Vaishno Devi Shrine Board  O_31b291/input_I agree and accept all the above term_0f8471'))

WebUI.click(findTestObject('Object Repository/2/Page_Shri Mata Vaishno Devi Shrine Board  O_31b291/input_I agree and accept all the above term_09d904'))

WebUI.click(findTestObject('Object Repository/2/Page_Shri Mata Vaishno Devi Shrine Board  O_31b291/a_'))

WebUI.click(findTestObject('Object Repository/2/Page_Shri Mata Vaishno Devi Shrine Board  O_31b291/input_Username_txtuser'))

WebUI.setText(findTestObject('Object Repository/2/Page_Shri Mata Vaishno Devi Shrine Board  O_31b291/input_Username_txtuser'), 
    'ArnabRaxit')

WebUI.setEncryptedText(findTestObject('Object Repository/2/Page_Shri Mata Vaishno Devi Shrine Board  O_31b291/input_Password_txtpassword'), 
    '5gDRQbh20ufTaBwKz04xeA==')

WebUI.click(findTestObject('Object Repository/2/Page_Shri Mata Vaishno Devi Shrine Board  O_31b291/input_I agree and accept all the above term_09d904'))

WebUI.click(findTestObject('Object Repository/2/Page_ Shri Mata Vaishno Devi Shrine Board  _bd719b/img_Online Services_Helicopter'))

try {
	WebUI.selectOptionByValue(findTestObject('2/Page_ Shri Mata Vaishno Devi Shrine Board  _e4eeac/select_dates_44534c'), '27/02/2020',
		true)
	WebUI.click(findTestObject('Object Repository/2/Page_ Shri Mata Vaishno Devi Shrine Board  _e4eeac/input_Reservation Date_BtnAccept'))
	
}
finally {
	WebUI.click(findTestObject('Object Repository/2/Page_ Shri Mata Vaishno Devi Shrine Board  _e4eeac/a_Logout'))
	
	WebUI.closeBrowser()
}







