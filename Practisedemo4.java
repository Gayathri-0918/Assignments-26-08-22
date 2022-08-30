package com.demopragrams.projectdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practisedemo4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Happy\\Desktop\\maven project selenium\\projectdemo2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://computer-database.gatling.io/computers");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchbox")).sendKeys("ACE");
		driver.findElement(By.id("searchsubmit")).click();
		int Row_count = driver.findElements(By.xpath("//table[@class='computers zebra-striped']//tr")).size();
		System.out.println("Number Of Rows = "+Row_count);

		int Col_count = driver.findElements(By.xpath("//table[@class='computers zebra-striped']//tr[1]//td")).size();
		System.out.println("Number Of Columns = "+Col_count);
		
		
		String first_part = "//table[@class='computers zebra-striped']//tr[";
		String second_part = "]//td[";
		String third_part = "]";

		 for (int i=1; i<=Row_count; i++)
		 {
		  
		  for(int j=1; j<=Col_count; j++)
		  {
		   
		 String final_xpath = first_part+i+second_part+j+third_part;
		   
		 String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
		 System.out.print(Table_data +" ");
		  }

		  System.out.println("");
		  System.out.println("");
		  }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Add a new computer']")).click();
		 driver.findElement(By.id("name")).sendKeys("Apple");
		 driver.findElement(By.id("introduced")).sendKeys("2022-01-01");
		 driver.findElement(By.id("discontinued")).sendKeys("2022-08-01");
		 Select dropdown=new Select(driver.findElement(By.id("company")));
		 dropdown.selectByValue("1");
		 String text=driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		 System.out.println(text);


	}

}
