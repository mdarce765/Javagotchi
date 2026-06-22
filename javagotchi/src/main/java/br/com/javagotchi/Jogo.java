package br.com.javagotchi;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jogo {
	static Scanner sc = new Scanner(System.in);
	static int opcao;

    public static void startGame(Javagotchi jc){
        System.out.println("JOGO INICIADO");
        do{
            System.out.println("\nNOME: \"" + jc.getNome() + "\" HP: " + jc.getHp() + " FOME: " + jc.getFome() + " IDADE: " + jc.getIdade() + " HIGIENE: " + jc.getHigiene() + " ENERGIA: " + jc.getEnergia());
            System.out.print("\n1 - Alimentar\n2 - Brincar\n3 - Banho\n4 - Dormir\n\n0 - Sair e Salvar\nDigite a sua opção: ");
			opcao = Integer.parseInt(sc.nextLine());
			switch(opcao){
					case 0 -> {
						System.out.print("ESCREVENDO OS STATUS ATUAIS");
                        for(int i = 0; i < 3; i++){
                            System.out.print(".");
                            try{
                                Thread.sleep(1500);
                            }catch (InterruptedException e) {
                                Thread.currentThread().interrupt(); 
                            }
                        }
					}
					case 1 -> jc.Alimentar(jc.getHigiene());
					case 2 -> jc.brincar(jc.getFome(), jc.getHigiene(), jc.getEnergia());
					case 3 -> jc.banho();
					case 4 -> jc.dormir(jc.getFome());
					default -> System.out.println("OPÇÃO INVÁLIDA");
				}
		}while(opcao != 0);
    }
}
