package nl.han.oose;

// Consumer
public class SecurityService {

    // Consumer heeft iets nodig wat EncryptionService implementeerd
    private EncryptionService encryptionService;

    // constructor-based dependency injection
    public SecurityService(EncryptionService encryptionService) {
        this.encryptionService = encryptionService;
    }


    public String encrypt(String message) {

        return encryptionService.encrypt(message);
    }

    public String decrypt(String message) {
        return encryptionService.decrypt(message);
    }

}
