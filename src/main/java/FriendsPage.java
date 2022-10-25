import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FriendsPage {
    private ChromeDriver driver;
    public FriendsPage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public void submitFriend()
    {
        driver.findElement(By.xpath("//span[@data-l='t,inviteFromButton']")).click();
    }

    public boolean found()
    {
        return driver.findElement(By.xpath("//*[@class='heading__unijc __h2__unijc']")).isEnabled();
    }

    public void add()
    {
        WebElement button = driver.findElement(By.xpath("//*[@class='button__pe9qo button-core-container__0ej09']")); //найти добавить в друзья
        button.click();
    }

    public boolean checkSubmitted()
    {
        return driver.findElement(By.xpath("//i[contains(@class,'tico_img')]")).isEnabled();
    }


}
