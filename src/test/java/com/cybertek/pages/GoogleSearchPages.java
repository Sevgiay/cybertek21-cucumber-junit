package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPages {

    public GoogleSearchPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "q")
    public WebElement searchBar;
}