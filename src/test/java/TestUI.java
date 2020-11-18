import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestUI {
    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("123");
        driver.findElement(By.name("ht")).sendKeys("123");
        driver.findElement(By.name("cc")).click();
        WebElement out = driver.findElement(By.name("desc"));
        String outText = out.getAttribute("value");
        System.out.println(outText);

        driver.close();

    }

    @Test
    public void test2(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("75");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        WebElement out = driver.findElement(By.name("desc"));
        String outText = out.getAttribute("value");
        System.out.println(outText);

        driver.close();

    }

    @Test
    public void test3(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        WebElement out = driver.findElement(By.name("desc"));
        String outText = out.getAttribute("value");
        System.out.println(outText);

        driver.close();

    }

    @Test
    public void test4(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("25");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        WebElement out = driver.findElement(By.name("desc"));
        String outText = out.getAttribute("value");
        System.out.println(outText);

        driver.close();

    }

    @Test
    public void test5(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("25");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        WebElement out = driver.findElement(By.name("desc"));
        String outText = out.getAttribute("readonly");
        System.out.println(outText);

        driver.close();

    }

    @Test
    public void test6(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("75");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        WebElement out = driver.findElement(By.name("si"));
        String outText = out.getAttribute("value");
        System.out.println(outText);

        driver.close();

    }

}
