import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username

// ===== Verifikasi jumlah barang pada ikon keranjang bertambah secara akurat sesuai dengan banyaknya produk yang dipilih oleh pengguna (lebih dari satu produk) =====
Username.usernameField(username)

Password.passwordField(password)

Click.clickLoginButton()

int expectedQty = 0

WebUI.click(findTestObject('Home Page/Cart/btnAddToCart'))

expectedQty++

WebUI.click(findTestObject('Home Page/Cart/btnAddToCartSecondProduct'))

expectedQty++

int actualQty = WebUI.getText(findTestObject('Home Page/Cart/cartBadge')).toInteger()

WebUI.verifyEqual(expectedQty, actualQty)

WebUI.delay(3)

