package org.example.pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page{


    private WebDriver driver;


    @FindBy(css ="nav>div:nth-child(4)" )
    private WebElement avatar;
    @FindBy(className = "style_input__dvx2f")
    private WebElement email;
    @FindBy(id = "password_login")
    private WebElement password;
    @FindBy(id = "btn_login")
    private WebElement loginButton;


    public void login(){
        this.get("https://ztrain-web.vercel.app/en/home");
        this.avatar.click();
        this.email.sendKeys("tichelldjumo@gmail.com");
        this.password.sendKeys("AudreyDjumo");
        this.loginButton.click();
    }
    public void register()
    {
        this.driver.get("https://ztrain-web.vercel.app/en/home");
        this.avatar.click();
        this.driver.findElement(By.cssSelector(".MuiTabs-scroller>div>button:nth-child(2)")).click();
        this.driver.findElement(By.id("email_register")).sendKeys();
    }


}
