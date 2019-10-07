package org.selenium.element.by.id;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhenLocatingElementsById {
	public static WebDriver driver;
	public static WebElement dpd1;
	public static WebElement cookie;
	public static WebElement thhotels;
	public static WebElement sidebar;
	public static WebElement newsleter;
	public static WebElement li_myaccount;
	public static WebElement dpd2;
	public static WebElement chat_widget;
	public static WebElement livechat_eye;
	public static WebElement thflights;
	
	 @Test
	    public void find_footer_element_by_id() {

		 dpd1 = driver.findElement(By.id("dpd1"));

	    }
	 @Test
	    public void find_thhotels_element_by_id() {

		 thhotels = driver.findElement(By.id("thhotels"));

	    }
	 @Test
	    public void find_cookie_element_by_id() {

		 cookie = driver.findElement(By.id("cookyGotItBtnBox"));

	    }
	 @Test
	    public void find_sidebar_element_by_id() {

		 sidebar = driver.findElement(By.id("sidebar_left"));

	    }
	 @Test
	    public void find_newsleter_element_by_id() {

		 newsleter = driver.findElement(By.id("message-newsletter_2"));

	    }
	 @Test
	    public void find_li_myaccount_element_by_id() {

		 li_myaccount = driver.findElement(By.id("li_myaccount"));

	    }
	 @Test
	    public void find_dpd2_element_by_id() {

		 dpd2 = driver.findElement(By.id("dpd2"));

	    }
	 @Test
	    public void find_chat_element_by_id() {

		 chat_widget = driver.findElement(By.id("chat-widget-container"));

	    }
	 @Test
	    public void find_message_element_by_id() {

		 livechat_eye = driver.findElement(By.id("livechat-eye-catcher-img"));

	    }
	 @Test
	    public void find_thflights_element_by_id() {

		 thflights = driver.findElement(By.id("thflights"));

	    }
	 


}
