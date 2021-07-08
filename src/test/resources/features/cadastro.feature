#Author: drodrigues021@gmail.com


Feature: Cadastro no site
 Eu como usuario quero acessar o site para realizar novo cadastro

  
  
  Background: Cadastro/login 
    Given que eu esteja no site "http://advantageonlineshopping.com/#/"

  
  Scenario: CT1 Novo cadastro
    And esteja pagina de cadastro
    When eu preencho todas todas as informacoes de cadastro
    Then eu verico a finalização de cadastro

  Scenario: CT2 Login com dados validos
    And esteja pagina de login
    When eu preencho com dados validos
    Then e verifico a efetuacao de login
        
  Scenario: CT3 login com dados de usuario invalido
    And esteja pagina de login
    When eu preencho com dados de usuario invalido
    But nao efetua login por dados usuario invalido
    Then verifico a nao efetuacao de login por usuario invalido
    
  Scenario: CT4 login com dados de senha invalido
    And esteja pagina de cadastro
    When eu preencho com dados de senha invalido
    But nao efetua login por dados de senha invalido
    Then verifico a nao efetuacao de login por senha invalida
  

  