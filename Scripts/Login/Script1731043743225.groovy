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

WebUI.click(findTestObject('Object Repository/Login/Page_Clio  The Industrys 1 Legal Software  _615aa5/a_Login'))

WebUI.click(findTestObject('Object Repository/Login/Page_Login  Clio/a_Sign in to Clio Grow'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Clio/input_Email_email'), 'deswandiferdiansyah+1@gmail.com')

WebUI.click(findTestObject('Object Repository/Login/Page_Login  Clio/button_Next Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Sign in to Clio/input_Show_userpassword'), 'oS/XNDL28GSRsGdPhmQpfA==')

WebUI.click(findTestObject('Object Repository/Login/Page_Sign in to Clio/button_Sign in'))

WebUI.closeBrowser()

