package Demo2.sexto;
import org.junit.After;

public class AppTest3 extends AppTest {
	
	public void Menu() {
	driver.findElementById("com.example.santiagoastros.cbitdemo:id/editText2").sendKeys("Esto es un demo");
	driver.label("Menu");
	driver.findElementById("com.example.santiagoastros.cbitdemo:id/imageButton").click();	
}

	@After
	public void Finalizar()	{
		driver.label("Finalizando");
		driver.quit();
		driver.label("Automatización Exitosa");
	}
}
