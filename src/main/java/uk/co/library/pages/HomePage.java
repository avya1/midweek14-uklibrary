package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utilities;

public class HomePage extends Utilities {
    /*
     Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
  Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
  enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
  clickOnFindJobsButton().
     */
    @CacheLookup
    @FindBy(id="keywords")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(id="location")
    WebElement location;
    @CacheLookup
    @FindBy(id="distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id="toggle-hp-search")
    WebElement moreSearchLinkOption;
    @CacheLookup
    @FindBy(id="salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id="salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id="salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id="tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id="hp-search-btn")
    WebElement findJobBtn;
    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;



    public void setAcceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }
    public void enterJobTitle(String jobTitle){
        CustomListeners.node.log(Status.PASS, "JobTitle : " + this.jobTitle.getText());
        Reporter.log("JobTitle" + this.jobTitle.getText() + "<br>");
        sendTextToElement(this.jobTitle,jobTitle);

    }
    public void enterLocation(String location){
        CustomListeners.node.log(Status.PASS, "Location: " + this.location.getText());
        Reporter.log("Location" + this.location.getText() + "<br>");
        sendTextToElement(this.location,location);
    }
    public void  selectDistance(String distance){
        CustomListeners.node.log(Status.PASS, "Distance: " + distanceDropDown.getText());
        Reporter.log("Distance" + distanceDropDown.getText() + "<br>");
        clickOnElement(distanceDropDown);
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
       // sendTextToElement(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        CustomListeners.node.log(Status.PASS, "click on : " + moreSearchLinkOption.getText());
        Reporter.log("click on" + moreSearchLinkOption.getText() + "<br>");
        clickOnElement(moreSearchLinkOption);
    }
    public void enterMinSalary(String minSalary){
        CustomListeners.node.log(Status.PASS, "Minimum Salary : " + salaryMin.getText());
        Reporter.log("Minimum Salary" + salaryMin.getText() + "<br>");
       sendTextToElement(salaryMin,minSalary);
    }
    public void  enterMaxSalary(String maxSalary)
    {
        CustomListeners.node.log(Status.PASS, "Maximum Salary: " + salaryMax.getText());
        Reporter.log("Maximum Salary" + salaryMax.getText() + "<br>");
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        CustomListeners.node.log(Status.PASS, "salary type : " + salaryTypeDropDown.getText());
        Reporter.log("salary type" + salaryTypeDropDown.getText() + "<br>");
        clickOnElement(salaryTypeDropDown);
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
       // sendTextToElement(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        CustomListeners.node.log(Status.PASS, "Job Type : " + jobTypeDropDown.getText());
        Reporter.log("Job Type" + jobTypeDropDown.getText() + "<br>");
        clickOnElement(jobTypeDropDown);
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
       // sendTextToElement(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton(){
        CustomListeners.node.log(Status.PASS, "click on  : " + findJobBtn.getText());
        Reporter.log("click on" + findJobBtn.getText() + "<br>");
        clickOnElement(findJobBtn);
    }

}
