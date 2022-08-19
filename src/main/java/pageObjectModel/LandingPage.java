package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    public WebDriver driver;

   By email = By.xpath("//input[@id='email']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmail(){
       return driver.findElement(email);
   }
   By password = By.xpath("//input[@id='password']");

    public WebElement getPassword(){
        return driver.findElement(password);
    }
    By signIn = By.xpath("//button[@type='submit']");
    public WebElement getsignIn(){
        return driver.findElement(signIn);
    }
    By showmore = By.xpath("//div[@class='expandable-expander flex items-center light-gray']");

    public WebElement clickShowMore(){
        return driver.findElement(showmore);
    }
    By tools = By.xpath("//span[normalize-space()='Tools']");
    public  WebElement clickTools(){
        return driver.findElement(tools);
    }
    By pActions = By.xpath("(//div[@class='listing-item-title truncate'])[8]");
    public WebElement clickParcelActions(){
        return driver.findElement(pActions);
    }

    By entPcode = By.cssSelector("textarea[class='ant-input textinput-component__textarea']");
    public WebElement enterPcode(){
        return driver.findElement(entPcode);

    }



}
/*
        driver.findElement(By.cssSelector("div[class*='expandable-expander flex items-center light-gray']")).click();
        driver.findElement(By.xpath("(//span[normalize-space()='(8)'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='listing-item-title truncate'])[8]")).click();
        driver.findElement(By.cssSelector("textarea[class*='ant-input textinput-component__textarea']")).sendKeys(data.get(0));
        driver.findElement(By.xpath("//div[@class='ant-select-selection__placeholder']")).click();
        //WebElement staticDropdown  = (driver.findElement(By.xpath("//div[@class='ant-select-selection__placeholder']")));
        //Select dropdown = new Select(staticDropdown);
       // dropdown.selectByIndex(1);
        driver.findElement(By.xpath("(//li[normalize-space()='ON_HOLD'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("(//li[normalize-space()='DELIVERED_TO_STORE'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
    }
 */