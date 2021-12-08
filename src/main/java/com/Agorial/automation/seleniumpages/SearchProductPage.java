package com.Agorial.automation.seleniumpages;

import com.Algorial.automation.BasePage;
import com.Algorial.automation.ConfigFileReader;
import com.Algorial.utils.CommonOp;
import com.Algorial.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchProductPage extends BasePage {
    CommonOp commonOp = new CommonOp(driver);

    By searchTextBox = By.xpath("//*[@id='twotabsearchtextbox']");
    By searchButton = By.xpath("//*[@id='nav-search-submit-button']");
    By firstProduct = By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div/h2/a/span");
    By productPrice = By.xpath("//*[@id='corePrice_desktop']/div/table/tbody/tr/td[2]/span[1]");

    public void enterProduct(String productName) {
        WebElement search = driver.findElement(searchTextBox);
        search.sendKeys(productName);
    }

    public void clickSearch() {
        WebElement search = driver.findElement(searchButton);
        search.click();
    }

    public void clickFirstProduct() {
        commonOp.Sleep(Constants.WAITING_TIME_HIGH);
        WebElement product = driver.findElement(firstProduct);
        product.click();
    }

    public boolean assertPrice() {
        boolean priceCheck = false;
        commonOp.Sleep(Constants.WAITING_TIME_HIGH);
        WebElement price = driver.findElement(productPrice);
        System.out.println(price.getText().replace("$", ""));
        if (Double.parseDouble(price.getText().replace("$", "")) > 100) {
            priceCheck = true;
        }
        return priceCheck;
    }

}
