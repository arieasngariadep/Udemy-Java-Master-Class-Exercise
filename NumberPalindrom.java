package FirstCourse.Basic.CodingExercise;

public class NumberPalindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom(2552));
    }

    public static boolean isPalindrom(int number) {
            number = Math.abs(number);
            int numberCopy = number;
            int reverse = 0, lastDigit = 0;
            while (numberCopy > 0) {
                // 1 , 10, 100, 1001
                lastDigit = numberCopy % 10;
                reverse = reverse * 10 + lastDigit;
                numberCopy /= 10;
            }
            if (number == reverse) {
                return true;
            } else {
                return false;
            }
        }

}
