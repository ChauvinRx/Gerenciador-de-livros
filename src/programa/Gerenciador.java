package programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Gerenciador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		List<Book> livros = new ArrayList<>();
		Book livro;
		
		do {
		System.out.println();
		System.out.println("COMPANHIA LIVROS CHAVOSOS");
		System.out.println("Favor selecionar uma das opções abaixo:");
		System.out.println();
		System.out.println("1. Adicionar Livro");
		System.out.println("2. Listar Livros");
		System.out.println("3. Buscar Livro por Título");
		System.out.println("4. Buscar Livro por Categoria");
		System.out.println("5. Atualizar Livro");
		System.out.println("6. Remover Livro");
		System.out.println("7. Sair");
		x = sc.nextInt();
		sc.nextLine();
		
		switch(x){
			case 1:
				System.out.print("Título: ");
				String titulo = sc.nextLine();
				System.out.print("Autor: ");
				String autor = sc.nextLine();
				System.out.print("Categoria: ");
				String categoria = sc.nextLine();
				System.out.print("Ano de publicação: ");
				int ano = sc.nextInt();
				System.out.print("Preço do livro: ");
				double preco = sc.nextDouble();
				sc.nextLine();
				livro = new Book(titulo, autor, categoria, ano, preco);
				System.out.println("Livro adicionado com sucesso!");
				livros.add(livro);
				break;
			case 2:	
				System.out.print("Número total de livros: " + livros.size());
				System.out.println("\n --------------------------------------------------");
				 Collections.sort(livros, new Comparator<Book>() {
			            @Override
			            public int compare(Book livros1, Book livros2) {
			            	return livros1.titulo.compareTo(livros2.titulo);
			            }
			        });
				 
				 Book livroMaisCaro = Collections.max(livros, Comparator.comparing(l -> l.preco));
			        System.out.println("Livro mais caro: " + livroMaisCaro.titulo + " - Preço: " + livroMaisCaro.preco);
				System.out.println(livros);
				break;
			case 3:
				System.out.print("Título do Livro para buscar: ");
				String busca = sc.nextLine();
				for(Book nomeLivro : livros) {
					if(nomeLivro.titulo.equals(busca)) {
						System.out.println("Livro encontrado: \n" + nomeLivro);
						break;
					}
				}
				break;
			case 4:
				System.out.print("Digite a categoria que deseja pesquisar: ");
				String pesquisa = sc.nextLine();
				for(Book categoriaLivro : livros) {
					if(categoriaLivro.categoria.equals(pesquisa)) {
						System.out.println(categoriaLivro);
					}
				}
				break;
			case 5:
				System.out.println("Livros registrados: \n" + livros);
				System.out.print("Digite o nome do livro que deseja atualizar:");
				String atualizar = sc.nextLine();
				for(Book att : livros) {
					if(att.titulo.equals(atualizar)) {
						System.out.print("Digite o título do livro: ");
						titulo = sc.nextLine();
						livros.get(livros.indexOf(att)).setTitulo(titulo);
						System.out.print("Digite o nome do autor do livro: ");
						autor = sc.nextLine();
						livros.get(livros.indexOf(att)).setAutor(autor);
						System.out.print("Digite o ano de publicação: ");
						ano = sc.nextInt();
						livros.get(livros.indexOf(att)).setAnoPublicacao(ano);
						System.out.print("Valor do livro: ");
						preco = sc.nextDouble();
						livros.get(livros.indexOf(att)).setPreco(preco);
						sc.nextLine();
						
						System.out.println("Livro atualizado! \n" + livros.get(livros.indexOf(att)));
						break;
					} else {
						System.out.println("Livro não encontrado!");
					}
				}
				break;
			case 6:
				System.out.print("Digite o nome do livro que vai ser removido: ");
				String remover = sc.nextLine();
				for(Book removerLivro : livros) {
					if(removerLivro.titulo.equals(remover)) {
						livros.remove(removerLivro);
						System.out.println("Livro removido com sucesso!");
						break;
					}else{
						System.out.println("Livro não encontrado!");
					}
				}
				
		}
		}while(x != 7);
		
		
				
			sc.close();
		}

	}