package sorting

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.util.Collections


public class VerifySortingKeyword {
	@Keyword
	static void verifyNameSortingAToZ() {
		List<WebElement> names = DriverFactory.getWebDriver().findElements(By.className('inventory_item_name'))
		List<String> actualNames = names.collect {
			it.text.trim()
		}
		
		List<String> expectedNames = new ArrayList<>(actualNames)
		expectedNames.sort()
		
		WebUI.verifyEqual(actualNames, expectedNames)
	}
	
	static void verifyNameSortingZToA() {
		List<WebElement> names = DriverFactory.getWebDriver().findElements(By.className('inventory_item_name'))
		List<String> actualNames = names.collect {
			it.text.trim()
		}
		
		List<String> expectedNames = new ArrayList<>(actualNames)
		expectedNames.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER))
		
		WebUI.verifyEqual(actualNames, expectedNames)
	}
	
	
	static void verifyPriceSortingLowToHigh() {

		List<WebElement> prices = DriverFactory.getWebDriver().findElements(By.className('inventory_item_price'))

		List<Double> actualPrices = prices.collect {
			it.text.replace('$','').toDouble()
		}

		List<Double> expectedPrices = new ArrayList<>(actualPrices)
		expectedPrices.sort()

		WebUI.verifyEqual(actualPrices, expectedPrices)
	}

	static void verifyPriceSortingHighToLow() {

		List<WebElement> prices = DriverFactory.getWebDriver().findElements(By.className('inventory_item_price'))

		List<Double> actualPrices = prices.collect {
			it.text.replace('$','').toDouble()
		}

		List<Double> expectedPrices = new ArrayList<>(actualPrices)
		expectedPrices.sort(Collections.reverseOrder())

		WebUI.verifyEqual(actualPrices, expectedPrices)
	}
}
