package br.com.bytebank.banco.test;

import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;
import br.com.bytebank.banco.models.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        //Conta[] contas = new Conta[5];
        Object[] referencias = new Conta[5];

        //ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc = new ContaCorrente(12, 14);
        referencias[0] = cc;
        System.out.println(referencias[0]);

        ContaPoupanca cp = new ContaPoupanca(41, 6);
        referencias[1] = cp;
        System.out.println(referencias[1]);

        //System.out.println(referencias[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast

    }
}
