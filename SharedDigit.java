package FirstCourse.Basic.CodingExercise;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }
    public static boolean hasSharedDigit(int number1,int number2){
        if((number1<10 || number1>99) || (number2<10 || number2>99) ){
            return false;
        }

        int lastDigitNumber1 = number1 % 10;
        int firstDigitNumber1 = number1 / 10;
        int lastDigitNumber2 = number2 % 10;
        int firstDigitNumber2 = number2 / 10;
        if((firstDigitNumber1 == firstDigitNumber2 || firstDigitNumber1 == lastDigitNumber2) || (firstDigitNumber2 == lastDigitNumber1 || (lastDigitNumber2 == lastDigitNumber1))){
            return true;
        }
        return false;
    }
}
