package RCVDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {
	public static void main(String[] args) {
		String projectPath =System.getProperty("user.dir");
//		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", projectPath+"\\drivers\\edgedriver\\edgedriver_win64\\msedgedriver.exe");
//		ChromeDriver chromeDriver=new ChromeDriver();
//		chromeDriver.get("https://www.google.com");
//		System.out.print(projectPath);
//		chromeDriver.findElement(By.name("q")).sendKeys("Automation step by step");
//		chromeDriver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		EdgeDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://www.google.com");
	
//		WebDriver webDriver = new FirefoxDriver();
//		webDriver.get("https://www.google.com");
//		System.out.print(projectPath);
//		WebDriver.findElement(By.class("fake-editable")).sendKeys("Automation step by step");
//		webDriver.findElement(By.name("q")).sendKeys("Automation step by step");
//		webDriver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
//		webDriver.close();
	}

}