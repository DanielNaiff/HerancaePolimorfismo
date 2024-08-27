package Exercício11;

public class Vendedor extends Funcionario {
    private double comissao = 1000.00;

    public Vendedor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public double calcularRenda() {
        return getRendaBasica() + comissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Comissão: R$ " + comissao;
    }
}
