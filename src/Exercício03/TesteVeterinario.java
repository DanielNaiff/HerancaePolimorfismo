package Exercício03;

import Exercício01.classes.abstratas.Animal;
import Exercício01.classes.concretas.Cachorro;
import Exercício01.classes.concretas.Cavalo;
import Exercício01.classes.concretas.Preguica;

public class TesteVeterinario {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 8);
        Animal preguica = new Preguica("Sid", 3);

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
