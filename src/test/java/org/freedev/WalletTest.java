package org.freedev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void teste_wallet_created(){
        Wallet  wallet = new Wallet(50000.0);
        double actual = wallet.getSolde();
        assertEquals(50000.0,actual);
    }
}
