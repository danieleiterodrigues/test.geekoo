package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	WebDriver driver;

	/**
	 * Método Abrir Navegador
	 * 
	 * @author Daniel Leite
	 * @param texto
	 * @param site
	 */

	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("-----ERROR AO ABRIR NAVEGADOR----- " + e.getMessage());
		}

	}

	/**
	 * Metodo Escrever
	 * 
	 * @author Daniel Leite
	 * @param elemento
	 * @param texto
	 */

	public void escrever(By elemento, String texto) {
		try {
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("-----ERROR AO ESCREVER----- " + e.getMessage());
		}

	}

	/**
	 * Metodo Click
	 * 
	 * @author Daniel Leites
	 * @param elemento
	 */

	public void click(By elemento, String passo) {
		try {
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("-----ERROR AO CLICAR----- " + passo + e.getMessage());
		}
	}

	/**
	 * Metodo Submit
	 * 
	 * @author Daniel Leite
	 * @param elemento
	 */
	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("-----ERROR AO ENVIAR----- " + e.getMessage());
		}

	}

	/**
	 * @author Daniel Leite Metodo Fechar Navegador
	 */
	public void fecharNavegador() {
		try {
			driver.quit();

		} catch (Exception e) {
			System.out.println("-----ERROR AO FECHAR NAVEGADOR-----" + e.getMessage());
		}
	}

	/**
	 * Metodo Tirar Foto
	 * 
	 * @author Daniel Leite
	 * @param nome
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public void tirarFoto(String nome) throws IOException, InterruptedException {
		Thread.sleep(4000);
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}
	

	/**
	 * Metodo para validar se dois textos são iguais
	 * 
	 * @param elemento
	 * @param textoEsperado
	 * @param passo
	 */
	public void validarTexto(By elemento, String textoEsperado, String passo) {
		try {
			Thread.sleep(3000);
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.err.println("-------- error ao validar texto -------" + passo + " " + e.getMessage());
		}

	}

	

}
