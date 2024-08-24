package Exercício03;

import Exercício01.classes.abstratas.Animal;

class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando o animal: " + animal.getNome());
        animal.emitirSom();
    }
}
