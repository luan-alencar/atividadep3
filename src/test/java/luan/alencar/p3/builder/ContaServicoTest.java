package luan.alencar.p3.builder;

import luan.alencar.p3.dominio.Conta;
import luan.alencar.p3.dominio.ContaPoupanca;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ContaServicoTest {

    @Autowired
    private ContaPoupanca poupanca;

    @BeforeEach
    void setUp() {
        Conta conta = new ContaPoupanca();
        conta.setAgencia(111111);
        conta.setTitular("User 1");
        conta.setLimite(2.000);
        conta.setSaldo(5.000);
    }

    @Test
    public void depositarTest(double valor) {
        poupanca.depositar(1.000);
        Assert.assertEquals(6.000, poupanca.getSaldo());
    }
}
