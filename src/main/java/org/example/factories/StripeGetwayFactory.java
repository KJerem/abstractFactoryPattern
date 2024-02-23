package org.example.factories;

import org.example.getways.abstract_interfaces.IPaymentGetway;
import org.example.getways.payments_getways.StripeGeteway;

public class StripeGetwayFactory implements IPaymentGetwayFactory{
    @Override
    public IPaymentGetway createPaymentGetway() {
        return new StripeGeteway();
    }
}
