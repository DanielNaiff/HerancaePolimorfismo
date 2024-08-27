package Exercício10;

public class Vendedor extends Funcionario {
    private double comissao = 1000.00;

    public Vendedor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public double calcularRenda() {
        return rendaBasica + comissao;
    }
}
