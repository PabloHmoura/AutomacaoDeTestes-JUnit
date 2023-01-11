package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSer3PorcentoDesempenhoADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Pablo", LocalDate.now(), new BigDecimal("20000"));
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("20600.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer15PorcentoDesempenhoBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Pablo", LocalDate.now(), new BigDecimal("3000"));
        service.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("3450.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer15PorcentoDesempenhoOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Pablo", LocalDate.now(), new BigDecimal("1000"));
        service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
