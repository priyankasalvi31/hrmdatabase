package hrmdatabase;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tmb.pages.HrmLoginPage;
import com.tmb.pages.OrangeHRMHomePage;

public class OrangeHRMTests extends BaseTest {

	private OrangeHRMTests()
	{
		
	}
	
	@Test
	public void loginLogout() throws InterruptedException
	
	{
		Thread.sleep(10000);

	String Title =new HrmLoginPage()
			.enterUserName("Admin")
			.enterPassword("admin123")
			.clickLogin()
			.clickWindow()
			.clickLogout()
	.getPageTitle();
	
	Assertions.assertThat(Title)
	.isEqualTo("OrangeHRM");
		
		
	}
}
