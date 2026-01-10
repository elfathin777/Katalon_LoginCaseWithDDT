import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username
import sorting.KlikSortingByValueAZKeyword as AZSorting
import sorting.KlikSortingIconKeyword as KlikSorting

Username.usernameField(username)
Password.passwordField(password)
Click.clickLoginButton()

KlikSorting.klikSortingIcon()
AZSorting.klikSortingByValueAZ()
