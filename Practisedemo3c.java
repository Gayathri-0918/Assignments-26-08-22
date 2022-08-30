package com.demopragrams.projectdemo2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisedemo3c {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Happy\\Desktop\\maven project selenium\\projectdemo2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println("parent window---"+parent);
		driver.findElement(By.xpath("//button[text()='  Multiple Windows  ']")).click();
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		Iterator<String> itr=allwindows.iterator();
		while(itr.hasNext())
		{
			String child_window=itr.next();


			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());
			driver.close();

	}

}
		driver.quit();
}
}