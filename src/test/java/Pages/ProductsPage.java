package Pages;
import com.aventstack.extentreports.Status;
import com.beust.jcommander.IStringConverter;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.io.IOException;
import static Tests.Selenium_test.driver;
import static Tests.Selenium_test.*;
public class ProductsPage
{
  public static String formal_shoe_tile="/html/body/div[2]/center/h2";
    public static String Sports_shoes="/html/body/div[3]/center/h2";
    public static String sneakers="/html/body/div[4]/center/h2" ;
    public static String Formal_shoes_dropdown="/html/body/div[2]/center/div/i[1]";
    public static String Sports_shoes_dropdown="/html/body/div[3]/center/div/i[1]";
    public static String Sneakers_dropdown="/html/body/div[4]/center/div/i[1]" ;
    public static String Formalshoes_name="/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String SportsShoes_name="/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String  Sneaker_name="/html/body/div[4]/table/tbody/tr[1]/td[1]";
    public static void Formalshoes_gettitle()
    {
        String ActTitle_formalshoe=driver.findElement(By.xpath(formal_shoe_tile)).getText();
    }
    public static void formalshoes_Verifytitle() throws IOException
    {
        String ExpectedTitle_fs ="Formal Shoes";
        String ActTitle_formalshoe=driver.findElement(By.xpath(formal_shoe_tile)).getText();
        Assert.assertEquals(ExpectedTitle_fs,ActTitle_formalshoe);
        System.out.print("Formal shoes passed");
        if(ExpectedTitle_fs.equals(ActTitle_formalshoe))
        {
            test.log(Status.PASS,"Test Passed for Title Verification for formal shoes");
        }
    }
    public static void SportsShoes_verifytitle()
    {
        String ExpectedTitle_SS ="Sports Shoes";
        String ActTitle_sportsshoe=driver.findElement(By.xpath(Sports_shoes)).getText();
        Assert.assertEquals(ExpectedTitle_SS,ActTitle_sportsshoe);
        System.out.print("Sports shoes Passed");
        if(ExpectedTitle_SS.equals(ActTitle_sportsshoe))
        {
            test.log(Status.PASS,"Test Passed for Title Verification for Sports shoes");
        }
    }
    public static void Sneakers_verifytitle()
    {
        String ExpectedTitle_sk ="Sneakers";
        String ActTitle_sneakers=driver.findElement(By.xpath(sneakers)).getText();
        Assert.assertEquals(ExpectedTitle_sk,ActTitle_sneakers);
        System.out.print("Sneakers Passed");
        if(ExpectedTitle_sk.equals(ActTitle_sneakers))
        {
            test.log(Status.PASS,"Test Passed for Title Verification for Senakers shoes");
        }
    }
    public static void Formalshoes_dropClickandVerifyname()
    {
        String actual_formal_shoe_drp_fstname="   Classic Cheltenham";
        driver.findElement(By.xpath(Formal_shoes_dropdown)).click();
        String exp_formal_shoe_drp_fstname =driver.findElement(By.xpath(Formalshoes_name)).getText();
        Assert.assertEquals(exp_formal_shoe_drp_fstname,actual_formal_shoe_drp_fstname);
        System.out.println("Formal shoes first name is correct");
        if(exp_formal_shoe_drp_fstname.equals(actual_formal_shoe_drp_fstname))
        {
            test.log(Status.PASS,"Test Passed for name Verification for formal shoes");
        }
    }
    public static void Sportsshoes_dropClickandVerifyname()
    {
        String actual_Sport_shoe_drp_fstname="   Ultimate";
        driver.findElement(By.xpath(Sports_shoes_dropdown)).click();
        String exp_Sports_shoe_drp_fstname =driver.findElement(By.xpath(SportsShoes_name)).getText();
        Assert.assertEquals(exp_Sports_shoe_drp_fstname,actual_Sport_shoe_drp_fstname);
        System.out.println("Sports shoes first name is correct");
    }
    public static void Sneakers_dropClickandverifyname()
    {
        String actual_sneakers_shoe_drp_fstname="   Archivo";
        driver.findElement(By.xpath(Sneakers_dropdown)).click();
        String exp_Sneakers_shoe_drp_fstname =driver.findElement(By.xpath(Sneaker_name)).getText();
        Assert.assertEquals(exp_Sneakers_shoe_drp_fstname,actual_sneakers_shoe_drp_fstname);
        System.out.println("Sports shoes first name is correct");
    }
}