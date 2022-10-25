import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;


//input[@name='st.email'] //Кнопка "Логин"
//input[@name='st.password'] //Кнопка "Пароль"
//input[contains(@class,'button-pro')] //Кнопка "Войти в одноклассники"

//input[@name='st.query'] //Поле "Искать на сайте"

//button[text()='Люди'] //Кнопка "Люди" в поиске
//span[text()='Добавить в друзья'] //Кнопка "Добавить в друзья"
//div[contains(@class,'ucard-mini')] //Галочка, что заявка отправлена
//a[@data-l='t,logout'] //Кнопки выхода со страницы
//input[@data-l='t,logout'] //Кнопки выхода со страницы

//a[@data-l='t,login_tab'] //Переход на основную вкладку "Вход"
//a[@data-l='t,userFriend'] //Вкладка "Друзья"
//a[@class='nav-side_i  __ac __with-ic']

public class Main {
    public ChromeDriver driver1;
    public ChromeDriver driver2;

    @Test{
        System.setProperty("webdriver.chrome.driver", "C:/CLionProgects/technopolis/chromedriver_win32/chromedriver.exe");
        driver1 = new ChromeDriver();
        driver1.get("https://ok.ru/");

        driver2 = new ChromeDriver();
        driver2.get("https://ok.ru/");

        LoginPage page1 = new LoginPage(driver1);
        LoginPage page2 = new LoginPage(driver2);

        





        driver1.quit();
        driver2.quit();
    }

}
