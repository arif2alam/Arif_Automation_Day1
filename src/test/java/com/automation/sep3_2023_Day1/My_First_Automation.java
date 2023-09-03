package com.automation.sep3_2023_Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class My_First_Automation {

	public static void main(String[] args) {

   WebDriver driver =new ChromeDriver(); //Ctrl+Shift+0
   driver.manage().window().maximize();
   driver.get("https://www.Amazon.com");
   driver.quit();
   
   WebDriver driver1 =new ChromeDriver(); //Ctrl+Shift+0
   driver1.manage().window().maximize();
   driver1.get("https://www.Amazon.com");
   driver1.quit();
		
   
   WebDriver driver2 =new EdgeDriver(); //Ctrl+Shift+o
   driver2.manage().window().maximize();
   driver2.get("https://www.amazon.com");
   driver2.quit();
	}

}
