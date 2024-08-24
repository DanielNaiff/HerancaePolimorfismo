package Exercício01.classes.concretas;

import Exercício01.classes.abstratas.Animal;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está emitindo um som lento.");
    }

    public void correr() {
        System.out.println(this.getNome() + " não pode correr.");
    }

    public void escalarArvore() {
        System.out.println(this.getNome() + " está subindo uma árvore.");
    }
}