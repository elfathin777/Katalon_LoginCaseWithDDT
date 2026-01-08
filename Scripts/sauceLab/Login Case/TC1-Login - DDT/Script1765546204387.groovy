import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username
import login.VerifyAssertionKeyword as Assertion


Username.usernameField(username)
Password.passwordField(password)
Click.clickLoginButton()
Assertion.verifyAssertion(testType, expectedWarningMessage)

