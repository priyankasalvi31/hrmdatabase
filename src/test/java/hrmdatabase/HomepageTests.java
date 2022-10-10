package hrmdatabase;

import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;

public final class HomepageTests extends BaseTest {

	private HomepageTests() {

	}

	@Test
	public void test1() {
		// Driver.initDriver();
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube", Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		
		assertThat(title)
		.as("Object is actually null").isNotNull()
		.as("It does not contains expected text").containsIgnoringCase("google search")
		.matches("\\w.*" + "google search")
		.hasSizeBetween(15, 100);

		Assert.assertTrue(title.length() < 100);
		List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3"));
assertThat(elements)
  .hasSize(11)
  .extracting(WebElement :: getText)
  .contains("Testing mini bytes - Youtube");
		Assert.assertEquals(elements.size(), 11);

		boolean IsElementPresent = false;
		for (WebElement element : elements) {
			if (element.getText().equalsIgnoreCase("Testing mini bytes - Youtube")) {

				IsElementPresent = true;
				break;

			}
		}
		Assert.assertTrue(IsElementPresent,"Testing mini bytes not found");
	}
}
