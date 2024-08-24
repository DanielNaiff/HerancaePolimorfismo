package Exercício01.classes.abstratas;

public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(){
        this.nome = "";
        this.idade = 0;
    }

    public Animal(String nome){
        this.nome = nome;
        this.idade = 0;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
