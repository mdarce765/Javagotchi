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
        if(fome >= 100){
            System.out.println("JAVAGOTCHI PRECISA COMER");
            return;
        }
        this.fome = fome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setHigiene(int higiene){
        if(higiene <= 20){
            System.out.println("JAVAGOTCHI PRECISA SER LIMPO");
            return;
        }
        this.higiene = higiene;
    }

    public void setEnergia(int energia){
        if(energia <= 15){
            System.out.println("JAVAGOTCHI ESTÁ CANSADO");
            return;
        }
        this.energia = energia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void Alimentar(int higiene){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        setFome(0);
        setHigiene(higiene - 10);
        
    }
    
    public void brincar(int fome, int higiene, int energia){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("SEU JAVAGOTCHI SE DIVERTIU BASTANTE");
        setFome(fome+20);
        setHigiene(higiene-40);
        setEnergia(energia-20);
    }
    
    public void banho(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("JAVAGOTCHI ESTÁ LIMPO");
        setHigiene(100);
    }
    
    public void dormir(int fome){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("JAVAGOTCHI ESTÁ DESCANSADO");
        setEnergia(100);
        setFome(fome + 20);
    }
}
