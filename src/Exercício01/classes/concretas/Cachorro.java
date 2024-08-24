package Exercício01.classes.concretas;

import Exercício01.classes.abstratas.Animal;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + "esta latindo");
    }

    public void correr() {
        System.out.println(this.getNome() + " está correndo.");
    }
}
