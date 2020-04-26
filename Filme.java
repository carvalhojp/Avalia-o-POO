package avaliacao;

import java.util.LinkedList;

public class Filme {
	private String titulo;
	private String anoLancamento;
	private LinkedList<Ator> atores = new LinkedList<Ator>();
	private LinkedList<Musico> musicos = new LinkedList<Musico>();	
	private Diretor diretor;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public LinkedList<Ator> getAtores() {
		return atores;
	}
	public void setAtores(LinkedList<Ator> atores) {
		this.atores = atores;
}
	public LinkedList<Musico> getMusicos() {
		return musicos;
	}
	public void setMusicos(LinkedList<Musico> musicos) {
		this.musicos = musicos;
}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	public void imprimir() {
		System.out.println("Nome do filme: " + titulo + " | Ano de lançamento: " + anoLancamento);
}
	
}
