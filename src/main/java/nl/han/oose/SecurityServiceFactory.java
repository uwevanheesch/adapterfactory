package nl.han.oose;

public class SecurityServiceFactory {

    public static final int PROTECTION_LEVEL_SIMPLE = 1;
    public static final int PROTECTION_LEVEL_STRONG = 2;

    public SecurityService getSecurityService(ProtectionLevel protectionLevel) {
        if (protectionLevel == ProtectionLevel.SIMPLE) {
            return new SecurityService(new SimpleEncryptionAdapter());
        } else if (protectionLevel == ProtectionLevel.STRONG) {
            return new SecurityService(new JasyptAdapter());
        }
        return null;
    }


}
