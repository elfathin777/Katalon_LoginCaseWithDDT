import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import login.ClickLoginButtonKeyword as Click
import login.PasswordFieldKeyword as Password
import login.UsernameFieldKeyword as Username
import sorting.KlikSortingIconKeyword as ClickSortingIcon
import sorting.SortingConditionKeyword as Condition
import sorting.VerifySortingKeyword as Verify


Username.usernameField(username)

Password.passwordField(password)

Click.clickLoginButton()

ClickSortingIcon.klikSortingIcon()

Verify.verifySorting(actualPrices, "asc")

Condition.sortingCondition(sortingOption, refresh)

WebUI.delay(1)

