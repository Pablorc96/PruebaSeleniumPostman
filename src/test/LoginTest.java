package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	public static void main(String[] args) {
		
		/* 1º Cargamos el driver de Selenium para chrome */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikto\\workspace\\SeleniumTests\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/* 2º Cargamos la url a testear en el driver */
		String url = "https://adas.uclm.es/SAML2/SSOService.php?SAMLRequest=lZLdTuMwEIVfJfJ9GjdtQ2O1lQoV2kqwVKTsxd6gqTNQS4md9YxheXucluVHQpX2zpqZc%2Bb408wI2qZTy8B7e4t%2FAhInf9vGkjo05iJ4qxyQIWWhRVKsVbW8vlL5QKrOO3baNeKT5LQCiNCzcVYk69Vc3I%2BLWu6K8aQohnk51mPM8%2BkUcIIPRT2anEEpa5nL3VmuRfILPUXlXESjKCcKuLbEYDmW5HCayjIdlltZKjlSI%2FlbJKv4G2OBD6o9c0cqy6AGGgTdtAOkrA%2BWZ1V1U6F%2FMhoH3b4TyfJfygtnKbTo37p3t1cfPhraLtCT8RygeTeECDLrOeQZdcdHCpp63%2B8VItm8UTw3tjb28TTA3XGI1I%2FtdpNubqqtWMz6NeoAxC%2F%2BJ16LHGkw9Olm2WeX2fEsfsb969XGNUa%2FJJfOt8Cn4%2FUVU6cPh1HFHiwZtByRNo17vvAIjHPBPqDIFseVX49v8Qo%3D&RelayState=https%3A%2F%2Fcampusvirtual.uclm.es%2F&SigAlg=http%3A%2F%2Fwww.w3.org%2F2001%2F04%2Fxmldsig-more%23rsa-sha256&Signature=FILPVtd9wUXrKr1731bqMiYwypI6ZpyC9ataYeMlVq5bn910%2F2%2F0M1DpB9hUo78eQandccmwruCFsHECUb1EaO1Z1LkDQDTK%2FaeNgK9l%2F6rBJg0w7rWFlsZcSBMezg%2Bj6yFVxvmmonTO4W5HVaxK1AidyZf6A5IsGV%2B5%2Fhy%2BxFL2HU1bpciztpXWGE5CsARrcXBPvMDR%2BFM4N0pvEinqOXuOi20F7i%2BPjt0x%2F8AHcGlkrRC7Hb9T%2Bjt4gQ1W6oDo5pi%2BdtMhsE2vZrdWCYa4568DewuOpdv%2FEPURa2vIqkipwEx%2B2Sn8yeToCbgOpYd5wNQAICBoJ3XEoZOwQb4JCQ%3D%3D";
		driver.get(url);
		
		/* 3º Obtenemos las referencias de los WebElements y ejecutamos los pasos a testear */
		WebElement username = driver.findElement(By.id("edit-name"));
		username.sendKeys("user");
		
		WebElement pass = driver.findElement(By.id("edit-pass"));
		pass.sendKeys("pass");
		
		WebElement submit = driver.findElement(By.id("submit_ok_uclm"));
		submit.click();
		
		
	}

}
