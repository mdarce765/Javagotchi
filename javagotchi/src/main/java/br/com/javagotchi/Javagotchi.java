package br.com.javagotchi;

public class Javagotchi {
    private int hp = 100, fome = 0, idade = 0, higiene = 100, energia = 100;
    private String nome;

    // Getters
    public int getHp(){
        return hp;
    }

    public int getFome(){
        return fome;
    }

    public int getIdade(){
        return idade;
    }

    public int getHigiene(){
        return higiene;
    }

    public int getEnergia(){
        return energia;
    }

    public String getNome(){
        return nome;
    }

    // Setters
    public void setHp(int hp){
        this.hp = hp;
    }

    public void setFome(int fome){
        if(fome >= 100) fome = 100;
        if(fome <= 0) fome = 0;
        this.fome = fome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setHigiene(int higiene){
        if(higiene >= 100) higiene = 100;
        if(higiene <= 0) higiene = 0;
        this.higiene = higiene;
    }

    public void setEnergia(int energia){
        if(energia >= 100) energia = 100;
        if(energia <= 0) energia = 0;
        this.energia = energia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // Métodos auxiliares
    public void alimentar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(this.higiene <= 10){
            System.out.println("JAVAGOTCHI PRECISA SER LIMPO");
            return;
        }

        setFome(0);
        setHigiene(this.higiene - 10);
        System.out.println("SEU JAVAGOTCHI ESTÁ ALIMENTADO");
    }
    
    public void brincar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(this.fome >= 85){
            System.out.println("JAVAGOTCHI PRECISA COMER");
            return;
        }

        if(this.higiene <= 20){
            System.out.println("JAVAGOTCHI PRECISA SER LIMPO");
            return;
        }

        if(this.energia <= 15){
            System.out.println("JAVAGOTCHI ESTÁ CANSADO");
            return;
        }
        
        setFome(this.fome+20);
        setHigiene(this.higiene-40);
        setEnergia(this.energia-20);
        System.out.println("SEU JAVAGOTCHI SE DIVERTIU BASTANTE");
    }
    
    public void banho(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(this.energia <= 5){
            System.out.println("JAVAGOTCHI ESTÁ CANSADO");
            return;
        }

        setHigiene(100);
        System.out.println("JAVAGOTCHI ESTÁ LIMPO");
    }
    
    public void dormir(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(this.fome >= 85){
            System.out.println("JAVAGOTCHI PRECISA COMER");
            return;
        }

        setEnergia(100);
        setFome(this.fome + 20);
        System.out.println("JAVAGOTCHI ESTÁ DESCANSADO");
    }
}
