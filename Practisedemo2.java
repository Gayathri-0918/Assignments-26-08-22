package com.demopragrams.projectdemo2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisedemo2 {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Happy\\Desktop\\maven project selenium\\projectdemo2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='  Alert and Popup  ']")).click();
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		String text1=driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
		String text2=driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		String text3=driver.findElement(By.xpath("//p[text()='Thanks for Liking Automation']")).getText();
		System.out.println(text3);
		
		

	}

}
