package org.example.adapters;

import org.example.payoneer.Payoneer;
import org.example.paypal.IPayPalPayments;
import org.example.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do Paypal");
    }

    @Override
    public Token auhthToken() {
        this.token = auhthToken();
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
