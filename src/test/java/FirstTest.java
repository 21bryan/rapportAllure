import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    private WebDriver webDriver;
    private String path = "src/test/resources/driver/chromedriver-win64/chromedriver.exe";
    @BeforeTest
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver",this.path);
        this.webDriver=new ChromeDriver();

    }
    @Test()
    public  void login(){
        this.webDriver.get("https://ztrain-web.vercel.app/en/home");
        this.webDriver.findElement(By.id("style_avatar_wrapper__pEGIQ")).click();
        this.webDriver.findElement(By.className("style_input__dvx2f")).sendKeys("tichelldjumo@gmail.com");
        this.webDriver.findElement(By.id("password_login")).sendKeys("AudreyDjumo");
        this.webDriver.findElement(By.id("btn_login")).click();
        Assert.assertTrue(this.webDriver.findElement(By.cssSelector("sup")).isDisplayed());

    }

//    @Test
//    public void signUp(){
//        this.webDriver.get("https://ztrain-web.vercel.app/en/home");
//        this.webDriver.findElement(By.id("style_avatar_wrapper__pEGIQ")).click();
//        this.webDriver.findElement(By.cssSelector(".MuiTabs-scroller>div>button:nth-child(2)")).click();
////        this.webDriver.findElement(By.id("email_register")).sendKeys("fomekongfossoemmanuel@gmail.com");
////        this.webDriver.findElement(By.id("password_register")).sendKeys("1223312345");
////        this.webDriver.findElement(By.id("confirm_password_register")).sendKeys("1223312345");
////        this.webDriver.findElement(By.id("btn_register")).click();
//        this.webDriver.findElement(By.className("style_input__dvx2f")).sendKeys("tichelldjumo@gmail.com");
//        this.webDriver.findElement(By.id("password_login")).sendKeys("AudreyDjumo");
//      this.webDriver.findElement(By.id("btn_login")).click();
//        this.webDriver.findElement(By.cssSelector("__next>div>nav:last-child"));
//        Assert
//
//
//    }

//    @AfterTest()
//    public  void closeDriver(){
//        this.webDriver.quit();
//    }
}
