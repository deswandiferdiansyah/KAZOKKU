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



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given(("the clio URL")
	def theclioURL() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.clio.com/')
	}
	
	@When("I click the login button")
	def theloginbutton() {
		WebUI.click(findTestObject('Object Repository/Login/Page_Clio  The Industrys 1 Legal Software  _615aa5/a_Login'))
	}
	
	@And("I input (.*) in the field")
	def inputEmail(String Email) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Clio/input_Email_email'),
			'Email')
	}
	
	@And("I click the next paswword")
	def theNextPassword() {
		WebUI.click(findTestObject('Object Repository/Login/Page_Login  Clio/button_Next Password'))
	}

	@And("I input (\\d+) in field")
	def inputPassword(var Password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_Sign in to Clio/input_Show_userpassword'),
			'Password')
	}
	
	@And("I click the sign button")
	def theSignInbutton() {
		WebUI.click(findTestObject('Object Repository/Login/Page_Sign in to Clio/button_Sign in'))
	}

	@Then("I verify the dashboard")
	def theDashBoard() {
		WebUI.click(findTestObject('Object Repository/Registration/Page_Sign Up - Thank You  Clio/div_imgtitlealtOpenx20envelopesrchttpswww.c_8298b7'))
		WebUI.delay(1)
		WebUI.closeBrowser()
	}
}