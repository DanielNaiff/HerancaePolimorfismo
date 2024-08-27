package Exercício11;

public class Supervisor extends Funcionario {
    private double comissao = 1500.00;

    public Supervisor(String nome, String codigoFuncional) {
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
