package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class DigitalNoteMain extends BitFamily {
    private DigitalNoteMain() {
        id = "bitcoin.main";

        addressHeader = 90;
        p2shHeader = 140;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 142;

        name = "DigitalNote";
        symbol = "XDN";
        uriScheme = "digitalnote";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(1000);
        minNonDust = value(1000);
        softDustLimit = value(1000000); // 0.01 XDN
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Darkcoin Signed Message:\n");
    }

    private static DigitalNoteMain instance = new DigitalNoteMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
