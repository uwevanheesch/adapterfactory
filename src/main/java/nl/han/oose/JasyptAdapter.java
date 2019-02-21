package nl.han.oose;

import org.jasypt.util.text.StrongTextEncryptor;

public class JasyptAdapter implements EncryptionService {

    private static final String password = "Sf?`mR+zfWC^cu6p";

    private StrongTextEncryptor strongTextEncryptor = new StrongTextEncryptor();

    public JasyptAdapter() {
        strongTextEncryptor = new StrongTextEncryptor();
        strongTextEncryptor.setPassword(password);
    }

    @Override
    public String encrypt(String message) {
        return strongTextEncryptor.encrypt(message);
    }

    @Override
    public String decrypt(String message) {
        return strongTextEncryptor.decrypt(message);
    }
}
