package login
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class UsernameFieldKeyword {
	@Keyword
	static void usernameField(String username) {
		if (username != 'none') {
			WebUI.setText(findTestObject('Login/Username_Field'), username)
		}
	}
}