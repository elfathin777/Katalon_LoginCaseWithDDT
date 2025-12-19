import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


WebUI.sendKeys(findTestObject('sauceLab/Username_Field'), GlobalVariable.username)

WebUI.sendKeys(findTestObject('sauceLab/Password_Field'), GlobalVariable.password)

WebUI.click(findTestObject('sauceLab/Login_BTN'))

WebUI.waitForElementPresent(findTestObject('sauceLab/Assertion_Log'), 0)

WebUI.closeBrowser()

