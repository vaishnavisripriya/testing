package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task51 {
	public static void main(String[]arg) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String s = driver.getTitle();
		if(s.equals("Home"))
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2000)","");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		String m = driver.getTitle();
		if(m.equals("Shop"))
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
	}

}
