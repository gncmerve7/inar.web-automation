package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.autoComplete.MultipleAndRemote_Page;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframePage;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.selectable.Selectable_DefFunc_Page;

public class Pages {

    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;

    private AutoScrolling_Page autoScrollingPage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private HomePage homePage;

    private MultipleAndRemote_Page multipleAndRemotePage;

    private NestedIframe_Page nestedIframePage;
private  NormalIframePage normalIframePage;
    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private WebAutomationPage webAutomationPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        normalIframePage = new NormalIframePage();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        multipleAndRemotePage = new MultipleAndRemote_Page();

    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage() {
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage() {
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage() {
        return nestedIframePage;
    }

    public NormalIframePage getNormalIframePage() {
        return normalIframePage;
    }

    public AlertTypes_Page getAlertTypesPage() {
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage() {
        return animatePage;
    }

    public MultipleAndRemote_Page getMultipleAndRemotePage() {
        return multipleAndRemotePage;
    }
}
