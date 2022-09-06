package FirstCourse.Basic.CodingExercise;

public class GreatestCommonDivisor {
    public static void main(String[] args)
    {
        System.out.println(getGreatestCommonDivisor(30,12));
        System.out.println(12 % 4);
    }
    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }
        int result = 0;
        for (int i = 1; i <=a && i<=b ; i++) {
            if(a % i == 0 && b % i == 0){
                result = i;
            }
        }
        return result;
        }
}

//    public static int getGreatestCommonDivisor(int a, int b) {
//        if(a  < 10 || b < 10) {
//            return -1;
//        } else {
//            int i =Math.max(a,b);
//            while(true) {
//                if ((a % i == 0) && (b % i == 0)) {
//                    return i;
//                }
//                i--;
//            }
//
//        }
//
//    }
