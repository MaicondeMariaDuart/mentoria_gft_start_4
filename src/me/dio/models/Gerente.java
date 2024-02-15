package me.dio.models;

public class Gerente extends FuncionarioPJ implements CalcularBonificacao{
	
	private Double valorBonificacao;

	@Override
	public String toString() {
		return "Gerente=" + getNome() + ", Documento=" + getDocumento() + ", Endereco()="
				+ getEndereco() + ", HorasTrabalhadas=" + getHorasTrabalhadas() + ", ValorHora()="
				+ getValorHora() + ", ValorRenumeracao=" + getValorRenumeracao() + 
				",ValorBonificação="+ this.valorBonificacao + "]";
	}

	@Override
	public void calculaBonificacao(Double porcentagemBonificacao) {
		this.valorBonificacao =  (super.getValorRenumeracao() * (porcentagemBonificacao/100)) * 100d;
		
	}
	
	
	
}
