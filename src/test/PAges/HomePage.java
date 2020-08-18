package PAges;


import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String[] navButtons = {"Home", "Inputs", "Selectors", "Select-class", "Alert", "Pop-Up", "Multiple-window",
            "Tables", "Calendar", "iFrames", "Action-class","JS-Executor","Synchronization", "Files", "User-Mgt"};


}