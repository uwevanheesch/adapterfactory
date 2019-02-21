package nl.han.oose;

import nl.han.oose.encryption.SimpleEncryption;

// Adapter implementeerd het benodigde interface EncryptionService
public class SimpleEncryptionAdapter implements EncryptionService {

    // Adapter gebruikt de provider
    private SimpleEncryption simpleEncryption = new SimpleEncryption();

    @Override
    public String encrypt(String message) {
        return simpleEncryption.code(message);
    }

    @Override
    public String decrypt(String message) {
        return simpleEncryption.deCode(message);
    }
}
