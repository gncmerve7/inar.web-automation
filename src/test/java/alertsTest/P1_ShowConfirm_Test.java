package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

/*
1. Navigate to the Inar Academy homepage.
2. Click on the 'Web Automation' link.
3. Select the 'Alerts' button.
4. Click on the 'Show Confirm' button.
5. Verify that the alert text displays as "Are you sure?"
6. Enter the input name.
7.Confirm that the alert appears correctly. */

public class P1_ShowConfirm_Test extends Hooks {

    @Test
    void testShowConfirm() {
//       Navigate to the Inar Academy homepage and click on the 'Web Automation' link.
        pages.getHomePage().clickOnWebAutomationLink();


//       Select the 'Alerts' button.
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnAlertsLink();
        BrowserUtils.scrollUpWithPageUp();

//       Click on the 'Show Confirm' button.
        pages.getAlertTypesPage().clickOnShowConfirmButton();

        BrowserUtils.wait(2);


//       Verify that the alert text displays as "Are you sure?"
        Assertions.assertEquals("Are you sure?", pages.getAlertTypesPage().getTextOfTheAlert());
        BrowserUtils.wait(2);

    }
}