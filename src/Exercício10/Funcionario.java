package Exercício10;

public abstract class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBasica = 1000.00;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public Funcionario() {}

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public abstract double calcularRenda(); // Método abstrato para ser implementado pelas subclasses
}

