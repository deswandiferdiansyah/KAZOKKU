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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.clio.com/')

WebUI.click(findTestObject('Object Repository/Registration/Page_Clio  The Industrys 1 Legal Software  _615aa5/a_Try Clio for Free'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/input_First name_signupfirst_name'), 
    'FirstName')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/input_Last name_signuplast_name'), 
    'LastName')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/input_Email_signupemail'), 
    'Email')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/input_Phone number_signupphone_number'), 
    'PhoneNumber')

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/select_Select.12 to 45 to 910 to 1920 to 99_539523'), 
    '2 to 4', true)

WebUI.click(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/button_Get Started'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Sign Up - Thank You  Clio/div_imgtitlealtOpenx20envelopesrchttpswww.c_8298b7'))

WebUI.delay(1)

WebUI.closeBrowser()

