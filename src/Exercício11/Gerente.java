package Exercício11;
public class Gerente extends Funcionario {
    private double comissao = 2000.00;

    public Gerente(String nome, String codigoFuncional) {
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
