package Exercício05;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasica;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
        this.escolaBasica = escolaBasica;
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }
}
