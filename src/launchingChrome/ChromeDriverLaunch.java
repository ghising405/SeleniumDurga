package launchingChrome;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;





public class ChromeDriverLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Volumes/timemachine/chromeDriver_102.0.5005.61/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		

	}

}
