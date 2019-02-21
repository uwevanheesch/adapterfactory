package nl.han.oose;

public class App {

    public static void main(String[] args) {

        SecurityService securityService = new SecurityServiceFactory()
                .getSecurityService(ProtectionLevel.STRONG);

        System.out.println(securityService.encrypt("Uwe"));

    }
}
