package Github_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study1
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	

	
	  driver.get("https://jqueryui.com/tooltip/");
	
	  driver.switchTo().frame(0);
	
	  WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
	  //now take that referance variable and just select method called get attribute and pass the attribute tittle which is mentioned in x path
	  //and pass the tittle as argument
	  
	  String tooltiptext = inputbox.getAttribute("tittle");    //return type of this attribute method is string
	
	  System.out.println(tooltiptext);
	
	  
	
	
	
	
	
	
	
	}	
}
