package org.example.getways.payments_getways;

import org.example.getways.abstract_interfaces.IPaymentGetway;

import java.util.Timer;
import java.util.TimerTask;

public class FloozGetway implements IPaymentGetway {
    private String[] messages;
    private int currentIndex;
    private final Timer timer;

    public FloozGetway() {
        this.messages = new String[]{"Merci d'avoir opté pour le sevice Flooz pour vos paiement!","Avec Flooz, ayez votre banque dans votre poche...\uD83D\uDCAA\uD83C\uDFFE☀\uD83D\uDD25","A bientot \uD83D\uDE09"};
        this.currentIndex = 0;
        this.timer = new Timer();
    }

    public void startPrinting(int delayBetweenMessages) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (currentIndex < messages.length) {
                    System.out.println(messages[currentIndex]);
                    currentIndex++;
                } else {
                    timer.cancel(); // Arrêter le timer une fois que tous les messages ont été affichés
                }
            }
        }, 10, delayBetweenMessages);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Vous avez effectué un paiement d'un montant de "+ amount+ " FCFA");

        FloozGetway fg = new FloozGetway();
        fg.startPrinting(1000);
    }
}
