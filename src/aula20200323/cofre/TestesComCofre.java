package aula20200323.cofre;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	@Test
	void deveAbrirEFecharCofre() {
		
		Cofre cofreFechado = new Cofre();
		assertEquals(false , cofreFechado.isAberto());
		
		cofreFechado.abrir();
		assertEquals(true, cofreFechado.isAberto());
		
		cofreFechado.fechar();
		assertEquals(false, cofreFechado.isAberto());
		
		Cofre cofre = new Cofre();
		cofre.abrir();
		assertEquals(true, cofre.isAberto());
	}
	
	@Test
	void deveAbrirEFecharCofreComSenha() {
		CofreSeguro cofreSeguro = new CofreSeguro("123qwe");
		
		assertEquals(false, cofreSeguro.isAberto());
		
		
		cofreSeguro.abrir("123qwe");
		assertEquals(true, cofreSeguro.isAberto());
		

		CofreSeguro cofreComSenhaIncorreta = new CofreSeguro("qwe321");
		cofreComSenhaIncorreta.abrir("132qwe");
		
		assertEquals(false, cofreComSenhaIncorreta.isAberto());
	}

}
