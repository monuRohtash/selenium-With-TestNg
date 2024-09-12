package seleniumday21;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//Id
		boolean Monu=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(Monu);
		
		//linktext & partialLinkText
//		driver.findElement(By.linkText("Tablets")).click();
//		driver.findElement(By.partialLinkText("Tablet")).click();
		
		//Classname
		List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		System.out.println("Total No. of Links:"+headerLinks.size());
		
		//tagname
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links"+links.size());
		
		
		// 4).args Close browser
        driver.close();
		
		
	}

}
