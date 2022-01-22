package com.blockchat.demo;

import com.hedera.hashgraph.sdk.AccountId;
import com.hedera.hashgraph.sdk.Client;
import com.hedera.hashgraph.sdk.PrivateKey;
import com.hedera.hashgraph.sdk.HederaPreCheckStatusException;
import com.hedera.hashgraph.sdk.HederaReceiptStatusException;
import com.hedera.hashgraph.sdk.TransactionResponse;
import com.hedera.hashgraph.sdk.PublicKey;
import com.hedera.hashgraph.sdk.AccountCreateTransaction;
import com.hedera.hashgraph.sdk.Hbar;
import com.hedera.hashgraph.sdk.AccountBalanceQuery;
import java.util.concurrent.TimeoutException;
import com.hedera.hashgraph.sdk.AccountBalance;

public class HederaTest {
    public static void main(String[] args) throws TimeoutException, HederaPreCheckStatusException, HederaReceiptStatusException{
        AccountId accountID = AccountId.fromString("0.0.28542241");
        PrivateKey privateKey = PrivateKey.fromString("302e020100300506032b657004220420d2fc859373ce719e1eb51ba5fa852fcb93bb8fdf7f930082a325cb7f2d75f1f7");

        Client client = Client.forTestnet();
        client.setOperator(accountID, privateKey);

        PrivateKey newPrivateKey = PrivateKey.generateED25519();
        PublicKey newPublicKey = newPrivateKey.getPublicKey();
    }
}
