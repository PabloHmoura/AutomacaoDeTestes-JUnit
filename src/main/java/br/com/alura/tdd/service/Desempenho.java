package br.com.alura.tdd.service;

import java.math.BigDecimal;

public enum Desempenho {
    OTIMO{
        @Override
        public BigDecimal percentualReajuste() {
           return new BigDecimal("0.20");
        }
    }, BOM{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.15");
        }
    }, A_DESEJAR{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.03");
        }
    };

    public abstract BigDecimal percentualReajuste();
}
