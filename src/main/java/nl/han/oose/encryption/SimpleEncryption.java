package nl.han.oose.encryption;

// Mogelijke provider, maar SimpleEncryption implementeerd
// niet het juiste interface EncyptionService
public class SimpleEncryption {

    public static void main(String[] args) {
        System.out.println(new SimpleEncryption().code("ABC ssds"));
    }

    public String code(String message) {
        String result = "";
        for (char letter : message.toCharArray()) {
            result += (char) (letter + 1);
        }
        return result;
    }

    public String deCode(String message) {
        String result = "";
        for (char letter : message.toCharArray()) {
            result += (char) (letter - 1);
        }
        return result;
    }
}
