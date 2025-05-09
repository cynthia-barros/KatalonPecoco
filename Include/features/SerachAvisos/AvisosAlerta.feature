#language: pt
#encoding: UTF-8
#Author: Cynthia Barros



Funcionalidade: Busca avisos alarma ALERTA
  
	Esquema do Cenario: Busca avisos em alerta
    Dado que acesso a aplicação <email, senha>
    E clico no menu Avisos
    E preencho dados de pesquisa
    Quando clico no botão consultar
		Entao visualizo os avisos
		
		
  Exemplos: 
    |              email  					|        senha      | 
    | cynthiabarros12+dev@gmail.com |     Teste2025@@@  | 
      