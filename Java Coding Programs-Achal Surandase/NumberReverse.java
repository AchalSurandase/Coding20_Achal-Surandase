public class NumberReverse {
    public static void main(String[] args) {
        int number = 987654321;
        int reversedNumber = reverse(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverse(int number) {
        int reversed = 0;
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
