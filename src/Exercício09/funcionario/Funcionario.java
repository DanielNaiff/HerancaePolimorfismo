package Exercício09.funcionario;

import Exercício08.Comissao;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBasica = 1000.00;
    private Comissao comissao;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double calcularRenda() {
        return rendaBasica + (comissao != null ? comissao.calcularAdicional() : 0);
    }
}
