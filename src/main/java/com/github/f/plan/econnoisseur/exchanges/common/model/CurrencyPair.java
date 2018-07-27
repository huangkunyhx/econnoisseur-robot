package com.github.f.plan.econnoisseur.exchanges.common.model;

import static com.github.f.plan.econnoisseur.exchanges.common.model.Currency.*;

/**
 * CurrencyPair
 *
 * @author Kevin Huang
 * @since version
 * 2018年06月29日 14:08:00
 */
public enum CurrencyPair {
    BBN_ETH(BBN, ETH),
    IOST_ETH(IOST, ETH),
    CARD_BTC(CARD, BTC),
    CARD_ETH(CARD, ETH),
    OLT_ETH(OLT, ETH),
    CET_BTC(CET, BTC),
    OLT_BCH(OLT, BCH),
    OLT_USDT(OLT, USDT),
    LFT_BCH(LFT, BCH),
    CET_BCH(CET, BCH),
    TCT_ETH(TCT, ETH),
    TCT_BCH(TCT, BCH),
    TCT_BTC(TCT, BTC),
    ;

    private Currency base;
    private Currency counter;

    CurrencyPair(Currency base, Currency counter) {
        this.base = base;
        this.counter = counter;
    }

    public Currency getBase() {
        return base;
    }

    public Currency getCounter() {
        return counter;
    }

    public static CurrencyPair get(Currency base, Currency counter) {
        return CurrencyPair.valueOf(base.name() + "_" + counter.name());
    }
}
