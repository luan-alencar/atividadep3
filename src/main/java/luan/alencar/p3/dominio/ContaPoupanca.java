package luan.alencar.p3.dominio;

import java.io.Serializable;

public class ContaPoupanca extends Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final double JUROS_HAMURABI = 0.40;

    private static final double JUROS_LUAN = 0.1;

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    public double getJurosHamurabi() {
        return JUROS_HAMURABI * getSaldo();
    }

    public double getJurosLuan() {
        return JUROS_LUAN * getSaldo();
    }
}
