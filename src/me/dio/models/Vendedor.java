package me.dio.models;

public class Vendedor extends FuncionarioClt implements CalcularBonificacao{
	private Double valorDaBonificacao;

	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", documento=" + documento + ", valorSalario=" + valorSalario + ", endereco="
				+ endereco.getBairro()+",valorDaBonificação="+valorDaBonificacao + "]";
	}

	@Override
	public void calculaBonificacao(Double porcentagemBonificacao) {
		this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/188d);
		
	}
	
	

}
