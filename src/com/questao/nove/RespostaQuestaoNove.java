package com.questao.nove;

public class RespostaQuestaoNove {
	
	public static Integer calcularNosSubsequentes(BinaryTree no) {
		
		Integer soma = 0;
			if(no.getLeft() != null){
				soma += no.getLeft().getValor();
				soma += calcularNosSubsequentes(no.getLeft());
			}
			if(no.getRight() != null){
				soma += no.getRight().getValor();
				soma += calcularNosSubsequentes(no.getRight());
			}
		return soma;
	}

}
