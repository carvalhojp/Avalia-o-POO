package avaliacao;

import java.util.LinkedList;

public class Diretor extends Pessoa {
	private LinkedList<Filme> filmes = new LinkedList<Filme>();

	
	public LinkedList<Filme> getFilmes() {
		return filmes;
	}
	public void setResponsaveis(LinkedList<Filme> filmes) {
		this.filmes = filmes;
}

	public void imprimir() {
		System.out.println("Diretor: " + nome + " | Data de Nascimento: " + dataNascimento);
}
}
