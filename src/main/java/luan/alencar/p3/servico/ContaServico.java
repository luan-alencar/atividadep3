package luan.alencar.p3.servico;

import lombok.RequiredArgsConstructor;
import luan.alencar.p3.dominio.ContaCorrente;
import luan.alencar.p3.dominio.ContaPoupanca;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContaServico {

    private final ContaPoupanca contaPoupanca;

    private final ContaCorrente contaCorrente;

    public void sacarPoupanca(double valor) {
        contaPoupanca.sacar(valor);
    }

    public void sacarCorrente(double valor) {
        contaCorrente.sacar(valor);
    }

    public void buscarSaldo() {

    }
}
