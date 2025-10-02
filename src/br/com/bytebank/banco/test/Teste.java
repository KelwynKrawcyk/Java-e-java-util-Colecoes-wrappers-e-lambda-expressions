package br.com.bytebank.banco.test;

import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;
import br.com.bytebank.banco.models.GuardadorDeContas;

public class Teste {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 41);

        Conta cc2 = new ContaCorrente(51, 37);

        guardador.adiciona(cc);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref);
    }
}
