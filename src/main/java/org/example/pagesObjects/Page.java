package org.example.pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {
    private WebDriver driver;
    Page (){
        System.setProperty("webdriver.chrome.driver",this.path);
        this.driver=new ChromeDriver();
        PageFactory.initElements(this.driver,this);

    }
    public void get(String url){
        this.driver.get(url);
    }
    private String path="src/test/resources/driver/chromedriver-win64/chromedriver.exe";
}
