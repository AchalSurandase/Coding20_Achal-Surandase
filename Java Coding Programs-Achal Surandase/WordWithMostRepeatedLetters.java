public class WordWithMostRepeatedLetters {
    public static void main(String[] args) {
        String input = "Google Happy Daaayyy"; // Example input
        System.out.println("Word with most repeated letters: " + findWordWithMostRepeatedLetters(input));
    }

    public static String findWordWithMostRepeatedLetters(String input) {
        String[] words = input.split("\\s+");
        String result = "-1";
        int maxRepeatedCount = 0;

        for (String word : words) {
            int[] charCounts = new int[256]; // ASCII size
            for (char c : word.toCharArray()) {
                charCounts[c]++;
            }

            int maxCharCount = 0;
            for (int count : charCounts) {
                if (count > maxCharCount) {
                    maxCharCount = count;
                }
            }

            if (maxCharCount > 1 && maxCharCount > maxRepeatedCount) {
                maxRepeatedCount = maxCharCount;
                result = word;
            }
        }

        return result;
    }
}
