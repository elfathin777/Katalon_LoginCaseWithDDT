package sorting

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class VerifySortingKeyword {
	@Keyword
    static void verifyPriceSortingLowToHigh() {

        List<WebElement> prices = DriverFactory.getWebDriver().findElements(By.className('inventory_item_price'))

        List<Double> actualPrices = prices.collect {
            it.text.replace('$','').toDouble()
        }

        List<Double> expectedPrices = new ArrayList<>(actualPrices)
        expectedPrices.sort()

        WebUI.verifyEqual(actualPrices, expectedPrices)
    }
}
