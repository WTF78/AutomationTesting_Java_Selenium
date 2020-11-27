import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {


    @FindBy(xpath = "//button/span/span[@class = 'agent-name']")
    private WebElement userMenu;
    @FindBy(xpath = "//span[@id = 'wweMainMenuDefaultButton']")
    private WebElement mainMenuButton;
    @FindBy(xpath = "//a[@id = 'wweAgentLogoutButton']")
    private WebElement exitButton;


    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void Logout(){
        mainMenuButton.click();
        exitButton.click();
    }

    public String getUserName() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span/span[@class = 'agent-name']")));
        String userName = userMenu.getText();
        return userName;
    }



}
