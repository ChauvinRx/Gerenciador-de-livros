package programa;

public class Book {
	
	String titulo;
	String autor;
	int anoPublicacao;
	double preco;
	
	public Book(String título, String autor, int anoPublicacao, double preco) {
		this.titulo = título;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	


	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getAnoPublicacao() {
		return anoPublicacao;
	}



	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	@Override
	public String toString() {
		return "Título: " + titulo
				+ "\n autor: " + autor
				+ "\n ano de publicação: " + anoPublicacao
				+ "\n preço: " + preco
				+ "\n ";
	}
	
}