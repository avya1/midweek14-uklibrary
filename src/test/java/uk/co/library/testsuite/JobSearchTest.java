package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        resultPage=new ResultPage();
    }
@Test(dataProvider = "dataSet", dataProviderClass = TestData.class,groups = {"smoke","sanity","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result){
    /*
    enter job title 'jobTitle'
    enter Location 'location'
    select distance 'distance'
	click on moreSearchOptionsLink
    enter salaryMin 'salaryMin'
    enter salaryMax 'salaryMax'
	select salaryType 'salaryType'
	select jobType 'jobType'
	click on 'Find Jobs' button
	verify the result 'result'
     */
    homePage.setAcceptCookies();
    homePage.enterJobTitle(jobTitle);
    homePage.enterLocation(location);
    homePage.selectDistance(distance);
    homePage.clickOnMoreSearchOptionLink();
    homePage.enterMinSalary(salaryMin);
    homePage.enterMaxSalary(salaryMax);
    homePage.selectSalaryType(salaryType);
    homePage.selectJobType(jobType);
    homePage.clickOnFindJobsButton();
    resultPage.verifyTheResults(result);
}
}
