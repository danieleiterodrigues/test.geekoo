package elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	private By menuUser = By.id("menuUser");
	private By createNewAccount = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By name = By.name("usernameRegisterPage");
	private By email = By.name("emailRegisterPage");
	private By registropassword = By.name("passwordRegisterPage");
	private By confirPassword = By.name("confirm_passwordRegisterPage");
	private By primeiroNome = By.name("first_nameRegisterPage");
	private By segundoNome = By.name("last_nameRegisterPage");
	private By numeroTelefonico = By.name("phone_numberRegisterPage");
	private By pais = By.name("countryListboxRegisterPage");
	private By cidade = By.name("cityRegisterPage");
	private By endereco = By.name("addressRegisterPage");
	private By estado = By.name("state_/_province_/_regionRegisterPage");
	private By cep = By.name("postal_codeRegisterPage");
	private By aceitarTermos = By.name("i_agree");
	private By btnRegister = By.id("register_btnundefined");
	private By entrar = By.id("sign_in_btnundefined");
	private By userName = By.name("username"); 
	private By password = By.name("password");
	public By menuUserLink = By.id("menuUserLink");
	
	
	public By getMenuUser() {
		return menuUser;
	}
	public By getCreateNewAccount() {
		return createNewAccount;
	}
	public By getName() {
		return name;
	}
	public By getEmail() {
		return email;
	}
	public By getRegistropassword() {
		return registropassword;
	}
	public By getEntrar() {
		return entrar;
	}
	public By getUserName() {
		return userName;
	}
	public By getPassword() {
		return password;
	}
	public By getConfirPassword() {
		return confirPassword;
	}
	public By getPrimeiroNome() {
		return primeiroNome;
	}
	public By getSegundoNome() {
		return segundoNome;
	}
	public By getNumeroTelefonico() {
		return numeroTelefonico;
	}
	public By getPais() {
		return pais;
	}
	public By getCidade() {
		return cidade;
	}
	public By getEndereco() {
		return endereco;
	}
	public By getEstado() {
		return estado;
	}
	public By getCep() {
		return cep;
	}
	public By getAceitarTermos() {
		return aceitarTermos;
	}
	public By getBtnRegister() {
		return btnRegister;
	}
	public By getEntar() {
		return entrar;
	}
	
		
}
