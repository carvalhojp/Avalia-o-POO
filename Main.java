package avaliacao;

public class Main {

	public static void main(String[] args) {
		
		Filme jp = new Filme();
		jp.setTitulo("Jurassic Park");
		jp.setAnoLancamento("1993");
		
		Ator a1 = new Ator();
		a1.setNome("Jeff Goldblum");
		a1.setDataNascimento("22/10/1952");
		a1.setNacionalidade("Americana");
		
		Ator a2 = new Ator();
		a2.setNome("Sam Neill");
		a2.setDataNascimento("17/09/1947");
		a2.setNacionalidade("Britânica");
		
		Ator a3 = new Ator();
		a3.setNome("Laura Dern");
		a3.setDataNascimento("10/02/1967");
		a3.setNacionalidade("Americana");
		
		Diretor d = new Diretor();
		d.setNome("Steven Spielberg");
		d.setDataNascimento("18/12/1946");
		
		Musico m1 = new Musico();
		m1.setNome("John Williams");
		m1.setDataNascimento("08/02/1932");
		m1.setEstiloMusical("Clássica");
		
		Filme px = new Filme();
		px.setTitulo("Pixels");
		px.setAnoLancamento("2015");
		
		Ator a4 = new Ator();
		a4.setNome("Adam Sandler");
		a4.setDataNascimento("09/09/1966");
		a4.setNacionalidade("Americana");
		
		Ator a5 = new Ator();
		a5.setNome("Peter Dinklage");
		a5.setDataNascimento("11/06/1969");
		a5.setNacionalidade("Americana");
		
		Ator a6 = new Ator();
		a6.setNome("Josh Gad");
		a6.setDataNascimento("23/02/1981");
		a6.setNacionalidade("Americana");
		
		Diretor d2 = new Diretor();
		d2.setNome("Chris Columbus");
		d2.setDataNascimento("10/09/1958");
		
		Musico m2 = new Musico();
		m2.setNome("Henry Jackman");
		m2.setDataNascimento("30/07/1974");
		m2.setEstiloMusical("Eletrônica");

		jp.getAtores().add(a1);
		jp.getAtores().add(a2);
		jp.getAtores().add(a3);
		a1.getFilmes().add(jp);
		a2.getFilmes().add(jp);
		a3.getFilmes().add(jp);
		
		px.getAtores().add(a4);
		px.getAtores().add(a5);
		px.getAtores().add(a6);
		a4.getFilmes().add(px);
		a5.getFilmes().add(px);
		a6.getFilmes().add(px);
		
		jp.getMusicos().add(m1);
		m1.getFilmes().add(jp);
		
		px.getMusicos().add(m2);
		m2.getFilmes().add(px);
		
		jp.setDiretor(d);
		d.getFilmes().add(jp);
		
		px.setDiretor(d2);
		d2.getFilmes().add(px);
		
		jp.imprimir();
		for (Ator a : jp.getAtores()) {
			a.imprimir();
		}
		for (Musico m : jp.getMusicos()) {
			m.imprimir();
		}
		jp.getDiretor().imprimir();
		
		px.imprimir();
		for (Ator a : px.getAtores()) {
			a.imprimir();
		}
		for (Musico m : px.getMusicos()) {
			m.imprimir();
		}
		px.getDiretor().imprimir();
		
	}

}
