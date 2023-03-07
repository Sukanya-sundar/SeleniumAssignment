package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAssignment {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sukanya");
		driver.findElement(By.name("lastname")).sendKeys("Sundar");
		driver.findElement(By.name("reg_email__")).sendKeys("9600950208");
		driver.findElement(By.id("password_step_input")).sendKeys("facebookspr");
		WebElement drop = driver.findElement(By.name("birthday_day"));
		Select drop1=new Select(drop);
		drop1.selectByIndex(17);
		WebElement source = driver.findElement(By.name("birthday_month"));
		Select drop2= new Select(source);
		drop2.selectByIndex(9);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select drop3= new Select(year);
		drop3.selectByVisibleText("1995");
		driver.findElement(By.className("_58mt")).click();
	}

}
