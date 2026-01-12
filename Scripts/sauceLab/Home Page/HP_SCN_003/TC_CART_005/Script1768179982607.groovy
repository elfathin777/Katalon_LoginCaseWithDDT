import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username

// ===== Validasi sistem berhasil mengarahkan pengguna ke halaman Product Detail (PDP) yang relevan setelah nama atau gambar produk diklik =====
Username.usernameField(username)

Password.passwordField(password)

Click.clickLoginButton()

String productName = WebUI.getText(findTestObject('Object Repository/Home Page/Cart/productClick'))

WebUI.click(findTestObject('Object Repository/Home Page/Cart/productClick'))

String productDetail = WebUI.getText(findTestObject('Object Repository/Home Page/Cart/productDetail'))

WebUI.verifyEqual(productName, productDetail)

WebUI.delay(3)

