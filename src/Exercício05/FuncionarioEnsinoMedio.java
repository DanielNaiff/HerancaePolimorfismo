package Exercício05;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedia;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasica, String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }
}
