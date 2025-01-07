package org.example.paypal;

import org.example.utils.Token;

public class Paypal implements IPayPalPayments{
    private Token token;
    @Override
    public Token auhthToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
    this.token = auhthToken();
    System.out.println("Enviando pagamentos com Paypal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via Paypal");


    }
}
