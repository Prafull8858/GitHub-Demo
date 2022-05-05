package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBLogin {
	WebDriver driver;
	@When("user enters valid user name")
	public void user_enters_valid_user_name() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\QNS\\Desktop\\Softech Classes\\TestNG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com/reg");
	}
	@When("user enters valid password")
	public void user_enters_valid_password() {
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc@1234");

		WebElement day = driver.findElement(By.id("day"));
		Select selday = new Select(day);
		selday.selectByVisibleText("10");
		
	}    
	@Then("user sucessfully login")
	public void user_sucessfully_login() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
