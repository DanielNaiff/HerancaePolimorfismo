package Exercício07;

import Exercício06.Funcionario;
import Exercício06.FuncionarioEnsinoBasico;
import Exercício06.FuncionarioEnsinoMedio;
import Exercício06.FuncionarioGraduacao;

// Classe Empresa
public class Empresa {
    private Funcionario[] funcionarios;

    public Empresa() {
        funcionarios = new Funcionario[10];

        // Distribuindo os funcionários
        // 40% Ensino Básico = 4 funcionários
        for (int i = 0; i < 4; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario" + (i + 1), "00" + (i + 1), "Escola Basica");
        }

        // 40% Ensino Médio = 4 funcionários
        for (int i = 4; i < 8; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario" + (i + 1), "00" + (i + 1), "Escola Basica", "Escola Media");
        }

        // 20% Nível Superior = 2 funcionários
        for (int i = 8; i < 10; i++) {
            funcionarios[i] = new FuncionarioGraduacao("Funcionario" + (i + 1), "00" + (i + 1), "Escola Basica", "Escola Media", "Universidade XYZ");
        }
    }

    // Método para calcular os custos totais e por nível de escolaridade
    public void calcularCustos() {
        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario func : funcionarios) {
            double renda = func.calcularRenda();
            custoTotal += renda;

            if (func instanceof FuncionarioGraduacao) {
                custoGraduacao += renda;
            } else if (func instanceof FuncionarioEnsinoMedio) {
                custoEnsinoMedio += renda;
            } else if (func instanceof FuncionarioEnsinoBasico) {
                custoEnsinoBasico += renda;
            }
        }

        System.out.println("Custo total da empresa: R$ " + custoTotal);
        System.out.println("Custo com funcionários de Ensino Básico: R$ " + custoEnsinoBasico);
        System.out.println("Custo com funcionários de Ensino Médio: R$ " + custoEnsinoMedio);
        System.out.println("Custo com funcionários de Nível Superior: R$ " + custoGraduacao);
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.calcularCustos();
    }
}

