package br.com.javagotchi;

public class Javagotchi {
    private int hp = 100, fome = 0, idade = 0, higiene = 100, energia = 100;
    private String nome;

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


    public void setHp(int hp){
        this.hp = hp;
    }

    public void setFome(int fome){
        this.fome = fome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setHigiene(int higiene){
        this.higiene = higiene;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void Alimentar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(this.higiene <= 10){
            System.out.println("JAVAGOTCHI PRECISA SER LIMPO");
            return;
        }

        setFome(0);
        setHigiene(this.higiene - 10);
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
        
        System.out.println("SEU JAVAGOTCHI SE DIVERTIU BASTANTE");
        setFome(this.fome+20);
        setHigiene(this.higiene-40);
        setEnergia(this.energia-20);
    }
    
    public void banho(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(this.energia <= 5){
            System.out.println("JAVAGOTCHI ESTÁ CANSADO");
            return;
        }

        System.out.println("JAVAGOTCHI ESTÁ LIMPO");
        setHigiene(100);
    }
    
    public void dormir(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(this.fome >= 85){
            System.out.println("JAVAGOTCHI PRECISA COMER");
            return;
        }

        System.out.println("JAVAGOTCHI ESTÁ DESCANSADO");
        setEnergia(100);
        setFome(this.fome + 20);
    }
}
