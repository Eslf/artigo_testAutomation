package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	// Construtor
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	// Elementos
	
	@FindBy(how = How.ID, using = "id_gender1")
	private WebElement gender_radioButton;
	
	@FindBy(how = How.CSS, using = "#customer_firstname")
	private WebElement firstName_input;
	
	@FindBy(how = How.CSS, using = "#customer_lastname")
	private WebElement lastName_input;
	
	@FindBy(how = How.CSS, using = "#passwd")
	private WebElement password_input;
	
	@FindBy(how = How.CSS, using = "#address1")
	private WebElement address_input;
	
	@FindBy(how = How.CSS, using = "#city")
	private WebElement city_input;
	
	@FindBy(how = How.NAME, using = "id_state")
	private WebElement state_selectable;
	
	@FindBy(how = How.CSS, using = "#postcode")
	private WebElement postcode_input;
	
	@FindBy(how = How.CSS, using = "#phone_mobile")
	private WebElement phoneMobile_input;
	
	@FindBy(how = How.CSS, using = "#alias")
	private WebElement aliasAddress_input;
	
	@FindBy(how = How.CSS, using = "#submitAccount")
	private WebElement submitAccount_button;
	
	// Acoes
	
	private void selectGender(WebDriver driver) {
		WebDriverWait wait_id_gender1 = new WebDriverWait(driver, 3);
		wait_id_gender1.until(ExpectedConditions.visibilityOf(gender_radioButton));
		gender_radioButton.click();
	}
	
	private void firstName_fillOut(String nome) {
		firstName_input.sendKeys(nome);
	}
	
	private void lastName_fillOut(String sobrenome) {
		lastName_input.sendKeys(sobrenome);
	}
	
	private void password_fillOut(String senha) {
		password_input.sendKeys(senha);
	}
	
	private void address_fillOut(String rua) {
		address_input.sendKeys(rua);
	}
	
	private void city_fillOut(String cidade) {
		city_input.sendKeys(cidade);
	}
	
	private void state_selection(String estado) {
		Select lista_estados = new Select(state_selectable);
		lista_estados.selectByVisibleText(estado);
	}
	
	private void postcode_fillOut(String cep) {
		postcode_input.sendKeys(cep);
	}
	
	private void phoneMobile_fillOut(String telefone) {
		phoneMobile_input.sendKeys(telefone);
	}
	
	private void aliasAddress_fillOut(String alias) {
		aliasAddress_input.clear();
		aliasAddress_input.sendKeys(alias);
	}
	
	private void submitAccountButton_click() {
		submitAccount_button.click();
	}
	
	// Acoes centralizadas num unico metodo
	
	public void fillOutForm_method(WebDriver driver, String nome, String sobrenome, String senha, 
			String rua, String cidade, String estado, String cep, String telefone, String alias) {
		selectGender(driver);
		firstName_fillOut(nome);
		lastName_fillOut(sobrenome);
		password_fillOut(senha);
		address_fillOut(rua);
		city_fillOut(cidade);
		state_selection(estado);
		postcode_fillOut(cep);
		phoneMobile_fillOut(telefone);
		aliasAddress_fillOut(alias);
		submitAccountButton_click();
	}
	
}
