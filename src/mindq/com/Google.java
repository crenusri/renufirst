package mindq.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("cheese");
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);;

	}

}
