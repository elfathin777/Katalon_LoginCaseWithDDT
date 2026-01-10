import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username
import sorting.KlikSortingByValueZAKeyword as ZASorting
import sorting.KlikSortingIconKeyword as KlikSorting

Username.usernameField(username)
Password.passwordField(password)
Click.clickLoginButton()

KlikSorting.klikSortingIcon()
ZASorting.klikSortingByValueAZ()