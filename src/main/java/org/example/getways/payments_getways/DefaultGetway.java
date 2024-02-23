package org.example.getways.payments_getways;

import org.example.getways.abstract_interfaces.IPaymentGetway;

public class DefaultGetway implements IPaymentGetway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Service non pris en compte pour le moment. veuillez choisir un autre modele de paimement.\nMerci!!!\uD83D\uDE09\uD83E\uDD29");
    }
}
