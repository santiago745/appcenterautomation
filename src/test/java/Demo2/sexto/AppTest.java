package Demo2.sexto;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

public class AppTest {
	
	@Rule
	public TestWatcher watcher = Factory.createWatcher();
    public static EnhancedAndroidDriver<MobileElement> driver;
	String path;
	
	@Before
	public void Iniciar()
	{
		System.out.println("Iniciando Sesion");
		path = System.getProperty("user.dir");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Moto G");
		cap.setCapability("app", path+"//app//app-debug.apk");
		try {
			driver = Factory.createAndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AppTest2 lg=new AppTest2();
		AppTest3 lf=new AppTest3();
		lg.Login();
		lf.Menu();
		lf.Finalizar();
	}
	
		@Test
		public void DemoApp(){
	
		}


	

}
