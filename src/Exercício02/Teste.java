package Exercício02;

import Exercício01.classes.abstratas.Animal;
import Exercício01.classes.concretas.Cachorro;
import Exercício01.classes.concretas.Cavalo;
import Exercício01.classes.concretas.Preguica;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 8);
        Animal preguica = new Preguica("Sid", 3);

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
