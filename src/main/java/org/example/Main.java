package org.example;

import org.example.adapters.MercadoPagoAdapter;
import org.example.adapters.PayoneerAdapter;
import org.example.mercadopago.MercadoPago;
import org.example.payoneer.Payoneer;
import org.example.paypal.IPayPalPayments;
import org.example.paypal.Paypal;

public class Main {
    public static void main(String[] args) {
        IPayPalPayments paymentPayPal = new Paypal();
        paymentPayPal.paypalPayments();
        paymentPayPal.paypalReceive();

        IPayPalPayments payment = new PayoneerAdapter(new Payoneer());
        payment.paypalPayments();
        payment.paypalReceive();

        IPayPalPayments paymentMercadoPago = new MercadoPagoAdapter(new MercadoPago());
        paymentMercadoPago.paypalPayments();
        paymentMercadoPago.paypalReceive();
    }
}