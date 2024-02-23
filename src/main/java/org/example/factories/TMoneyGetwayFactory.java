package org.example.factories;

import org.example.getways.abstract_interfaces.IPaymentGetway;
import org.example.getways.payments_getways.TMoneyGetway;


public class TMoneyGetwayFactory implements IPaymentGetwayFactory{
    @Override
    public IPaymentGetway createPaymentGetway() {
        return new TMoneyGetway();
    }
}
