package com.seeds.signal.Technical.Other;

import com.seeds.signal.Interface.App_Interface.EncryptionOperation;
import com.seeds.signal.Interface.App_Interface.SmartRunnable;

public class Encryption implements EncryptionOperation {

    @Override
    public String encrypt(String str, long secretKey) {
        return null;
    }

    @Override
    public String decrypt(String str, long secretKey) {
        return null;
    }

    @Override
    public long generateG() {
        return 0;
    }

    @Override
    public long generatePrime() {
        return 0;
    }

    @Override
    public long computePrivateKey() {
        return 0;
    }

    @Override
    public long calculatePublicKey(long G, long Prime, long PrivateKey) {
        return 0;
    }

    @Override
    public void exchangeKeysWithServer(long publicKey, SmartRunnable<Long> runnable) {

    }

    @Override
    public long computeSharedSecretKey(long G, long Prime, long clientPrivateKey, long ServerPrivateKey, long ServerPublicKey) {
        return 0;
    }
}
