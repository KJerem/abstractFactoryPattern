package org.example.factories;

import org.example.getways.abstract_interfaces.IPaymentGetway;
import org.example.getways.payments_getways.FloozGetway;

public class FloozGetwayFactory implements IPaymentGetwayFactory{
    @Override
    public IPaymentGetway createPaymentGetway() {
        return new FloozGetway();
    }
}
