package ativs2310;

public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected int ano;
	protected String cor;
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	
	
	

	public void exibirInfo() {
		
		
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: "  + ano);
		System.out.println("Cor: " + cor);
	}

}
}
