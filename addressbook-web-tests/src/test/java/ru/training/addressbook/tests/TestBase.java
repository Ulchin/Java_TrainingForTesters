package ru.training.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.training.addressbook.appmanager.ApplicationManager;

/**
 * Created by ws03 on 7/20/2017.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME); //here browser type can be changed

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
