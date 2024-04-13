package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

 /*
1. Navigate to the Inar Academy homepage.
2. Click on the 'Web Automation' link.
3. Select the 'Alerts' button.
4. Click on the 'Show Prompt' button.
5. Verify that the alert text displays as "Enter your name:"
6. Enter the input name.
7.Confirm that the alert appears correctly. */

public class P1_ShowPrompt_Test extends Hooks {

    @Test
    void testShowPrompt() {

        // Navigate to the Inar Academy homepage and click on the 'Web Automation' link.
        pages.getHomePage().clickOnWebAutomationLink();


        // Select the 'Alerts' button.
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnAlertsLink();
        BrowserUtils.scrollUpWithPageUp();


        // Click on the 'Show Prompt' button.
        pages.getAlertTypesPage().clickOnShowPromptButton();

        // Verify that the alert text displays as "Enter your name:"
        Assertions.assertEquals("Enter your name:",pages.getAlertTypesPage().getTextOfTheAlert());


        BrowserUtils.wait(2);

        // Enter the input name.
        pages.getAlertTypesPage().enterInputIntoAlert("merve");
        pages.getAlertTypesPage().confirmTheAlert();

        BrowserUtils.wait(2);

        //Confirm that the alert messsage appears correctly.
        Assertions.assertEquals("Hello, merve!",pages.getAlertTypesPage().getTextOfTheAlert());


    }
}
