package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MasterLoginFlowKeyword {
	@Keyword
	static void loginFlow(String username, String password, String testType, String expectedWarningMessage) {
		if (username != 'none') {
			WebUI.setText(findTestObject('sauceLab/Username_Field'), username)
		}

		if (password != 'none') {
			WebUI.setText(findTestObject('sauceLab/Password_Field'), password)
		}

		WebUI.click(findTestObject('sauceLab/Login_BTN'))

		if (testType == 'p') {
			WebUI.waitForElementPresent(findTestObject('sauceLab/Assertion_Log'), 0)
		} else {
			WebUI.verifyElementText(findTestObject('sauceLab/warningContainer'), expectedWarningMessage)
		}
	}
}
