package Exercício06;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasica;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
        this.escolaBasica = escolaBasica;
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.10; // 10% de aumento sobre a renda básica
    }
}
