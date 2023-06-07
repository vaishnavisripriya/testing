package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {
	public static void main(String[]arg) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vaishnavi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("vaishnavi");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
		
	}

}
