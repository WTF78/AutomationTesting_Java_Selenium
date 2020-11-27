import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputLogin(String login){
        fieldLogin.sendKeys(login);

    }
    public void clickLoginBtn(){
        buttonNext.click();
    }
    public void inputPassword(String password){
        fieldPassword.sendKeys(password);
    }
    public void clickPasswordBtn(){
        buttonLogin.click();
    }

    /**
     * Xpath at page
     */
    @FindBy(xpath = "//*[@id='username']")
    private WebElement fieldLogin;
    @FindBy(xpath = "//*[@id='continue']")
    private WebElement buttonNext;
    @FindBy(xpath = "//*[@id='password']")
    private WebElement fieldPassword;
    @FindBy(xpath = "//*[@id='login']")
    private WebElement buttonLogin;
}
