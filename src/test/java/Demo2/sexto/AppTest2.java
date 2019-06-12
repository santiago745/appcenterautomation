package Demo2.sexto;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;

public class AppTest2 extends AppTest{
	
	public void Login()
	{
		driver.label("Login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.example.santiagoastros.cbitdemo:id/editText").sendKeys("Test@gmail.com");		
		driver.findElementById("com.example.santiagoastros.cbitdemo:id/editText4").sendKeys("Test123");
		driver.findElementById("com.example.santiagoastros.cbitdemo:id/switch1").click();
		driver.label("Enviando Textos");
		driver.findElementById("com.example.santiagoastros.cbitdemo:id/button").click();
		driver.label("Siguiente");
}
}
