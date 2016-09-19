import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Automation1Tester {
    Automation1 auto;
    String siteName;
    String validationString;

@BeforeSuite
    public void SetupTest()
    {
        auto = new Automation1();
        siteName = "https://www.skiutah.com";
        validationString = "Ski Utah";
    }

    @Test
    public void TestGotoValid()
    {
        Assert.assertTrue(auto.GoToPage(siteName,validationString));
    }

    @Test
    public void TestGotoInvalidSite()
    {
        Assert.assertFalse(auto.GoToPage("http://www.google.com",validationString));
    }

    @Test
    public void TestGotoInvalidTitle()
    {
        Assert.assertFalse(auto.GoToPage(siteName,"Invalid Title"));
    }

}
