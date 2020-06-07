package steps_mapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import models.Cadastro;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterPage;
import pages.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class Step_mapping {

	private static WebDriver driver;
	
	// Secao dedicada a gerar/inserir os dados a serem utilizados pelo cadastro
	
	static Cadastro cadastro = new Cadastro();
	
	public void geraDadosCadastro() {
		cadastro.setNome("Nome");
		cadastro.setSobrenome("Sobrenome do Cliente");
		cadastro.setSenha("S3nh@");
		cadastro.setTelefone("12125558737");
		cadastro.setRua("711 11th Ave");
		cadastro.setCidade("New York");
		cadastro.setCep("10019");
		cadastro.setEstado("New York");
		cadastro.setAliasEndereco("Commercial Address");
	}

	
	// Steps para criar uma nova conta
	@Given ("Acessada a pagina da loja")
	   public void lojahomePage_open() {
	   	System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
			driver = new FirefoxDriver();
		    driver.get("http://automationpractice.com/");
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
	   }
	
	@And ("E clicado o botao Sign in")
	public void signInButton_click() {
		HomePage homePage = new HomePage(driver);
		homePage.signInButton_click();
	}
	
	@When ("O usuario preenche um e-mail e clica no botao de Create an account")
	public void typeEmailNewAccountButton_click() {
		SignInPage signinPage = new SignInPage(driver);
		signinPage.typeNewEmail();
		signinPage.clickNewAccount();
		
	}
	
	@And ("E preenche todos os dados obrigatorios da compra")
	public void fillOutAccountFormAndRegisterButton_click() {
		RegisterPage registerPage = new RegisterPage(driver);
		geraDadosCadastro();
		registerPage.fillOutForm_method(driver, cadastro.getNome(), cadastro.getSobrenome(), 
				cadastro.getSenha(), cadastro.getRua(), cadastro.getCidade(), cadastro.getEstado(), 
				cadastro.getCep(), cadastro.getTelefone(), cadastro.getAliasEndereco());
	}
	
	@Then ("O site abre a pagina de detalhes da conta")
	public void myAccountPage_validate() {
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.validateMyAccountPage_method();
		driver.close();
	}
	

	
}
