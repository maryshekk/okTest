import org.openqa.selenium.By;
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

    public boolean checkSubmitted()
    {
        return driver.findElement(By.xpath("//i[contains(@class,'tico_img')]")).isEnabled();
    }


}
