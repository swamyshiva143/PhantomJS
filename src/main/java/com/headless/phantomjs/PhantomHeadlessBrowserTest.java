package com.headless.phantomjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
public class PhantomHeadlessBrowserTest {

	public static void main(String[] args) {
		
		System.setProperty("phantomjs.binary.path", "D:\\Swamyshiva\\swamyshiva\\phantomjs\\phantomjs-2.1.1-windows\\bin");
		WebDriver driver= new PhantomJSDriver();
		
		driver.get("http://www.facebook.com");
		
		String title= driver.getTitle();
		System.out.println(title);
		

	}

}
