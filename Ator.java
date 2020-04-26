package avaliacao;

import java.util.LinkedList;


public class Ator extends Pessoa {
	private String nacionalidade;
	private LinkedList<Filme> filmes = new LinkedList<Filme>();

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public LinkedList<Filme> getFilmes() {
		return filmes;
	}
	public void setResponsaveis(LinkedList<Filme> filmes) {
		this.filmes = filmes;
}
	public void imprimir() {
		System.out.println("Ator: " + nome + " | Data de Nascimento: " + dataNascimento + " | Nacionalidade: " + nacionalidade);
}
	
}
