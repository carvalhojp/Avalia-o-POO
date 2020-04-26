package avaliacao;

import java.util.LinkedList;

public class Musico extends Pessoa {
	private String estiloMusical;
	private LinkedList<Filme> filmes = new LinkedList<Filme>();

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	
	public LinkedList<Filme> getFilmes() {
		return filmes;
	}
	public void setResponsaveis(LinkedList<Filme> filmes) {
		this.filmes = filmes;
}
	public void imprimir() {
		System.out.println("Musico: " + nome + " | Data de Nascimento: " + dataNascimento + " | Estilo musical: " + estiloMusical);
}
}
