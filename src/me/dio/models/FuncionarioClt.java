package me.dio.models;

public abstract class FuncionarioClt {
	protected String nome;
	protected String documento;
	protected Double valorSalario;
	protected Endereco endereco;
	
	public FuncionarioClt () {
		
		
	}

	public FuncionarioClt(String nome, String documento, Double valorSalario, Endereco endereco) {
		super();
		this.nome = nome;
		this.documento = documento;
		this.valorSalario = valorSalario;
		this.endereco = endereco;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(Double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
