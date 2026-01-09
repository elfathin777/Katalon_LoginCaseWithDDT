import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username

Username.usernameField(username)
Password.passwordField(password)
Click.clickLoginButton()

WebUI.click(findTestObject('Sorting/sortingButton'))
WebUI.selectOptionByValue(findTestObject('Sorting/sortingButton'), 'hilo', false)
WebUI.delay(3)

WebUI.refresh()

WebUI.delay(1)
