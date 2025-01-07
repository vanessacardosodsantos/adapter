package org.example.payoneer;

import org.example.utils.Token;

public interface IPayoneerPayments {
    Token auhthToken();
    void sendPayment();
    void receivePayment();
}
