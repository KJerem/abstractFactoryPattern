package org.example.services;

import org.example.factories.*;
import org.example.getways.abstract_interfaces.IPaymentGetway;
import org.example.getways.payments_getways.DefaultGetway;


public class Service {
    private IPaymentGetwayFactory factory;
    private IPaymentGetway paymentGetway;

    private String paymentType;

    public Service(IPaymentGetwayFactory factory, String paymentType){
        this.factory = factory; this.paymentType = paymentType;
    }


    public void createPaymentGetway() {

        switch (paymentType.toLowerCase()) {
            case "tmoney":
                factory = new TMoneyGetwayFactory();
                break;
            case "flooz":
                factory = new FloozGetwayFactory();
                break;
            case "stripe":
                factory = new StripeGetwayFactory();
                break;
            default:
                factory = new DefaultGetwayFactory();
              System.out.println("Type de paiement non pris en charge: " + paymentType);
        }

        this.paymentGetway = factory.createPaymentGetway();
    }

    public void processPayment(double amount){
        paymentGetway.processPayment(amount);
    }
}
