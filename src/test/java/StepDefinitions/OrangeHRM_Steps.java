package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class OrangeHRM_Steps {
    DialogContent dc=new DialogContent();
    JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
    @Given("Navigate to Basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Login with admin username and  password.")
    public void loginWithAdminUsernameAndPassword() {
        dc.findAndSend("username","Admin");
        dc.findAndSend("password","admin123");
        dc.findAndClick("submitButton");
    }

    @And("Clicks on the Recruitment menu.")
    public void clicksOnTheRecruitmentMenu() {
        dc.verifyText("dashboard","Dashboard");
        dc.findAndClick("recruitmentClick");
    }

    @And("Clicks in the Vacancies field.")
    public void clicksInTheVacanciesField() {
        dc.findAndClick("vacanciesClick");
    }

    @And("Clicks the Add button")
    public void clicksTheAddButton() {
            GWD.Bekle();
            double scrollingPrecision=0;

            String doubleCevirilmisHali=String.valueOf(scrollingPrecision).replace(".",",");
            String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                    + "var elementTop = arguments[0].getBoundingClientRect().top;"
                    + "window.scrollBy(0, elementTop-(viewPortHeight/"+doubleCevirilmisHali+"));";

            js.executeScript(scrollElementIntoMiddle, dc.addScroll);
            dc.addButton.click();
    }

    @And("Enters Oihan value in Vacancy name field")
    public void entersOihanValueInVacancyNameField() {
        wait.until(ExpectedConditions.urlContains("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/addJobVacancy"));
        dc.findAndSend("vacancyName","iker");
    }

    @And("Enters the value of Software Engineer in the Job Title field.")
    public void entersTheValueOfSoftwareEngineerInTheJobTitleField() {
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        dc.jobTitleSelect.click();
        GWD.Bekle();

        Actions actions=new Actions(GWD.getDriver());
        actions.sendKeys("s")
                .sendKeys("s")
                .sendKeys("s")
                .sendKeys("s")
                .build().perform();
        GWD.Bekle();
        actions.keyDown(Keys.ENTER).build().perform();

    }

    @And("We are looking for a skilled software engineer to join our team. enters the value.")
    public void weAreLookingForASkilledSoftwareEngineerToJoinOurTeamEntersTheValue() {
        GWD.Bekle();
        double scrollingPrecision=0;

        String doubleCevirilmisHali=String.valueOf(scrollingPrecision).replace(".",",");
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/"+doubleCevirilmisHali+"));";

        js.executeScript(scrollElementIntoMiddle, dc.description);
        dc.findAndSend("description","We are looking for a skill software engineer to join our team. enters the value.");

    }

    @And("Enters John Smith in the Hiring Manager field.")
    public void entersJohnSmithInTheHiringManagerField() {
        GWD.Bekle();
        dc.findAndSend("hiringManager","John Smith");
        GWD.Bekle();
        dc.hiringManagerSelect.click();
    }

    @And("Enters the value five in the Number of Positions field.")
    public void entersTheValueFiveInTheNumberOfPositionsField() {
        GWD.Bekle();
        dc.findAndSend("numberOfPositions","15");
    }

    @And("Clicks the Save button.")
    public void clicksTheSaveButton() {
        GWD.Bekle();
        dc.findAndClick("saveButton");
    }

    @Then("The user sees that the job posting has been successfully added.")
    public void theUserSeesThatTheJobPostingHasBeenSuccessfullyAdded() {
        dc.verifyText("messageVerify","Successfully Saved");

    }
    @Then("Account Log out")
    public void accountLogOut() {
        dc.findAndClick("accountIcon");
        dc.findAndClick("logOut");
    }  // DENEME
}
