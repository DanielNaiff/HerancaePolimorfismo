package Exercício06;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBasica = 1000.00;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public double calcularRenda() {
        return rendaBasica;
    }
}