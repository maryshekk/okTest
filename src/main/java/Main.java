import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class Main {
    public ChromeDriver driver1;
    public ChromeDriver driver2;

    @Test
    public void test()
        {
        System.setProperty("webdriver.chrome.driver", "C:/CLionProgects/technopolis/chromedriver_win32/chromedriver.exe");
        driver1 = new ChromeDriver();
        driver1.get("https://ok.ru/");

        driver2 = new ChromeDriver();
        driver2.get("https://ok.ru/");

        LoginPage page1 = new LoginPage(driver1);
        LoginPage page2 = new LoginPage(driver2);

        page1.enterLogin("technoPol8");
        page1.enterPassword("technoPolis2022");

        HomePage homePage1 = new HomePage(driver1);
        homePage1.findPerson();

        page2.enterLogin("technoPol22");
        page2.enterPassword("technoPolis2022");
        HomePage homePage2 = new HomePage(driver2);
        homePage2.openFriendsPage();

        FriendsPage friendsPage2 = new FriendsPage(driver2);
        friendsPage2.submitFriend();

        FriendsPage friendsPage1 = new FriendsPage(driver1);
        friendsPage1.checkSubmitted();

        driver1.quit();
        driver2.quit();
    }
}
