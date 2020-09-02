package com.QaBasicAutomatization.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	//Lo primero es crear un objeto de tipo WebDriver
	private WebDriver driver;
	//Se crea el evento y parametrizaciones antes de ejecutar la prueba
	@Before
	public void setUp() {		
		//setiar el ejecutable
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");		
		//declara el objeto de tipo ChromeDriver
		driver = new ChromeDriver();		
		//maximizar la ventana del navegador
		driver.manage().window().maximize();		
		//abrir la web a la cual vamos a realizar la prueba
		driver.get("https://www.google.com/");
	}	
	//Se crean los eventos donde realizaremos nuestros casos de prueba
	@Test
	public void testGooglePage() {		
		//Se crean los web elements para la ejecuci�n
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("Selenium");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Selenium - Buscar con Google", driver.getTitle());		
	}	
	//Se crean los enventos para despues de la ejecuci�n
	@After
	public void tearDown() {
		//cierra el navegador una vez completado el caso de prueba
		driver.quit();
}
	
	
}
