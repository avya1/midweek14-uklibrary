package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uk.co.library.utility.Utilities;

public class ResultPage extends Utilities {
/*
Locators - resultText
  Method - verifyTheResults(String expected)
 */
    @CacheLookup
    @FindBy(xpath = "//div[@class='search-header__title']")
    WebElement resultTest;
    public void verifyTheResults(String expected){
        Assert.assertTrue(expected.equals(resultTest));
    }
}
