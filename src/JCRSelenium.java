import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

/**
 * Created by lx on 2016/11/6.
 */

public class JCRSelenium {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YJSYF\\Desktop\\chromedriver_win32\\chromedriver.exe");
        System.out.println("starting...");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.fenqubiao.com/Core/CategoryList.aspx");
        for (Cookie cookie : JCRSelenium.click(driver, "cqu_user", "123456")) {
            driver.manage().addCookie(cookie);
        }
        driver.manage().window().maximize();  //maximize the browser window

        setCrawlParameter(driver, "2015", "大类", "地学", "全部");

        Thread.sleep(1000* 4);

        crawlPage(driver);

        Thread.sleep(1000*30);

        driver.close();
        System.out.println("end");
    }

    /**
     * <h2>login and return cookie</h2>
     * @param driver  webdriver
     * @param username  用户名
     * @param password  密码
     * @return
     * @throws InterruptedException
     */
    public static Set<Cookie> click(WebDriver driver, String username, String password) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"Username\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);

        driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();  //登录

        Set<Cookie> cookies = driver.manage().getCookies();

        System.out.println("Cookie.size = " + cookies.size());
        System.out.println("Cookie: " + cookies.toString());

        return cookies;
    }


    /**
     * <h2>set crawl parameter</h2>
     * @param driver  webdriver
     * @param year    年份
     * @param categoryType  大类或小类
     * @param category   类名
     * @param section    所在的收录区
     */
    public static void setCrawlParameter(WebDriver driver,String year, String categoryType, String category, String section){
        Select select_year = new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_dplYear\"]")));
        select_year.selectByVisibleText(year);

        Select select_categoryType = new Select(driver.findElement(By.xpath("/*//*[@id=\"ContentPlaceHolder1_dplCategoryType\"]")));
        select_categoryType.selectByVisibleText(categoryType);

        Select select_category = new Select(driver.findElement(By.xpath("/*//*[@id=\"ContentPlaceHolder1_dplCategory\"]")));
        select_category.selectByVisibleText(category);

        Select select_section = new Select(driver.findElement(By.xpath("/*//*[@id=\"ContentPlaceHolder1_dplSection\"]")));
        select_section.selectByVisibleText(section);

        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnSearch\"]")).click();  //查询
    }

    public static void crawlPage(WebDriver driver){
        String xpath_front = "//*[@id=\"report\"]/tbody/tr[";  //xpath of 期刊名
        String xpath_tail = "]/td[2]/a";

        String total_num_str = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lblMessage\"]/span")).getText();
        int total_num = Integer.parseInt(total_num_str);
        System.out.println(total_num);

        for(int i = 1; i <= total_num; i++) {
            String xpath_journal = xpath_front + i +xpath_tail; // 拼接得到xpath: "//*[@id=\"report\"]/tbody/tr[300]/td[2]/a" for ”期刊名“
            //System.out.println(xpath);
            String ss = driver.findElement(By.xpath(xpath_journal)).getText();
            System.out.println(ss);
        }

        //[@id="report"]/tbody/tr[2]/td[2]/a
        //String ss = driver.findElement(By.xpath(xpath.toString())).toString();
       // System.out.println(ss);
    }
}

