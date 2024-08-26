package Exercício06;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedia;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasica, String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.50; // 50% de aumento sobre a renda do nível anterior
    }
}
