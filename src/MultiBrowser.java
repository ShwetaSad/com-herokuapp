import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    /*
   Project-3 - ProjectName: com-herokuapp
BaseUrl = http://the-internet.herokuapp.com/login
1. Set up Multi browser.
2. Open URL.
3. Print the title of the page.
4. Print the current URL.
5. Print the page source.
6. Enter the email in the email field.
7. Enter the password in the password field.
8. Click on the Login Button.
9. Print the current URL.
10. Refresh the page.
11. Close the browser.
    */
        static String browser = "Firefox";
        static String baseurl = "http://the-internet.herokuapp.com/login";
        static WebDriver driver;

        public static void main(String[] args) {
            if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Wrong Browser name");
            }

            // Open the Url
            driver.get(baseurl);
            // Print the Title of the page
            System.out.println("The Title of the page is " + driver.getTitle());
            // Print the Current Url
            System.out.println("The current URL is " + driver.getCurrentUrl());
// Print the Page Source
            System.out.println("The Page Source is " + driver.getPageSource());
            // Enter username in the username field
            WebElement search = driver.findElement(By.id("username"));
            search.sendKeys("admin");
            //Enter password in the password field
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("admin");
            // Click on the Login Button

            WebElement login = driver.findElement(By.id("login"));
            login.click();
            // Print the current URl
            System.out.println("The Current URL is " + driver.getCurrentUrl());
            // refresh the page
            driver.navigate().

                    refresh();
            // close the browser
            driver.quit();


        }
    }
