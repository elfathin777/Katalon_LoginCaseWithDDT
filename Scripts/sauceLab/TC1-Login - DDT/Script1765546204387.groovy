import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
if (username != 'none') {
   WebUI.sendKeys(findTestObject('sauceLab/Username_Field'), username)
}

if (password != 'none') {
    WebUI.sendKeys(findTestObject('sauceLab/Password_Field'), password)
}

WebUI.click(findTestObject('sauceLab/Login_BTN'))

if (testType == 'p') {
    WebUI.waitForElementPresent(findTestObject('sauceLab/Assertion_Log'), 0)
} else {
    WebUI.verifyElementText(findTestObject('sauceLab/warningContainer'), expectedWarningMessage)
}
