package concepts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

//properties//variable//fields	
//method//statement	
public static void main(String[] args) {
	//chrome driver path setup
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\selenium-workspace\\selenium1st\\driver\\chromedriver.exe");
			//webdriver object
			WebDriver driver = new ChromeDriver();
			//fetching the app
			driver.get("https://www.selenium.dev/ 	");
			//maximize
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//type in box
			driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
			
			//close
			driver.close();
		

	
















}	
	
}
