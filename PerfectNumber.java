package FirstCourse.Basic.CodingExercise;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
    }

//    public static boolean isPerfectNumber(int number){
//        if(number < 1){
//            return false;
//        }
//        int numberCopy = 0;
//        for (int i = 1; i < number ; i++) {
//            if(number % i == 0){
//                 numberCopy += i;
//            }
//        }
//        if(numberCopy == number){
//            return true;
//        }else{
//            return false;
//        }
//    }

    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int count = 1,sum = 0;
        while(count<number){
            if(number % count == 0){
                sum += count;
            }
            count++;
        }
        if(sum == number){
            return true;
        }else{
            return false;
        }
    }
}
