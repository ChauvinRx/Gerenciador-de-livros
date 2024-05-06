package programa;

public class Book {
	
	String titulo;
	String autor;
	String categoria;
	int anoPublicacao;
	double preco;
	
	public Book(String título, String autor, String categoria, int anoPublicacao, double preco) {
		this.titulo = título;
		this.autor = autor;
		this.categoria = categoria;
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



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
				+ "\n categoria: " + categoria
				+ "\n ano de publicação: " + anoPublicacao
				+ "\n preço: " + preco
				+ "\n ";
	}
	
}