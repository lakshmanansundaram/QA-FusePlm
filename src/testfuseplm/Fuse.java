package testfuseplm;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fuse extends WrapperClass {
	@Test(priority =1)
	public void part() throws IOException, InterruptedException {
		//Parts
		clickByXpath("//div[@id='layout-vertical-navigation']/md-sidenav/ms-navigation[3]/ul/li/ul/li[2]/div/a");
		Thread.sleep(3000);
		//Create Part
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div/div[2]/div[2]/button");
		Thread.sleep(3000);
		sendvaluebyxpath("/html/body/div/div/div/div[2]/md-dialog/form/md-dialog-content/md-input-container[1]/input","sung");
		Thread.sleep(2000);
		clickByCategoryXpath("//div[@id='layout-vertical-navigation']/div/div[2]/md-dialog/form/md-dialog-content/md-input-container[2]/md-select");
		Thread.sleep(3000);
		clickByXpath("//div[@id='layout-vertical-navigation']/div/div[2]/md-dialog/form/md-dialog-actions/div/button");
		verifytext("/html/body/md-toast/div[@class='md-toast-content']");
		Thread.sleep(3000);
		//Enter Description and Save the Part Details
		sendvaluebyxpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div[2]/md-tabs/md-tabs-content-wrapper/md-tab-content/div/md-content/div/div/div/form/div/md-input-container/input","TestPartDescrtiption");
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div/div/div[2]/button[@class='md-raised md-button md-default-theme md-ink-ripple']");
		verifytext("/html/body/md-toast/div[@class='md-toast-content']");
		//Change Status
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div/div/div[2]/md-menu/button[@class='white-fg md-button md-default-theme md-ink-ripple']");
		clickByXpath("//div[@class='_md md-open-menu-container md-whiteframe-z2 md-default-theme md-active md-clickable']/md-menu-content/md-menu-item/button");
		clickByXpath("//body/div[4]/md-dialog/md-dialog-actions/button[2]");
		Thread.sleep(3000);
		//Incremental Revision
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div/div/div[2]/button[@class='white-fg md-button md-default-theme md-ink-ripple']");
		clickByXpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]");
		sendvaluebyxpath("//div[@id='content-container']/div[2]/md-dialog/form/md-dialog-content/md-input-container/input", "PartNotes");
		clickByXpath("//div[@id='content-container']/div[2]/md-dialog/form/md-dialog-actions/div/button");
		Thread.sleep(3000);
		verifytext("/html/body/md-toast/div[@class='md-toast-content']");
		Thread.sleep(5000);
		//Move to parts and click on Part
		clickByXpath("//div[@id='layout-vertical-navigation']/md-sidenav/ms-navigation[3]/ul/li/ul/li[2]/div/a");
		Thread.sleep(3000);
		clickByXpath("/html/body/div/div/div/md-content/div[1]/div/div[2]/div/div/div[2]/div[1]/div/table/thead/tr/th[2]");
		Thread.sleep(3000);
		clickByXpath("/html/body/div/div/div/md-content/div[1]/div/div[2]/div/div/div[2]/div[1]/div/table/thead/tr/th[2]");
		partnumber("/html/body/div/div/div/md-content/div[1]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/a");
		clickByXpath("/html/body/div/div/div/md-content/div[1]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/a");
		Thread.sleep(3000);
		//Bill of Material
		clickByXpath("//div[@id='content-container']/md-content/div/div/div[2]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[5]");
		Thread.sleep(3000);
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div[2]/md-tabs/md-tabs-content-wrapper/md-tab-content[5]/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content/div/md-content/div/div/div/div/button");
		Thread.sleep(3000);
		sendpartvaluebyxpathanddownclick("//md-dialog[@class='contact-dialog-billofmaterial _md md-default-theme md-content-overflow md-transition-in']/form/md-dialog-content/md-input-container/md-chips/md-chips-wrap/div/div/md-autocomplete/md-autocomplete-wrap/input");
		clickByXpath("//md-dialog[@class='contact-dialog-billofmaterial _md md-default-theme md-content-overflow md-transition-in']/form/md-dialog-actions/div/button");
		verifytext("/html/body/md-toast/div[@class='md-toast-content']");
		Thread.sleep(3000);
	}
		@Test(priority = 2)
		public void product() throws IOException, InterruptedException {
		//Products
		clickByXpath("//div[@id='layout-vertical-navigation']/md-sidenav/ms-navigation[3]/ul/li/ul/li[1]/div/a/span");
		Thread.sleep(3000);
		//Create Product
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div[1]/div/div[1]/div[2]/div[2]/button");
		Thread.sleep(3000);
		sendvaluebyxpath("//div[@id='layout-vertical-navigation']/div/div[2]/md-dialog/form/md-dialog-content/md-input-container[1]/input", "Sam");
		Thread.sleep(2000);
		clickByCategoryXpath("//div[@id='layout-vertical-navigation']/div/div[2]/md-dialog/form/md-dialog-content/md-input-container[2]/md-select");
		Thread.sleep(3000);
		clickByXpath("/html/body/div[1]/div/div/div[2]/md-dialog/form/md-dialog-actions/div/button");
		verifytext("/html/body/md-toast/div[@class='md-toast-content']");
		Thread.sleep(3000);
		//Enter Description and Save the Product Details
		sendvaluebyxpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div[2]/md-tabs/md-tabs-content-wrapper/md-tab-content/div/md-content/div/div/div/form/div/md-input-container/input","TestProductDescription");
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div/div/div[2]/button[@class='md-raised md-button md-default-theme md-ink-ripple']");
		verifytext("/html/body/md-toast/div[@class='md-toast-content']");
		//Change Status
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div/div/div[2]/md-menu/button[@class='white-fg md-button md-default-theme md-ink-ripple']");
		clickByXpath("//div[@class='_md md-open-menu-container md-whiteframe-z2 md-default-theme md-active md-clickable']/md-menu-content/md-menu-item/button");
		clickByXpath("//body/div[4]/md-dialog/md-dialog-actions/button[2]");
		Thread.sleep(3000);
		//Incremental Revision
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div/div/div[2]/button[@class='white-fg md-button md-default-theme md-ink-ripple']");
		clickByXpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]");
		sendvaluebyxpath("//div[@id='content-container']/div[2]/md-dialog/form/md-dialog-content/md-input-container/input", "ProductNotes");
		clickByXpath("//div[@id='content-container']/div[2]/md-dialog/form/md-dialog-actions/div/button");
		Thread.sleep(3000);
		verifytext("/html/body/md-toast/div[@class='md-toast-content']");
		Thread.sleep(3000);
		//Move to products and click on Product
		clickByXpath("//div[@id='layout-vertical-navigation']/md-sidenav/ms-navigation[3]/ul/li/ul/li[1]/div/a/span");
		Thread.sleep(3000);
		clickByXpath("/html/body/div/div/div/md-content/div[1]/div/div[2]/div/div/div[2]/div[1]/div/table/thead/tr/th[2]");
		Thread.sleep(3000);
		clickByXpath("/html/body/div/div/div/md-content/div[1]/div/div[2]/div/div/div[2]/div[1]/div/table/thead/tr/th[2]");
		productnumber("/html/body/div/div/div/md-content/div[1]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/a");
		clickByXpath("/html/body/div/div/div/md-content/div[1]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/a");
		Thread.sleep(3000);
		//Bill of Material
		clickByXpath("//div[@id='content-container']/md-content/div/div/div[2]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[5]");
		Thread.sleep(3000);
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div[2]/md-tabs/md-tabs-content-wrapper/md-tab-content[5]/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content/div/md-content/div/div/div/div/button");
		Thread.sleep(3000);
		sendproductvaluebyxpathanddownclick("//md-dialog[@class='contact-dialog-billofmaterial _md md-default-theme md-content-overflow md-transition-in']/form/md-dialog-content/md-input-container/md-chips/md-chips-wrap/div/div/md-autocomplete/md-autocomplete-wrap/input");
		clickByXpath("//md-dialog[@class='contact-dialog-billofmaterial _md md-default-theme md-content-overflow md-transition-in']/form/md-dialog-actions/div/button");
		verifytext("/html/body/md-toast/div[@class='md-toast-content']");
		Thread.sleep(3000);
		}
		@Test (priority = 3)
		public void boards() throws IOException, InterruptedException {
		//Boards
		clickByXpath("//div[@id='layout-vertical-navigation']/md-sidenav/ms-navigation[2]/ul/li/ul/li/div/a");
		Thread.sleep(3000);
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div/div/div[@class='board-list-item ng-scope layout-align-center-center layout-column']");
		//Create Card
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/md-content/div/div/div/div[3]/ms-sb-add-card/div[@class='ms-sb-add-card-button layout-align-start-center layout-row']");
		sendvaluebyxpath("//div[@id='layout-vertical-navigation']/div/md-content/div/md-content/div/div/div/div[3]/ms-sb-add-card/div[2]/form/md-input-container/input", "Dell");
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/md-content/div/div/div/div[3]/ms-sb-add-card/div[2]/form/div/button");
		Thread.sleep(3000);
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/md-content/div/div/div/div[3]/ms-sb-add-card/div[2]/form/div/button[2]");
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/md-content/div/div/div/div[2]/div");
		//Card Details
		sendvaluebyxpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div[4]/md-dialog/md-dialog-content/div/div[2]/md-input-container/div/textarea", "CardDescription");
		sendpartvaluebyxpathanddownclick("//div[@id='layout-vertical-navigation']/div/md-content/div/div[4]/md-dialog/md-dialog-content/div/div[3]/div/div/div[2]/md-chips/md-chips-wrap/div/div/md-autocomplete/md-autocomplete-wrap/input");
		Thread.sleep(2000);
		sendproductvaluebyxpathanddownclick("//div[@id='layout-vertical-navigation']/div/md-content/div/div[4]/md-dialog/md-dialog-content/div/div[3]/div/div/div[2]/md-chips/md-chips-wrap/div/div/md-autocomplete/md-autocomplete-wrap/input");
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div[4]/md-dialog/md-toolbar/div/div[2]/button[3]");
		Thread.sleep(3000);
		//Check the Status
		verifytext("//div[@id='content-container']/md-content/div/div[4]/md-dialog/md-dialog-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content/div/div/md-sidenav/md-content/div/button/div/div[2]/div[2]/div");
		verifytext("//div[@id='content-container']/md-content/div/div[4]/md-dialog/md-dialog-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content/div/div/md-sidenav/md-content/div/button[2]/div/div[2]/div[2]/div");
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div[4]/md-dialog/md-toolbar/div/div[2]/button[3]");
		Thread.sleep(3000);		
		clickByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/div[4]/md-dialog/md-toolbar/div/div[2]/a");
		Thread.sleep(5000);
		//Drag and Drop the card
		dragAnddropByXpath("//div[@id='layout-vertical-navigation']/div/md-content/div/md-content/div/div/div/div[2]/div","/html/body/div/div/div/md-content/div[1]/md-content/div/div[3]/div/div[2]/div");
		Thread.sleep(6000);
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		//Launch Browsers
		launchBroswer("chrome", "http://dev.fuseplm.com/login/aws");
		//Login
		sendvaluebyname("userEmail", "balaji.k@sybrant.com");
		sendvaluebyname("userPassword", "Great123");
		clickByXpath("//*[@id='login-form']/form/button");
		Thread.sleep(5000);
		//Escape from the Guide menu
		clickByHDEmXpath("/html/body/div[5]/div/div[5]/a[2]");
		Thread.sleep(5000);
		escape();
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		//Logout
		clickByXpath("/html/body/div/div/div/md-toolbar/div/div[2]/md-menu-bar/md-menu/button");	
		Thread.sleep(3000);
		clickByXpath("/html/body/div[3]/md-menu-content/md-menu-item[4]/button");
	}
}

		
		
