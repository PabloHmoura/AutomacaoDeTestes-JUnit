package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
            BigDecimal reajuste = desempenho.percentualReajuste().multiply(funcionario.getSalario());
            funcionario.reajustarSalario(reajuste);
    }
}
