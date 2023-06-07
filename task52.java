package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task52 {
	public static void main(String[]arg) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String s = driver.getCurrentUrl();
		if(s.equals("https://j2store.net/free/"))
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,5000)","");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		String m = driver.getCurrentUrl();
		if(m.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.print(false);
		}
		else
		{
			System.out.print(true);
		}
	}

}
