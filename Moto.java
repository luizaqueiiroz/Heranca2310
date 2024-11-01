package ativs2310;

public class Moto extends Veiculo {
	private String cilindradas;

	public Moto(String marca, String modelo, int ano, String cor, int numeroPortas, String motor, String cilindradas) {
		super(marca, modelo, ano, cor, numeroPortas, motor);
		this.cilindradas = cilindradas;
	}


	public void exibirInfo () {
		System.out.println("Cilindradas: "+cilindradas);
	}
}


