package Exercício06;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaBasica, String escolaMedia, String universidade) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2.00; // 100% de aumento sobre a renda do nível anterior
    }
}
