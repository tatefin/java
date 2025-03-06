public class Main {
    public static void main(String[] args) {
    // Käytetään EndianChecker-luokkaa tarkistamaan endianness
        String endianType = EndianChecker.checkEndian();
        System.out.println("Järjestelmän endianness on: " + endianType);
    }
}

