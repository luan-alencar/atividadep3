package luan.alencar.p3.dominio;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }
}
