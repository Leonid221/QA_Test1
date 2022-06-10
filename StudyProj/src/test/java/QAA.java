import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class QAA {

    static void checkTitle(){
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/index.html");


        String expectedTitle = "Guardians of the Galaxy Vol. 2";

        WebElement movieSearch = driver.findElement(By.id("input_text_field"));
        WebElement searchBtn = driver.findElement(By.id("get_film_info"));

        movieSearch.sendKeys("Guardians of the Galaxy Vol. 2");
        searchBtn.click();


        WebElement directorName = new WebDriverWait(driver, Duration.ofSeconds(40))
                .until(elementToBeClickable(By.id("result_title")));

        System.out.println("Title "+directorName.getText());

        Assert.assertEquals(directorName.getText(),expectedTitle);

    }

    static void checkYear(){
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/index.html");


        String expectedYear = "2017";

        WebElement movieSearch = driver.findElement(By.id("input_text_field"));
        WebElement searchBtn = driver.findElement(By.id("get_film_info"));

        movieSearch.sendKeys("Guardians of the Galaxy Vol. 2");
        searchBtn.click();


        WebElement directorName = new WebDriverWait(driver, Duration.ofSeconds(40))
                .until(elementToBeClickable(By.id("result_year")));

        System.out.println("Year "+directorName.getText());

        Assert.assertEquals(directorName.getText(),expectedYear);

    }

  static void checkDirector(){
    System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

    WebDriver driver = new ChromeDriver();

            driver.get("http://localhost/index.html");


    String expectedDirector = "James Gunn";

    WebElement movieSearch = driver.findElement(By.id("input_text_field"));
    WebElement searchBtn = driver.findElement(By.id("get_film_info"));

            movieSearch.sendKeys("Guardians of the Galaxy Vol. 2");
            searchBtn.click();


    WebElement directorName = new WebDriverWait(driver, Duration.ofSeconds(40))
            .until(elementToBeClickable(By.id("result_director")));

            System.out.println("Director's Name "+directorName.getText());

            Assert.assertEquals(directorName.getText(),expectedDirector);

}


        public static void main (String[]args){

        checkTitle();
        checkYear();
        checkDirector();
    }
}