import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import login.ClickLoginButtonKeyword as Click

import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username
import sorting.KlikSortingByValueHiloKeyword as HiloSorting
import sorting.KlikSortingIconKeyword as KlikSorting
import sorting.VerifySortingKeyword as Verify


Username.usernameField(username)
Password.passwordField(password)
Click.clickLoginButton()

KlikSorting.klikSortingIcon()

HiloSorting.klikSortingByValueHilo()
Verify.verifyPriceSortingHighToLow()
WebUI.delay(3)

WebUI.refresh()
Verify.verifyPriceSortingHighToLow()


