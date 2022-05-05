package com.StepDefination;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMLogin extends BaseClass{
	
	@Given("User is on the login Page")
	public void user_is_on_the_login_page() {
		BaseClass.initialization();
	    
	}
	@When("User ender vaid user name and password")
	public void user_ender_vaid_user_name_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	    
	}
	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("user is on the home page")
	public void user_is_on_the_home_page() {
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    
	}
	
	@Given("user is on the dashboard page")
	public void user_is_on_the_dashboard_page() {
		System.out.println(driver.getCurrentUrl());
	}
	@When("user click on PIM tab")
	public void user_click_on_pim_tab() {
		driver.findElement(By.linkText("PIM")).click();
	    
	}
	@Then("user is on the PIM page")
	public void user_is_on_the_pim_page() {
		System.out.println(driver.getCurrentUrl());
	}



}
