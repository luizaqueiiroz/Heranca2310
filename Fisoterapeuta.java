package ativs2310;

public class Fisoterapeuta extends ProfissionalSaude {

	protected String crefito;

	public Fisoterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}

	public void agendarConsulta() {
		System.out.println("Agendar consulta fisioterapeutica");
	}

}