package FunctionalTesting;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutumationScriptForFunctionalityTesting {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://animationzoom.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 1: Launch the AnimationZoom homepage
		driver.get("https://animationzoom.com/");
		driver.manage().window().maximize();
		System.out.println("Homepage loaded successfully.");

		// Step 2: Verify the page title
		String expectedTitle = "AnimationZoom"; 
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Page title verification passed: " + actualTitle);
		} else {
			System.out.println("Page title verification failed. Actual title: " + actualTitle);
		}

		// Step 3: Verify the logo is displayed
		WebElement logo = driver.findElement(By.xpath(
				"//a[@href='https://animationzoom.com/']/img[@class='attachment-large size-large wp-image-28']")); 
																												
		if (logo.isDisplayed()) {
			System.out.println("Logo is visible.");
		} else {
			System.out.println("Logo is not visible.");
		}

		// Step 4: Verify the navigation bar links
		WebElement navBar = driver.findElement(By.xpath(
				"//div[@class='elementor-element elementor-element-9777b7f hfe-nav-menu__align-left hfe-submenu-icon-arrow hfe-submenu-animation-none hfe-link-redirect-child hfe-nav-menu__breakpoint-tablet elementor-widget elementor-widget-navigation-menu']//nav[@class='hfe-nav-menu__layout-horizontal hfe-nav-menu__submenu-arrow']")); 
		if (navBar.isDisplayed()) {
			System.out.println("Navigation bar is displayed.");
		} else {
			System.out.println("Navigation bar is not displayed.");
		}

		// Step 5: Verify the slide show
		WebElement bn = driver.findElement(By.xpath(
				"//div[@class='elementor-column elementor-col-100 elementor-top-column elementor-element elementor-element-cd699a0']//div[@class='elementor-widget-wrap elementor-element-populated']"));
		if (bn.isDisplayed()) {
			System.out.println("Banner is Displayed");
		} else {
			System.out.println("Banner is Not Displayed");
		}

		// Step 6: Verify the Name text field
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		if (name.isDisplayed()) {
			System.out.println("Name Textbox is Displayed");
		} else {
			System.out.println("Name Textbox is Not Displayed");
		}
		name.sendKeys("123");

		// Step 7: Verify the Email text field
		WebElement mail = driver.findElement(By.xpath("//input[@name='email-1']"));
		if (mail.isDisplayed()) {
			System.out.println("Mail Textbox is Displayed");
		} else {
			System.out.println("Mail Textbox is Not Displayed");
		}
		mail.sendKeys("556@7");

		// Step 8: Verify the Mobile text field
		WebElement mob = driver.findElement(By.xpath("//input[@name='phone-1']"));
		if (mob.isDisplayed()) {
			System.out.println("Mobile Textbox is Displayed");
		} else {
			System.out.println("Mobile Textbox is Not Displayed");
		}
		mob.sendKeys("matrs");

		// Step 9: Verify the Website text field
		WebElement web = driver.findElement(By.xpath("//input[@name='text-1']"));
		if (web.isDisplayed()) {
			System.out.println("Website Textbox is Displayed");
		} else {
			System.out.println("Website Textbox is Not Displayed");
		}
		web.sendKeys("7522");

		// Step 10: Verify the comment text field
		WebElement com = driver.findElement(By.xpath("//textarea[@placeholder='Comment']"));
		if (com.isDisplayed()) {
			System.out.println("Comment Textbox is Displayed");
		} else {
			System.out.println("Comment Textbox is Not Displayed");
		}
		com.sendKeys("%$#@");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		// Step 11: Verify the submit button
		WebElement btn = driver.findElement(By.xpath("//button[text()='Submit']"));
		btn.click();
		if(btn.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else {
			System.out.println("Submit button is Not enabled");
		}
		
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		 
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
				
				// workspace for Contact us button 
				
				WebElement selec = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
				selec.click();
				driver.findElement(By.xpath("(//li[@class='select2-results__option select2-results__option--selectable'])[2]")).click();
			
				driver.findElement(By.xpath("//input[@name='name-1']")).sendKeys("85455");
				System.out.println("Name Entered");
				
				driver.findElement(By.xpath("//input[@name='email-1']")).sendKeys("98#885)");
				System.out.println("Email Entered");
				
				
				
				driver.findElement(By.xpath("//input[@name='phone-1']")).sendKeys("H85%2850");
				System.out.println("Phone Number Entered");
				
				driver.findElement(By.xpath("//textarea[@name='textarea-1']")).sendKeys("855HW024");
				System.out.println("Comment Number Entered");
				
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
				
				driver.switchTo().defaultContent();
				
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				
				// BLOG button :
				WebElement blog = driver.findElement(By.xpath("//a[text()='BLOG']"));
				System.out.println("Button name is :" + blog.getText());
				blog.click();
				System.out.println("BLOG button clicked");
		
		// Screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File input = ts.getScreenshotAs(OutputType.FILE);
	    File src = new File("C:\\Users\\gpman.000\\Documents\\GOOGLE DRIVE\\Eclipse\\eclipse-workspace\\SeleniumNov2024\\ScreenShots\\FunctionalTesting.png");
	    org.openqa.selenium.io.FileHandler.copy(input, src);
	    
		
		
		// Step 12: Verify the Footer
		WebElement fot = driver.findElement(By.xpath("//footer[@id='colophon']"));
		if(fot.isDisplayed()) {
			System.out.println("Footer is Displayed");
		}
		else {
			System.out.println("Footer is Not Displayed");
		}
		
		// Step 13: Verify that clicking a valid link redirects correctly
		driver.findElement(By.xpath("(//a[text()='ABOUT US'])[1]")).click();
		System.out.println("Clicked on 'About Us' link.");
		
		//close the browser 
		driver.quit();
		System.out.println("Browser successfully closed");
		 
		 // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the timestamp
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTimestamp = now.format(formatter);

        // Print the timestamp
        System.out.println("Current Timestamp: " + formattedTimestamp);

	}
}

