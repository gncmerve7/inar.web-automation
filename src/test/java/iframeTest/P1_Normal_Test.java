package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class P1_Normal_Test extends Hooks {
    /*
1. Navigate to the Inar Academy homepage.
2. Click on the 'Web Automation' link.
3. Select the 'Iframe' button.
4. Click on the 'Normal Iframe' button.
5.Verify that the header text "Inar academy" In iframe
*/

    @Test
    void testNormalIframe(){
//         Navigate to the Inar Academy homepage and  click on the 'Web Automation' link.
        pages.getHomePage().clickOnWebAutomationLink();


//         Select the 'Iframe' button.
        pages.getWebAutomationPage().clickOnIframeLink();


//        Click on the 'Normal Iframe' button.
        pages.getNormalIframePage().getHeaderOfIFrame();

//        Verify that the header text "Inar academy" In iframe



    }

}
