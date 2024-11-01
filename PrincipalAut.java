package ativs2310;

public class PrincipalAut {

	public static void main(String[] args) {
		Automovel carro1 = new Automovel("Ford", "gt", 2020, "Rosa", 4, "v8");
		Moto moto1 = new Moto("Honda", "Cg", 2020, "Rosa", 150);
		
		carro1.exibirInfo();
		System.out.println();
		moto1.exibirInfo();
	}

}
