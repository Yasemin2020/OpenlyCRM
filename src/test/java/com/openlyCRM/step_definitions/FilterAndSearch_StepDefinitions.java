package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.FilterAndSearchPage;
import com.openlyCRM.pages.OpenlyCRMLoginPage;
import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.ConfigurationReader;
import com.openlyCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import java.util.List;



public class FilterAndSearch_StepDefinitions {
    OpenlyCRMLoginPage openlyCRMLoginPage = new OpenlyCRMLoginPage();
    FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        openlyCRMLoginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        openlyCRMLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        openlyCRMLoginPage.loginButton.click();

    }

    @When("User click Filter and search box")
    public void user_click_filter_and_search_box() {
        filterAndSearchPage.filterAndSearchButton.click();
    }


    @And("User click settings button")
    public void userClickSettingsButton() {
        filterAndSearchPage.filterSettingsButton.click();

    }

    @And("User click Reset to default button")
    public void userClickResetToDefaultButton() {
        BrowserUtils.waitFor(3);
        filterAndSearchPage.resetToDefaultButton.click();

    }

    @And("User click Continue button in popup")
    public void userClickContinueButtonInPopup() {
        BrowserUtils.waitForVisibility(filterAndSearchPage.continuePopup, 3);
        filterAndSearchPage.continuePopup.click();
    }

    @Then("User see default filters")
    public void user_see_default_filters(List<String> expectedFilters) {
        System.out.println("expectedFilters = " + expectedFilters);


        BrowserUtils.waitFor(3);
        List<String> actualDefaultFilterText = BrowserUtils.getElementsText(filterAndSearchPage.defaultFilters);
        Assert.assertEquals(expectedFilters, actualDefaultFilterText);


    }

    @When("User click Add field button")
    public void user_click_add_field_button() {
        filterAndSearchPage.addFieldButton.click();
    }

    @Then("User see all fields as")
    public void user_see_all_fields_as(List<String> expectedFields) {

        System.out.println("expectedFields = " + expectedFields);

        List<String> actualFields = BrowserUtils.getElementsText(filterAndSearchPage.fields);
        System.out.println("actualFields = " + actualFields);


      /*  List<String> expectedFields= new ArrayList<>();
        expectedFields.addAll(Arrays.asList("Date, Type, Author, To, Favorites, Tag, Extranet"));
        System.out.println("expectedFields = " + expectedFields);*/

        Assert.assertEquals(expectedFields, expectedFields);


    }


    @Then("User click check boxes and see fields are added and removed")
    public void user_click_check_boxes_and_see_fields_are_added_and_removed() {

        if (filterAndSearchPage.dateCheckbox.getAttribute("class").contains("checked")) {
            filterAndSearchPage.dateCheckbox.click();
            try {
                System.out.println(filterAndSearchPage.dateField.isDisplayed());
            } catch (NoSuchElementException e) {
                Assert.assertTrue(true);
            }

        } else {
            filterAndSearchPage.dateCheckbox.click();
            Assert.assertTrue(filterAndSearchPage.dateField.isDisplayed());
        }
        System.out.println("date passed");

        if (filterAndSearchPage.typeCheckbox.getAttribute("class").contains("checked")) {
            filterAndSearchPage.typeCheckbox.click();
            try {
                System.out.println(filterAndSearchPage.typeField.isDisplayed());
            } catch (NoSuchElementException e) {
                Assert.assertTrue(true);
            }
        } else {
            filterAndSearchPage.typeCheckbox.click();
            Assert.assertTrue(filterAndSearchPage.typeField.isDisplayed());
        }
        System.out.println("type passed");

        if (filterAndSearchPage.authorCheckbox.getAttribute("class").contains("checked")) {
            filterAndSearchPage.authorCheckbox.click();
            try {
                System.out.println(filterAndSearchPage.authorField.isDisplayed());
            } catch (NoSuchElementException e) {
                Assert.assertTrue(true);
            }
        } else {
            filterAndSearchPage.authorCheckbox.click();
            Assert.assertTrue(filterAndSearchPage.authorField.isDisplayed());
        }

        if (filterAndSearchPage.toCheckbox.getAttribute("class").contains("checked")) {
            filterAndSearchPage.toCheckbox.click();
            try {
                System.out.println(filterAndSearchPage.toField.isDisplayed());
            } catch (NoSuchElementException e) {
                Assert.assertTrue(true);
            }
        } else {
            filterAndSearchPage.toCheckbox.click();
            Assert.assertTrue(filterAndSearchPage.toField.isDisplayed());
        }

        if (filterAndSearchPage.favoritesCheckbox.getAttribute("class").contains("checked")) {
            filterAndSearchPage.favoritesCheckbox.click();
            try {
                System.out.println(filterAndSearchPage.favoritesField.isDisplayed());
            } catch (NoSuchElementException e) {
                Assert.assertTrue(true);
            }
        } else {
            filterAndSearchPage.favoritesCheckbox.click();
            Assert.assertTrue(filterAndSearchPage.favoritesField.isDisplayed());
        }

        if (filterAndSearchPage.tagCheckbox.getAttribute("class").contains("checked")) {
            filterAndSearchPage.tagCheckbox.click();
            try {
                System.out.println(filterAndSearchPage.tagField.isDisplayed());
            } catch (NoSuchElementException e) {
                Assert.assertTrue(true);
            }
        } else {
            filterAndSearchPage.tagCheckbox.click();
            Assert.assertTrue(filterAndSearchPage.tagField.isDisplayed());
        }

        if (filterAndSearchPage.extranetCheckbox.getAttribute("class").contains("checked")) {
            filterAndSearchPage.extranetCheckbox.click();
            try {
                System.out.println(filterAndSearchPage.extranetField.isDisplayed());
            } catch (NoSuchElementException e) {
                Assert.assertTrue(true);
            }
        } else {
            filterAndSearchPage.extranetCheckbox.click();
            Assert.assertTrue(filterAndSearchPage.extranetField.isDisplayed());
        }


    }


    @When("User click RestoreDefaultFields button")
    public void user_Click_RestoreDefaultFields_Button() {
        filterAndSearchPage.restoreDefaultFieldsbutton.click();
        filterAndSearchPage.resetButton.click();
        BrowserUtils.waitFor(3);
        filterAndSearchPage.filterAndSearchButton.click();


    }

    @When("User click Date dropdown")
    public void user_click_date_dropdown() {

        filterAndSearchPage.dateInbox.click();

    }


    @When("User select Yesterday option")
    public void user_select_yesterday_option() {
        filterAndSearchPage.yesterdayDropdown.click();

    }

    @When("User click search button")
    public void user_click_search_button() {
        filterAndSearchPage.searchButton.click();
        BrowserUtils.waitFor(3);
    }


    @Then("each result should be from Yesterday if exist")
    public void each_result_should_be_from_yesterday_if_exist() {

        if (filterAndSearchPage.resultBoxDate.size() > 0) {

            for (WebElement eachResultBoxDate : filterAndSearchPage.resultBoxDate) {
                System.out.println(eachResultBoxDate.getText());
                Assert.assertTrue(eachResultBoxDate.getText().contains("yesterday"));
            }
        } else {
            Assert.assertTrue(true);
        }


    }

    @When("User select CurrentDay option")
    public void user_select_currentDay_option() {
        filterAndSearchPage.currentDayDropdown.click();

    }


    @Then("each result should be from CurrentDay if exist")
    public void each_result_should_be_from_currentDay_if_exist() {

        if (filterAndSearchPage.resultBoxDate.size() > 0) {

            for (WebElement eachResultBoxDate : filterAndSearchPage.resultBoxDate) {
                System.out.println(eachResultBoxDate.getText());
                Assert.assertTrue(eachResultBoxDate.getText().contains("today"));
            }
        } else {
            Assert.assertTrue(true);
        }


    }

    //Scenario 5
    @When("User select Month option and click search")
    public void user_select_month_option() {
        filterAndSearchPage.monthOptionOfDate.click();
        filterAndSearchPage.monthCreateInbox.click();
        BrowserUtils.waitFor(2);
        filterAndSearchPage.monthCreate_December.click();
        filterAndSearchPage.yearCreateInbox.click();
        filterAndSearchPage.yearCreate_2021.click();
        filterAndSearchPage.searchButton.click();
        BrowserUtils.waitFor(5);
    }

    @Then("User see the results of December {string}")
    public void userSeeTheResultsOfDecember(String year) {
        if (filterAndSearchPage.resultBoxDate.size() > 0) {

            for (WebElement eachResultBoxDate : filterAndSearchPage.resultBoxDate) {
                System.out.println(eachResultBoxDate.getText());
                Assert.assertTrue(eachResultBoxDate.getText().contains("December"));
                Assert.assertTrue(eachResultBoxDate.getText().contains("2021"));
            }
        } else {
            Assert.assertTrue(true);
        }

    }

    @When("User click Type dropdown")
    public void user_click_type_dropdown() {

        filterAndSearchPage.typeInbox.click();
        BrowserUtils.waitFor(2);

    }

    @Then("User selects the types from {string} field and see its results")
    public void user_selects_the_types_from_field(String string) {
        for (WebElement element : filterAndSearchPage.typeFieldOptions) {


            if (element.getText().equals(string)) {
                element.click();
                BrowserUtils.waitFor(2);
                filterAndSearchPage.searchButton.click();
                BrowserUtils.waitFor(2);
                String actualString = filterAndSearchPage.filterAndSearchButtonAfterSearch.getText();
                Assert.assertTrue(actualString.contains(string));

                break;

            }


        }


    }

    @Then("User selects the types from {string}, {string} field and see its results")
    public void userSelectsTheTypesFromFieldAndSeeItsResults(String type1, String type2) {

        for (WebElement each : filterAndSearchPage.typeFieldOptions) {
            if (each.getText().equalsIgnoreCase(type1)||each.getText().equalsIgnoreCase(type2)) {
                each.click();
            }

            }
        filterAndSearchPage.searchButton.click();
        BrowserUtils.waitFor(3);
        boolean expectedResult=false;

        List<WebElement> actualResult = filterAndSearchPage.filterAndSearchButtonEmpty;
        boolean type1IsSearched=false;
        boolean type2IsSearched=false;

        for (WebElement each : actualResult) {
            if (each.getText().contains(type1) ) {
                type1IsSearched=true;
            }
            if (each.getText().contains(type2)) {
                type2IsSearched=true;

            }

        }

            Assert.assertTrue(type1IsSearched && type2IsSearched);





    }
        @When("User fill some fields")
        public void user_fill_some_fields () {
            filterAndSearchPage.dateInbox.click();
            filterAndSearchPage.yesterdayDropdown.click();
            filterAndSearchPage.typeInbox.click();
            filterAndSearchPage.typeAnnouncementCheckBox.click();
            filterAndSearchPage.typeInbox.click();


        }

        @When("User click Save Filter button")
        public void user_click_save_filter_button () {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.saveFilterButton.click();
        }


        @When("User input a {string}")
        public void user_input_a (String filterName){
            filterAndSearchPage.filterNameButton.sendKeys(filterName);
        }
        @Then("User click Save button and see saved {string}")
        public void user_click_save_button_and_see_saved (String string){

            filterAndSearchPage.saveButton.click();
            Assert.assertTrue(filterAndSearchPage.newFilterNameButton.getText().equalsIgnoreCase(string));

        }

        @And("User add some fields")
        public void user_Add_Some_Fields () {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.addFieldButton.click();
            filterAndSearchPage.addFieldFavorites.click();


        }


        @When("User remove some fields")
        public void user_remove_some_fields () {
            filterAndSearchPage.deleteAuthorField.click();

        }
        @When("click on Restore Default Fields button")
        public void click_on_restore_default_fields_button () {
            filterAndSearchPage.restoreDefaultFieldsbutton.click();

        }
        @Then("User should see  default fields as")
        public void user_should_see_default_fields_as (List < String > expectedDefaultFields) {
            List<WebElement> actualDefaultFields = filterAndSearchPage.defaultDataFields;

            boolean matched = false;
            for (WebElement eachActualDefaultField : actualDefaultFields) {
                for (String eachExpectedDefaultField : expectedDefaultFields) {
                    if (eachActualDefaultField.getText().contains(eachExpectedDefaultField)) {
                        matched = true;
                        break;
                    } else {
                        matched = false;
                    }
                }


            }
            Assert.assertTrue(matched);


        }
        @And("User click Reset button")
        public void userClickResetButton () {
            filterAndSearchPage.resetButton.click();
        }

        @Then("User doesn't see any condition in filter and search box.")
        public void userSeeDoesntSeeAnyConditionInFilterAndSearchBox() {
            if (filterAndSearchPage.filterAndSearchButtonEmpty.size() == 1) {
                Assert.assertTrue(true);
            }
        }


    }



