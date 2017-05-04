package testfuseplm;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WrapperClass {
	RemoteWebDriver driver;
	String strng = null;
	String part = null;
	String product = null;
	/**
	 * Launch the desired browser and click the URL
	 * 
	 * @param Browser
	 * @param URL
	 * @throws InterruptedException 
	 */
	public void launchBroswer(String Browser, String URL) {
		if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Firefox driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	/**
	 * Function used to pass the Web element ID and Value to entered in text box
	 * 
	 * @param id
	 *            = Web Element ID
	 * @param sendvalue
	 *            = Value entered in Text Box
	 * @throws IOException
	 */
	public void sendvaluebyid(String id, String sendvalue) throws IOException {
		try {
			driver.findElementById(id).clear();
			driver.findElement(By.id(id)).sendKeys(sendvalue);
			
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(id);
		}
	}
	public void sendvaluebyeid(String id, String sendvalue) throws IOException {
		try {
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(sendvalue);
			driver.findElement(By.id(id)).sendKeys(Keys.ENTER);
			
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(id);
		}
	}
		

	public void sendvaluebyidnum(String id, Integer i) throws IOException {
		try {
			String t = i.toString();
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(t);
			
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(id);
		}
	}
	public void sendvaluebyidbignum(String id, long i) throws IOException {
		try {
			String t = Long.toString(i);			
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(t);
			
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(id);
		}
	}
	/**
	 * Function used to pass the Web element Name and Value to entered in text
	 * box
	 * 
	 * @param name=
	 *            Web Element name
	 * @param sendvalue
	 *            = Value entered in Text Box
	 * @throws IOException
	 */
	public void sendvaluebyname(String name, String sendvalue) throws IOException {
		try {
			driver.findElement(By.name(name)).clear();
			driver.findElement(By.name(name)).sendKeys(sendvalue);
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(name);
		}
	}

	/**
	 * Function used to pass the Web element X-path and Value to entered in text
	 * box
	 * 
	 * @param xpath=
	 *            Web Element's X-path
	 * @param sendvalue
	 *            = Value entered in Text Box
	 * @throws IOException
	 */
	public void sendvaluebyxpath(String xpath, String sendvalue) throws IOException {
		try {
			driver.findElement(By.xpath(xpath)).clear();
			driver.findElement(By.xpath(xpath)).sendKeys(sendvalue);
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(sendvalue);
		}
	}

	public void sendpartvaluebyxpathanddownclick(String xpath) throws IOException {
		try {
			WebElement we = driver.findElement(By.xpath(xpath));
			we.sendKeys(part);
            Actions builder = new Actions(driver);
            Action mouseOverHome = builder.click(we).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
			mouseOverHome.perform();
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(part);
		}
	}
	public void sendproductvaluebyxpathanddownclick(String xpath) throws IOException {
		try {
			WebElement we = driver.findElement(By.xpath(xpath));
			we.sendKeys(product);
            Actions builder = new Actions(driver);
            Action mouseOverHome = builder.click(we).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
			mouseOverHome.perform();
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(product);
		}
	}
	public void sendvaluebyxpathand2downclick(String xpath, String sendvalue) throws IOException {
		try {
			WebElement we = driver.findElement(By.xpath(xpath));
			we.sendKeys(sendvalue);
            Actions builder = new Actions(driver);
            Action mouseOverHome = builder.click(we).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
			mouseOverHome.perform();
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(sendvalue);
		}
	}
	/**
	 * Function used to pass the Web element Tag name and Value to entered in
	 * text box
	 * 
	 * @param Tagname
	 *            = Tag Name of the Web Element
	 * @param sendvaluesendvalue
	 *            = Value entered in Text Box
	 * @throws IOException
	 */
	public void sendvaluebyTagname(String Tagname, String sendvalue) throws IOException {
		try {
			driver.findElement(By.tagName(Tagname)).clear();
			driver.findElement(By.tagName(Tagname)).sendKeys(sendvalue);
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(Tagname);
		}
	}

	/**
	 * Function used to pass the Web element Class Name and Value to entered in
	 * text box
	 * 
	 * @param classname=
	 *            Class Name of the Web Element
	 * @param sendvaluesendvalue
	 *            = Value entered in Text Box
	 * @throws IOException
	 */
	public void sendvaluebyclassname(String classname, String sendvalue) throws IOException {
		try {
			driver.findElement(By.className(classname)).clear();
			driver.findElement(By.className(classname)).sendKeys(sendvalue);
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(classname);
		}
	}

	/**
	 * Function used to pass the Web element Class Name and Value to entered in
	 * text box
	 * 
	 * @param selector
	 * @param sendvalue
	 * @throws IOException
	 */
	public void sendvaluebyCssselector(String selector, String sendvalue) throws IOException {
		try {
			driver.findElement(By.cssSelector(selector)).clear();
			driver.findElement(By.cssSelector(selector)).sendKeys(sendvalue);
		} catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		} finally {
			takesnapshot(selector);
		}
	}

	// To close the single opened browser which opened by Selenium
	public void closeBrowser() {
		driver.close();
	}

	// To close all the opened browser which opened by Selenium
	public void closeAllBrowsers() {
		driver.quit();
	}

	// Wait Until the Browser page loads
	public void waitTillBrowserLoads(int limit) {
		driver.manage().timeouts().implicitlyWait(limit, TimeUnit.SECONDS);
	}

	/**
	 * Click the Web Element by possible locator
	 */

	public void clickByXpath(String xpath) {
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + xpath + " here");
		}
	}


	public void clickByCategoryXpath(String xpath) {
		try {
			WebElement we = driver.findElement(By.xpath(xpath));
            Actions builder = new Actions(driver);
            @SuppressWarnings("deprecation")
			Action mouseOverHome = builder.click(we).pause(2000).sendKeys(Keys.ENTER).build();
			mouseOverHome.perform();
			
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + xpath + " here");
		}
	}

	public void clickByHDEmXpath(String xpath) {
		try {
			WebElement we = driver.findElement(By.xpath(xpath));
            Actions builder = new Actions(driver);
            Action mouseOverHome = builder.click(we).sendKeys(Keys.ESCAPE).build();
			mouseOverHome.perform();
			
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + xpath + " here");
		}
	}
	public void clickByid(String id) {
		try {
			driver.findElement(By.id(id)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + id + " here");
		}
	}

	public void clickByname(String name) {
		try {
			driver.findElement(By.name(name)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + name + " here");
		}
	}

	public void clickBytagname(String tagname) {
		try {
			driver.findElement(By.tagName(tagname)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + tagname + " here");
		}
	}

	public void clickBycssSelector(String selector) {
		try {
			driver.findElement(By.cssSelector(selector)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + selector + " here");
		}
	}

	public void clickByclassname(String classname) {
		try {
			driver.findElement(By.className(classname)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + classname + " here");
		}
	}

	public void clickBylinktext(String text) {
		try {
			driver.findElement(By.linkText(text)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + text + " here");
		}
	}

	public void clickBypartiallinktext(String text) {
		try {
			driver.findElement(By.partialLinkText(text)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + text + " here");
		}
	}

	public void takesnapshot(String Snapshot) throws IOException {
		File snaps = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snaps, new File("./Screenshots/" + Snapshot + ".png"), true);
	}

	public void selectByid_lastIndex(String element_id) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.id(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			int jobrolesize = jobrole_list.getOptions().size();
			jobrole_list.selectByIndex(jobrolesize - 1);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectById_Index(String element_id, int i) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.id(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByIndex(i);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index " + i);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByid_Value(String element_id, String Value) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.id(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByValue(Value);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + Value);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByid_Visibletext(String element_id, String text) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.id(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByVisibleText(text);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + text);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByXpath_lastIndex(String element_id) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.xpath(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			int jobrolesize = jobrole_list.getOptions().size();
			jobrole_list.selectByIndex(jobrolesize - 1);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByXpath_Index(String element_id, int i) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.xpath(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByIndex(i);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index " + i);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByXpath_Value(String element_id, String Value) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.xpath(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByValue(Value);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + Value);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByXpath_Visibletext(String element_id, String text) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.xpath(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByVisibleText(text);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + text);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByTag_lastIndex(String element_id) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.tagName(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			int jobrolesize = jobrole_list.getOptions().size();
			jobrole_list.selectByIndex(jobrolesize - 1);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByTag_Index(String element_id, int i) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.tagName(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByIndex(i);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index " + i);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByTag_Value(String element_id, String Value) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.tagName(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByValue(Value);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + Value);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByTag_Visibletext(String element_id, String text) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.tagName(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByVisibleText(text);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + text);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByName_lastIndex(String element_id) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.name(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			int jobrolesize = jobrole_list.getOptions().size();
			jobrole_list.selectByIndex(jobrolesize - 1);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByName_Index(String element_id, int i) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.name(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByIndex(i);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index " + i);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByName_Value(String element_id, String Value) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.name(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByValue(Value);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + Value);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByName_Visibletext(String element_id, String text) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.name(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByVisibleText(text);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + text);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByClass_lastIndex(String element_id) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.className(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			int jobrolesize = jobrole_list.getOptions().size();
			jobrole_list.selectByIndex(jobrolesize - 1);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByClass_Index(String element_id, int i) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.className(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByIndex(i);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Cannot locate option with index " + i);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByClass_Value(String element_id, String Value) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.className(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByValue(Value);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + Value);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
		}
	}

	public void selectByClass_Visibletext(String element_id, String text) throws IOException {
		try {
			WebElement dropdown_jobrole = driver.findElement(By.className(element_id));
			Select jobrole_list = new Select(dropdown_jobrole);
			jobrole_list.selectByVisibleText(text);
		} catch (NoSuchElementException e) {
			System.out.println(" Cannot locate option with value: " + text);
		} catch (NotFoundException e) {
			System.out.println("Not able to recognize Webelement " + element_id + " here");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			takesnapshot(element_id);
	}
	}
	
   public void mouseHoverByXpath(String xpath) {
	try {
		Actions mouseAction = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(xpath));
		mouseAction.moveToElement(we).build().perform();
		System.out.println("The xpath:"+xpath+" is moused over successfully");

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void mouseHoverdownByXpath(String xpath) {
	try {
		WebElement we = driver.findElement(By.xpath(xpath));
		we.sendKeys(Keys.ARROW_DOWN.ENTER);
		System.out.println("The xpath:"+xpath+" is moused over successfully");

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
	   public void mouseHoverlocXpath(String xpath) {
			try {
				WebElement we = driver.findElement(By.xpath(xpath));
				Actions mouseAction = new Actions(driver);
				Actions seriesOfActions = mouseAction.keyDown(we,Keys.ARROW_DOWN).keyDown(we,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
				seriesOfActions.build().perform();
//				mouseAction.moveByOffset(1300,30 ).click().build().perform();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	public void doubleclickbyXpath(String xpath) {
					try {
						WebElement we = driver.findElement(By.xpath(xpath));
						Actions mouseAction = new Actions(driver);
						Actions seriesOfActions = mouseAction.doubleClick(we);
						seriesOfActions.build().perform();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
	
}
	   public void escape() {
			try {
				Actions mouseAction = new Actions(driver);
				Actions seriesOfActions = mouseAction.sendKeys(Keys.ESCAPE);
				seriesOfActions.build().perform();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	
}
	   public void verifytext(String xpath){
	   try {
	   WebElement element = driver.findElement(By.xpath(xpath));
	   strng= element.getText();
	   System.out.println(strng);
//	   Assert.assertEquals("Google Search", strng);
	   } catch(Exception e){
		   e.printStackTrace();
	   }
	   }
	   public void partnumber(String xpath){
		   try {
		   WebElement element = driver.findElement(By.xpath(xpath));
		   part= element.getText();
		   System.out.println(part);
		   } catch(Exception e){
			   e.printStackTrace();
		   }
		   }
	   public void productnumber(String xpath){
		   try {
		   WebElement element = driver.findElement(By.xpath(xpath));
		   product= element.getText();
		   System.out.println(product);
//		   Assert.assertEquals("Google Search", strng);
		   } catch(Exception e){
			   e.printStackTrace();
		   }
		   }
	   public void scroll(){
		   try {
			   JavascriptExecutor jse = (JavascriptExecutor)driver;
			   jse.executeScript("window.scrollBy(250,250)", "");
		   } catch(Exception e){
			   e.printStackTrace();
		   }
		   }
		 

	   public void enter() {
			try {
				Actions mouseAction = new Actions(driver);
				mouseAction.sendKeys(Keys.ENTER);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	   
	   public void dragAnddropByXpath(String abc,String def) {
		     try {
		       Actions act = new Actions(driver);
		      WebElement ele_drag = driver.findElement(By.xpath(abc));
		      WebElement ele_drop = driver.findElement(By.xpath(def));
		      act.clickAndHold(ele_drag).moveToElement(ele_drop).pause(2000).release(ele_drop).build().perform();
		     } catch (Exception e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		     }

		    }
	@SuppressWarnings("deprecation")
	public void clickandholdByXpath(String a,String b) {
	try {
		WebElement src = driver.findElement(By.xpath(a));
		WebElement des = driver.findElement(By.xpath(b));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.clickAndHold(src).pause(2000).moveToElement(des).pause(5000).release(des).pause(2000);
		seriesOfActions.build().perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}