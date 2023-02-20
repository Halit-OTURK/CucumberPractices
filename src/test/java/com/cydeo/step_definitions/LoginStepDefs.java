package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LoginStepDefs {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {

        Driver.getDriver().findElement(By.id("inputEmail")).sendKeys();

        System.out.println("email");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        Driver.getDriver().findElement(By.id("inputPassword")).sendKeys();
        System.out.println("password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
      Driver.getDriver().findElement(By.xpath("//button[.='Sign in']")).click();
        System.out.println("submit");

    }


    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("email");
        Driver.getDriver().findElement(By.id("inputEmail")).sendKeys();
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        Driver.getDriver().findElement(By.id("inputPassword")).sendKeys();
    }

    @When("user enters admin username")
        public void user_enters_admin_username() {
        System.out.println("email");
        Driver.getDriver().findElement(By.id("inputEmail")).sendKeys();
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        Driver.getDriver().findElement(By.id("inputPassword")).sendKeys();
    }


    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
      //  Driver.getDriver().get("https://library1.cydeo.com/login.html");
        System.out.println("entering");
    }
}
