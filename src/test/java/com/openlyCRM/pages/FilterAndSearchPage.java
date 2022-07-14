package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.joda.time.Months;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FilterAndSearchPage {
    public FilterAndSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "LIVEFEED_search")
    public WebElement filterAndSearchButton;


    @FindBy(xpath = "//span[@class='main-ui-filter-add-edit']")
    public WebElement filterSettingsButton;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-button-item']")
    public WebElement resetToDefaultButton;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement continuePopup;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item']//span[@class='main-ui-filter-sidebar-item-text']")
    public List<WebElement> defaultFilters;

    @FindBy(xpath = "//span[.='Add field']")
    public WebElement addFieldButton;

    @FindBy(xpath = "//div[@class='main-ui-filter-popup-field-list main-ui-filter-field-list-2-column']//div[@class='main-ui-select-inner-label']")
    public List<WebElement> fields;

    @FindBy(xpath = "//span[.='Date']")
    public WebElement dateField;

    @FindBy(xpath = "//span[.='Type']")
    public WebElement typeField;

    @FindBy(xpath = "//span[.='Author']")
    public WebElement authorField;

    @FindBy(xpath = "//span[.='To']")
    public WebElement toField;

    @FindBy(xpath = "//span[.='Favorites']")
    public WebElement favoritesField;

    @FindBy(xpath = "//span[.='Tag']")
    public WebElement tagField;

    @FindBy(xpath = "//span[.='Extranet']")
    public WebElement extranetField;

    @FindBy(xpath = "//div[@data-id='field_DATE_CREATE']")
    public WebElement dateCheckbox;

    @FindBy(xpath = "//div[@data-id='field_TO']")
    public WebElement typeCheckbox;

    @FindBy(xpath = "//div[@data-id='field_CREATED_BY_ID']")
    public WebElement authorCheckbox;

    @FindBy(xpath = "//div[@data-id='field_TO']")
    public WebElement toCheckbox;

    @FindBy(xpath = "//div[@data-id='field_FAVORITES_USER_ID']")
    public WebElement favoritesCheckbox;

    @FindBy(xpath = "//div[@data-id='field_TAG']")
    public WebElement tagCheckbox;

    @FindBy(xpath = "//div[@data-id='field_EXTRANET']")
    public WebElement extranetCheckbox;

    @FindBy(xpath = "//span[@class='main-ui-select-name']")
    public WebElement dateInbox;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreDefaultFieldsbutton;

   @FindBy(xpath = "//div[.='Yesterday']/div")
    public WebElement yesterdayDropdown;

    @FindBy(xpath = "//div[@class='main-ui-filter-bottom-controls']//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button main-ui-filter-find']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='feed-post-time-wrap']//div[@class='feed-time']")
    public List<WebElement> resultBoxDate;


    @FindBy(xpath = "//div[.='Current day']/div")
    public WebElement currentDayDropdown;

    @FindBy(xpath = "//div[@id=\"popup-window-content-main-filter-control-popup\"]/div/div[12]/div")
    public WebElement monthOptionOfDate;



    @FindBy(xpath = "//div[@data-name='DATE_CREATE_month']")
    public WebElement monthCreateInbox;

    @FindBy(xpath = "//div[@id=\"popup-window-content-main-filter-control-popup\"]/div/div[.='December']")
    public WebElement monthCreate_December;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_year']")
    public WebElement yearCreateInbox;


    @FindBy(xpath = "//div[@id='popup-window-content-main-filter-control-popup']//div[.='2021']")
    public WebElement yearCreate_2021;

    @FindBy(xpath = "(//div[@data-name='EVENT_ID'])[2]")
    public WebElement typeInbox;

    @FindBy(xpath = "//div[@data-item='{\"NAME\":\"Announcements\",\"VALUE\":\"blog_post_important\"}']//div[.='Announcements']/..")
    public WebElement typeAnnouncementCheckBox;

    @FindBy(xpath = "//div[@id='popup-window-content-main-filter-control-popup']//div[@class='popup-multiselect-content']/div")
    public List <WebElement> typeFieldOptions;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset']")
    public WebElement resetButton;

    @FindBy(xpath = "//div[@class='main-ui-filter-search main-ui-filter-theme-rounded main-ui-filter-compact-state']/div/div")
    public WebElement filterAndSearchButtonAfterSearch;

    @FindBy(xpath = "//div[@class='main-ui-filter-search main-ui-filter-theme-rounded main-ui-filter-compact-state']/div")
    public List<WebElement> filterAndSearchButtonEmpty;

    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement saveFilterButton;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    public WebElement filterNameButton;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[8]")
    public WebElement newFilterNameButton;

    @FindBy(xpath = "//div[@data-id='field_FAVORITES_USER_ID']")
    public WebElement addFieldFavorites;

    @FindBy(xpath = "(//span[@title='Hide field'])[3]")
    public WebElement deleteAuthorField;

    @FindBy(xpath = "//div[@class='main-ui-filter-field-container-list']/div")
    public List<WebElement> defaultDataFields;
















}
