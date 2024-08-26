package Exercício01;

import Exercício01.classes.abstratas.Animal;
import Exercício01.classes.concretas.Cachorro;
import Exercício01.classes.concretas.Cavalo;
import Exercício01.classes.concretas.Preguica;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        this.jaulas = new Animal[10];
    }

    public void adicionarAnimal(Animal animal, int index) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                if (animal instanceof Cachorro) {
                    ((Cachorro) animal).correr();
                } else if (animal instanceof Cavalo) {
                    ((Cavalo) animal).correr();
                } else if (animal instanceof Preguica) {
                    ((Preguica) animal).escalarArvore();
                }
            }
        }
    }
}