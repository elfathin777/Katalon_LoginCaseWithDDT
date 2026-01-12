import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username

// ===== Verifikasi Klik pada tombol 'Remove' harus mengubah label tombol kembali menjadi 'Add to Cart' dan mengurangi jumlah pada Shopping Cart =====
Username.usernameField(username)

Password.passwordField(password)

Click.clickLoginButton()

int expectedQty = 0

WebUI.click(findTestObject('Home Page/Cart/btnAddToCart'))

expectedQty++

WebUI.click(findTestObject('Home Page/Cart/btnAddToCartSecondProduct'))

expectedQty++

WebUI.click(findTestObject('Home Page/Cart/btnRemove'))

expectedQty--

WebUI.verifyElementPresent(findTestObject('Home Page/Cart/cartBadge'), 5)

int actualQty = WebUI.getText(findTestObject('Home Page/Cart/cartBadge')).toInteger()

WebUI.verifyEqual(expectedQty, actualQty)

WebUI.delay(3)

