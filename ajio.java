package assignment6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajio {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	
	List <WebElement> count= driver.findElements(By.xpath("//div[@class='brand']"));
	System.out.println("The total count is:"+count.size());
	
	for (WebElement j : count) {
		System.out.println(j.getText());
		
		
		}
	List<WebElement> namelist= driver.findElements(By.xpath("//div[@class='nameCls']"));
	System.out.println(+namelist.size());
	for(WebElement k : namelist) {
		System.out.println(k.getText());
		
		}
	}	
	

}
