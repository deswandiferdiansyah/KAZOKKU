import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class registration {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("the clio URL")
	def theclioURL() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.clio.com/')

		WebUI.click(findTestObject('Object Repository/Registration/Page_Clio  The Industrys 1 Legal Software  _615aa5/a_Try Clio for Free'))
	}

	@When("I input (.*) in the fields")
	def inputFirtName(String FirstName) {
		WebUI.setText(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/input_First name_signupfirst_name'), 
    'FirstName')
	}
	
	@And("I input (.*) in the fields")
	def inputLastName(String LastName) {
		WebUI.setText(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/input_Last name_signuplast_name'),
			'LastName')
	}
	
	@And("I input (.*) in the field")
	def inputEmail(String Email) {
		WebUI.setText(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/input_Email_signupemail'),
			'Email')
	}
	
	@And("I input (\\d+) in the field")
	def inputphoneNumber(int phoneNumber) {
		WebUI.setText(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/input_Phone number_signupphone_number'), 
    'PhoneNumber')
	}
	
	@And("I select option the Firm Size in the field")
	def selectFirmSize() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/select_Select.12 to 45 to 910 to 1920 to 99_539523'),
			'2 to 4', true)
	}
	
	@And("I click on the Get Started button")
	def GetStartedButton() {
		WebUI.click(findTestObject('Object Repository/Registration/Page_Start Your Free Trial  Clio/button_Get Started'))
	}

	@Then("the verification email on display")
	def VerificationEmail() {
		WebUI.click(findTestObject('Object Repository/Registration/Page_Sign Up - Thank You  Clio/div_imgtitlealtOpenx20envelopesrchttpswww.c_8298b7'))

		WebUI.delay(1)

		WebUI.closeBrowser()
	}
}