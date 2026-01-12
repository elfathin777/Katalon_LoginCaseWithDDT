import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username

// ===== Validasi bahwa tombol 'Remove' secara akurat mengembalikan status tombol menjadi 'Add to Cart', memperbarui jumlah pada ikon keranjang belanja, dan memastikan perubahan tersebut tetap bertahan meskipun halaman dimuat ulang =====
Username.usernameField(username)

Password.passwordField(password)

Click.clickLoginButton()

WebUI.click(findTestObject('Home Page/Cart/btnAddToCartSecondProduct'))

WebUI.click(findTestObject('Home Page/Cart/btnRemove'))

WebUI.verifyElementPresent(findTestObject('Home Page/Cart/btnAddToCartSecondProduct'), 5)

WebUI.delay(3)

