package br.com.javagotchi;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		Javagotchi jc = new Javagotchi();
		Scanner sc = new Scanner(System.in);

		jc.setNome("Izanagi");
		jc.setEnergia(100);

		System.out.println("Nome = " + jc.getNome());

		do{
			System.out.println("""
							1 - Carregar Javagotchi
							2 - Criar novo Javagotchi
							0 - Sair
							""");
			System.out.print("Digite a sua opção: ");
			int opcao = sc.nextInt();
			switch(opcao){
					case 0 -> {
						System.out.println("SAINDO... NÃO SE ESQUEÇA DE NÓS :)");
						System.exit(0);
					}
					//case 1 -> carregarJavagotchi();
					//case 2 -> criarJavagotchi();
					default -> System.out.println("OPÇÃO INVÁLIDA");
				}
		}while(true);
	}
}
