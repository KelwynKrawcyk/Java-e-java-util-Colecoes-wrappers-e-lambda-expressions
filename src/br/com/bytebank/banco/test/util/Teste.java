package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.models.Conta;
import br.com.bytebank.banco.models.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
                //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 23);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = lista.get(0);

        System.out.println(ref);

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(41, 25);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(77, 84);
        lista.add(cc4);

        for (int i=0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        for(Conta oref : lista){
            System.out.println(oref);
        }
    }
}
