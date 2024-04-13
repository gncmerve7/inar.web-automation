package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NormalIframePage extends BasePage {
    @FindBy(linkText = "Normal Iframe")
    private WebElement headerInframe;
    @FindBy(xpath = "//h1[contains(text(),'Iframe')]")
    private WebElement HeaderOfPage;

    @FindBy(id = "nestedIframe")
    private WebElement iFrameElement;

    @FindBy(xpath = "//a[href(text(),'More information...')]")
    private WebElement MoreInfomationElement;


    public void switchToIFrame(){
        DRIVER.switchTo().frame(iFrameElement);
    }
    public void switchToPage(){
        DRIVER.switchTo().parentFrame();
    }
    public String getHeaderOfIFrame(){
        switchToIFrame();
        return iFrameElement.getText();
    }
    public void printTitle(){
        System.out.println(DRIVER.switchTo().frame(iFrameElement).getTitle());
    }
}
