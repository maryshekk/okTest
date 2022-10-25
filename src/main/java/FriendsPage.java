import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FriendsPage {
    private ChromeDriver driver;

    private void submitFriend()
    {
        driver.findElement(By.xpath("//span[@data-l='t,inviteFromButton']")).click();
    }

    private boolean checkSubmitted()
    {
        return driver.findElement(By.xpath("//i[contains(@class,'tico_img')]")).isEnabled();
    }


}
