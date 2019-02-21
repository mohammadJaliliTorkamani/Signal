package com.seeds.signal.Interface.App_Interface;

public interface EncryptionOperation {
    String encrypt(String str, long secretKey);

    String decrypt(String str, long secretKey);

    long generateG();

    long generatePrime();

    long computePrivateKey();

    long calculatePublicKey(long G, long Prime, long PrivateKey);

    void exchangeKeysWithServer(long publicKey, SmartRunnable<Long> runnable);

    long computeSharedSecretKey(long G, long Prime, long clientPrivateKey, long ServerPrivateKey, long ServerPublicKey);
}
