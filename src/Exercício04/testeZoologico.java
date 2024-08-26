package Exercício04;

import Exercício01.Zoologico;
import Exercício01.classes.concretas.Cachorro;
import Exercício01.classes.concretas.Cavalo;
import Exercício01.classes.concretas.Preguica;

public class testeZoologico {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(new Cachorro("Rex", 3), 0);
        zoologico.adicionarAnimal(new Cavalo("Spirit", 5), 1);
        zoologico.adicionarAnimal(new Preguica("Sid", 2), 2);
        // Adicione outros animais às jaulas conforme necessário

        zoologico.percorrerJaulas();
    }
}
