package aula20200320.testesGerais;

public class GerenciadorDeComissao {
	
	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda  * percentualDeComissao / 100 ;
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda, double percentualDeComissao) {
		double valorAtingidoDeComissao = valorDaVenda * percentualDeComissao / 100;
		
		if(valorAtingidoDeComissao >= valorMinimo) {
			return valorAtingidoDeComissao;
		}
		
		return  valorMinimo;
	}

	public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda, double percentualDeComissao) {
		double valorAtingidoDeComissao = valorDaVenda * percentualDeComissao / 100;
		
		if(valorAtingidoDeComissao <= valorMinimo) {
			return valorMinimo;
		}
		
		if(valorAtingidoDeComissao >= valorMinimo && valorAtingidoDeComissao <= valorMaximo) {
			return valorAtingidoDeComissao;
		}
		
		return valorMaximo;
	}

}
