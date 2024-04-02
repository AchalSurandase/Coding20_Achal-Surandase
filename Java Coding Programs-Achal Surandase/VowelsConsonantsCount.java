public class VowelsConsonantsCount {
    public static void main(String[] args) {
        String input = "Good Morning";
        int vowelsCount = 0;
        int consonantsCount = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantsCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
