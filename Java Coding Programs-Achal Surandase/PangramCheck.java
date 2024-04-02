public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "Hello Good Morning"; 

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        if (sentence == null) {
            return false;
        }

        boolean[] mark = new boolean[26];
        int index = 0;
        for (char ch : sentence.toUpperCase().toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
                mark[index] = true;
            }
        }
        for (boolean b : mark) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
