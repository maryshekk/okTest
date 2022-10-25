import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public ChromeDriver driver1;
    public ChromeDriver driver2;

    @Test
    public void test()
        {
        System.setProperty("webdriver.chrome.driver", "C:/CLionProgects/technopolis/chromedriver_win32/chromedriver.exe");
        driver1 = new ChromeDriver();
        driver1.get("https://ok.ru/");



        LoginPage page1 = new LoginPage(driver1);

        page1.enterLogin("technoPol8");
        page1.enterPassword("technoPolis2022");
        page1.clickLogin();

        HomePage homePage1 = new HomePage(driver1);
        homePage1.findPerson();

        FriendsPage friendsPage1 = new FriendsPage(driver1);
        assert friendsPage1.found();
        friendsPage1.add();

        driver2 = new ChromeDriver();
        driver2.get("https://ok.ru/");
        LoginPage page2 = new LoginPage(driver2);
        page2.enterLogin("technoPol22");
        page2.enterPassword("technoPolis2022");
        page2.clickLogin();

        HomePage homePage2 = new HomePage(driver2);
        homePage2.openFriendsPage();

        FriendsPage friendsPage2 = new FriendsPage(driver2);
        friendsPage2.submitFriend();

        friendsPage1.checkSubmitted();

        driver1.quit();
        driver2.quit();
    }
}
