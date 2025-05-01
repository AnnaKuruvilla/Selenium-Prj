package Pages;
import com.beust.jcommander.IStringConverter;
import org.openqa.selenium.By;
import static Tests.Selenium_test.driver;
public class HomePage {

    public static String hambur_menu_xpath="//*[@id=\"menuToggle\"]/input" ;
    public static String online_products ="//*[@id=\"menu\"]/a[3]/li" ;
    public static void Click_hamburger_menu()
    {
        driver.findElement(By.xpath(hambur_menu_xpath)).click();
    }
    public static void Click_online_product() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(By.xpath(online_products)).click();
    }
}
