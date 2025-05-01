package Tests;
import Pages.HomePage;
import Pages.ProductsPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Selenium_test {

    public static WebDriver driver;
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports  extent =new ExtentReports();
    @BeforeSuite
    public static void SetUp() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark=new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        HomePage.Click_hamburger_menu();
        HomePage.Click_online_product();
    }
    @Test
    void ValidateTitle_onlineproducts() throws  IOException
    {
       test= extent.createTest("Validate Title","Different Shoe Types are correct");
        ProductsPage.formalshoes_Verifytitle();
        ProductsPage.SportsShoes_verifytitle();
        ProductsPage.Sneakers_verifytitle();
        extent.flush();
    }
    @Test
    void ValidateFormalshoes()
 {
        test= extent.createTest("Validate formal shoes","First name is  correct");
        ProductsPage.Formalshoes_dropClickandVerifyname();
        ProductsPage.Sportsshoes_dropClickandVerifyname();
        ProductsPage.Sneakers_dropClickandverifyname();
 }
 @AfterSuite
 public static void cleanup()
    {
        extent.flush();
    }
}
