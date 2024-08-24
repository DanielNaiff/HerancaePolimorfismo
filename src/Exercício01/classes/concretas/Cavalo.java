package Exercício01.classes.concretas;

import Exercício01.classes.abstratas.Animal;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + "esta emitindo som");
    }

    public void correr() {
        System.out.println(this.getNome() + " está correndo.");
    }
}
