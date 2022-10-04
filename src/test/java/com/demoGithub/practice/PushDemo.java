package com.demoGithub.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PushDemo {

	 @Test
	 public void test() {
		 WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 System.out.println("successfully pushed to repository");
	 }
}
