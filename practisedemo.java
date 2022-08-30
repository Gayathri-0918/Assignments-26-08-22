package com.demopragrams.projectdemo2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practisedemo {

	public static void main(String[] args) throws AWTException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Happy\\Desktop\\maven project selenium\\projectdemo2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Gayathri");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_U);
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.xpath("//input[@name='vfb-13[address]']")).sendKeys("Rajivnagar");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_3);
		driver.findElement(By.xpath("(//input[@name='vfb-13[address]']//following::input)[2]")).sendKeys("Kovilpatti");
		driver.findElement(By.xpath("(//input[@name='vfb-13[address]']//following::input)[3]")).sendKeys("Tamilnadu");
		driver.findElement(By.xpath("(//input[@name='vfb-13[address]']//following::input)[4]")).sendKeys("628501");
		Select dropdown=new Select(driver.findElement(By.cssSelector("select#vfb-13-country")));
		dropdown.selectByValue("India");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='vfb-18']")).click();
		driver.findElement(By.xpath("//a[@data-date='27']")).click();
		Select dropdown2=new Select(driver.findElement(By.cssSelector("select#vfb-16-hour")));
		dropdown2.selectByValue("08");
		Select dropdown3=new Select(driver.findElement(By.cssSelector("select#vfb-16-min")));
		dropdown3.selectByValue("30");
		driver.findElement(By.xpath("//input[@name='vfb-19']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@value='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//textarea[@name='vfb-23']")).sendKeys("Enter your query");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_3);
		robot.keyPress(KeyEvent.VK_3);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		TakesScreenshot screen=(TakesScreenshot)driver;
		File store=screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(store, new File("C:\\Users\\Happy\\Desktop\\maven project selenium\\projectdemo2\\Screenshots\\image.png"));
		System.out.println("screenshot is taken");
		String submit=driver.findElement(By.xpath("(//div[@class='elementor-widget-container'])[1]")).getText();
		System.out.println(submit);
		
		}

}
