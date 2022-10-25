import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private ChromeDriver driver;

    public HomePage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public boolean atPage()
    {
        String title = driver.getTitle();
        return title.equals("Одноклассники")
                && driver.findElement(By.xpath("//*[@id='viewImageLinkId']")).isEnabled();
    }

    public void findPerson()
    {
        driver.findElement(By.xpath("//button[contains(@class,'button-clean')]")).click(); //нажать на поисr
        driver.findElement(By.xpath("//button[text()='Люди']")).click(); //вкладка люди
        driver.findElement(By.xpath("//*[@placeholder='Введите запрос']")).sendKeys("technoPol22");
        driver.findElement(By.xpath("//*[text()='Найти']")).click();
    }

    public void openFriendsPage()
    {
        driver.findElement(By.xpath("//a[@data-l='t,userFriend']")).click();
    }
}
