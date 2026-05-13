package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testdemo {
	
	@Test
	public void launchurl() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
		driver.close();
	}

}
