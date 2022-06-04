package com.qa.Pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPage extends BaseTest {
    @AndroidFindBy(accessibility = "test-LOGOUT")
    private MobileElement logoutBtn;

    public LoginPage pressLogoutBtn(){
        click(logoutBtn);
        return new LoginPage();

    }

}
