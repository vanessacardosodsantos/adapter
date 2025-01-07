package org.example.paypal;

import org.example.utils.Token;

public interface IPayPalPayments {
    Token auhthToken();
    void paypalPayments();
    void paypalReceive();
}
