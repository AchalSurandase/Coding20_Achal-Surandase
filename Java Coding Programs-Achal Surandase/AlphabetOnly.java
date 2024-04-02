public class AlphabetOnly {
    public static void main(String[] args) {
        String input = "Hello How Are You? 12:00";
        String output = input.replaceAll("[^a-zA-Z]", "");
        System.out.println("Original string: " + input);
        System.out.println("String with only alphabets: " + output);
    }
}
