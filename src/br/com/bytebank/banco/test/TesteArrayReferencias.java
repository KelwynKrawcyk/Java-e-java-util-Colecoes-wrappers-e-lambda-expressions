package br.com.bytebank.banco.test;

import br.com.bytebank.banco.models.ContaCorrente;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc = new ContaCorrente(12, 14);
        contas[0] = cc;
        System.out.println(contas[0]);

        ContaCorrente cc2 = new ContaCorrente(41, 6);
        contas[1] = cc2;
        System.out.println(contas[1]);

        System.out.println(contas[1].getNumero());
    }
}
