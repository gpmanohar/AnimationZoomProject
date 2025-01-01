package UIUXTesting;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UIUXTesting {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://animationzoom.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locate the header element
		WebElement header = driver.findElement(By.xpath("//header[@id='masthead']"));

		// Check header visibility
		if (header.isDisplayed()) {
			System.out.println("Header is visible.");
		} else {
			System.out.println("Header is not visible.");
		}

		// Get the location and size of the header
		org.openqa.selenium.Point headerLocation = header.getLocation();
		org.openqa.selenium.Dimension headerSize = header.getSize();
		System.out.println("Header Location - X: " + headerLocation.getX() + ", Y: " + headerLocation.getY());
		System.out.println("Header Size - Width: " + headerSize.getWidth() + ", Height: " + headerSize.getHeight());

		// Check if header is positioned correctly (example: header should be at the top
		// of the page)
		if (headerLocation.getY() == 0) {
			System.out.println("Header is positioned correctly at the top.");
		} else {
			System.out.println("Header is not at the top.");
		}

		// Locate a navigation menu element
		WebElement navMenu = driver.findElement(By.xpath(
				"//div[@class='elementor-element elementor-element-9777b7f hfe-nav-menu__align-left hfe-submenu-icon-arrow hfe-submenu-animation-none hfe-link-redirect-child hfe-nav-menu__breakpoint-tablet elementor-widget elementor-widget-navigation-menu']//nav[@class='hfe-nav-menu__layout-horizontal hfe-nav-menu__submenu-arrow']"));

		// Check if the navigation menu is visible
		if (navMenu.isDisplayed()) {
			System.out.println("Navigation menu is visible.");
		} else {
			System.out.println("Navigation menu is not visible.");
		}

		// Get the dimensions and position of the navigation menu
		org.openqa.selenium.Point navMenuLocation = navMenu.getLocation();
		org.openqa.selenium.Dimension navMenuSize = navMenu.getSize();
		System.out
				.println("Navigation Menu Location - X: " + navMenuLocation.getX() + ", Y: " + navMenuLocation.getY());
		System.out.println(
				"Navigation Menu Size - Width: " + navMenuSize.getWidth() + ", Height: " + navMenuSize.getHeight());

		// Verify that the footer is at the bottom of the page (example check)
		WebElement footer = driver.findElement(By.xpath("//footer[@id='colophon']"));
		org.openqa.selenium.Point footerLocation = footer.getLocation();
		if (footerLocation.getY() > headerLocation.getY()) {
			System.out.println("Footer is positioned correctly below the header.");
		} else {
			System.out.println("Footer is not positioned correctly.");
		}

		// Example of checking background color of a button for layout consistency
		WebElement button = driver.findElement(By.xpath("//button[text()='Submit']"));
		String buttonBgColor = button.getCssValue("background-color");
		System.out.println("Submit Button Background Color: " + buttonBgColor);

		// Example of checking background color of a logo for layout consistency

		WebElement button1 = driver.findElement(By.xpath(
				"//a[@href='https://animationzoom.com/']/img[@class='attachment-large size-large wp-image-28']"));
		String buttonBgColor1 = button.getCssValue("background-color");
		System.out.println("Logo Background Color: " + buttonBgColor1);

		// o Verify the visibility and functionality of the navigation bar.

		// Home button :
		WebElement hom = driver.findElement(By.xpath("(//a[text()='HOME'])[1]"));
		System.out.println("Button name is :" + hom.getText());
		hom.click();
		System.out.println("Home button clicked");

		// about us button :
		WebElement abt = driver.findElement(By.xpath("(//a[text()='ABOUT US'])[1]"));
		System.out.println("Button name is :" + abt.getText());
		abt.click();
		System.out.println("About us button clicked");

		driver.navigate().back();

		// Services button :
		WebElement srv = driver.findElement(By.xpath("//a[text()='SERVICES']"));
		System.out.println("Button name is :" + srv.getText());
		srv.click();
		System.out.println("Home button clicked");

		// Portfolio button :
		WebElement prt = driver.findElement(By.xpath("(//a[text()='PORTFOLIO'])[1]"));
		System.out.println("Button name is :" + prt.getText());
		prt.click();
		System.out.println("Portfolio button clicked");

		// Contact us button :
		WebElement cnt = driver.findElement(By.xpath("(//a[text()='CONTACT US'])[1]"));
		System.out.println("Button name is :" + cnt.getText());
		cnt.click();
		System.out.println("Contact us  button clicked");
		
		// Banner mismatch 
		WebElement ban = driver.findElement(By.xpath("//h2[text()='Conatct Us']"));
		
		String act = ban.getText();
		
		if(ban.equals(act)) {
			System.out.println("Contact speeling is correct according to banner");
		}
		else {
			System.out.println("Not correct according to spelling");
		}
		
				
		// BLOG button :
		WebElement blog = driver.findElement(By.xpath("//a[text()='BLOG']"));
		System.out.println("Button name is :" + blog.getText());
		blog.click();
		System.out.println("BLOG button clicked");
		
		// verifying footer section
		WebElement fot = driver.findElement(By.xpath("//footer[@id='colophon']"));
		if(fot.isDisplayed()) {
			System.out.println("Footer is Displayed");
		}
		else {
			System.out.println("Footer is Not Displayed");
		}
		
		// verfying footer quick links 
		// Home button :
				WebElement hom1 = driver.findElement(By.xpath("(//a[text()='HOME'])[2]"));
				System.out.println("Button name is :" + hom1.getText());
				hom1.click();
				System.out.println("Footer Home button clicked");

				// about us button :
				WebElement abt1 = driver.findElement(By.xpath("(//a[text()='ABOUT US'])[2]"));
				System.out.println("Button name is :" + abt1.getText());
				abt1.click();
				System.out.println("Footer About us button clicked");

				
				// Services button :
				WebElement srv1 = driver.findElement(By.xpath("(//a[text()='SERVICES'])[2]"));
				System.out.println("Button name is :" + srv1.getText());
				srv1.click();
				System.out.println("Footer Home button clicked");

				// Portfolio button :
				WebElement prt1 = driver.findElement(By.xpath("(//a[text()='PORTFOLIO'])[2]"));
				System.out.println("Button name is :" + prt1.getText());
				prt1.click();
				System.out.println("Footer Portfolio button clicked");

				// Contact us button :
				WebElement cnt1 = driver.findElement(By.xpath("(//a[text()='CONTACT US'])[2]"));
				System.out.println("Button name is :" + cnt1.getText());
				cnt1.click();
				System.out.println("Footer Contact us  button clicked");
				
				driver.quit();
		        System.out.println("Browser closed succesfully");
				
				 // Get the current date and time
		        LocalDateTime now = LocalDateTime.now();

		        // Format the timestamp
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		        String formattedTimestamp = now.format(formatter);

		        // Print the timestamp
		        System.out.println("Current Timestamp: " + formattedTimestamp);
		        
		        

	}

}
