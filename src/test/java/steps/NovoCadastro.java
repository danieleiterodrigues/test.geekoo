package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class NovoCadastro {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		metodos.abrirNavegador(site);
	}

	@Given("esteja pagina de cadastro")
	public void esteja_pagina_de_cadastro() {
		metodos.click(el.menuUserLink, "clique no menu de login e cadastro");
	}

	@When("eu preencho todas todas as informacoes de cadastro")
	public void eu_preencho_todas_todas_as_informacoes_de_cadastro() {

		metodos.click(el.getCreateNewAccount(), "Clicando no botao de novo cadastro");
		metodos.escrever(el.getName(), "usuarioteste103");
		metodos.escrever(el.getEmail(), "usuarioteste13@teste.com.br");
		metodos.escrever(el.getRegistropassword(), "userTeste21");
		metodos.escrever(el.getConfirPassword(), "userTeste21");
	
		metodos.click(el.getAceitarTermos(), "Aceitando termos de uso");
		metodos.click(el.getBtnRegister(), "Enviando formulario de novo cadastro");

	}

	@Then("eu verico a finalização de cadastro")
	public void eu_verico_a_finalização_de_cadastro() throws IOException, InterruptedException {
		metodos.tirarFoto("Validação-Cadastro Com Sucesso");
		metodos.fecharNavegador();

	}

	@Given("esteja pagina de login")
	public void esteja_pagina_de_login() {
		metodos.click(el.menuUserLink, "clique no menu de login e cadastro");

	}

	@When("eu preencho com dados validos")
	public void eu_preencho_com_dados_validos() {
		metodos.escrever(el.getUserName(), "usuarioteste103");
		metodos.escrever(el.getPassword(), "uuserTeste21");

	}

	@Then("e verifico a efetuacao de login")
	public void e_verifico_a_efetuacao_de_login() throws IOException, InterruptedException {
		metodos.tirarFoto("Login efetuado com Sucesso");
		metodos.fecharNavegador();

	}

	@When("eu preencho com dados de usuario invalido")
	public void eu_preencho_com_dados_de_usuario_invalido() {
		metodos.escrever(el.getUserName(), "usuarioteste10");
		metodos.escrever(el.getPassword(), "userTeste21");

	}

	@When("nao efetua login por dados usuario invalido")
	public void nao_efetua_login_por_dados_usuario_invalido() {
		metodos.click(el.getEntar(), "efetuar login");

	}

	@Then("verifico a nao efetuacao de login por usuario invalido")
	public void verifico_a_nao_efetuacao_de_login_por_usuario_invalido() throws IOException, InterruptedException {
		metodos.tirarFoto("login não efetuado - user invalido");
		metodos.fecharNavegador();

	}
	
	@When("eu preencho com dados de senha invalido")
	public void eu_preencho_com_dados_de_senha_invalido() {
		metodos.escrever(el.getUserName(), "usuarioteste103");
		metodos.escrever(el.getPassword(), "userTeste");
	}

	@When("nao efetua login por dados de senha invalido")
	public void nao_efetua_login_por_dados_de_senha_invalido() {
		metodos.click(el.getEntar(), "efetuar login");

	}

	@Then("verifico a nao efetuacao de login por senha invalida")
	public void verifico_a_nao_efetuacao_de_login_por_senha_invalida() throws IOException, InterruptedException {
		metodos.tirarFoto("login não efetuado - senha invalida");
		metodos.fecharNavegador();

	}
}
