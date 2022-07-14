package FirstCourse.Basic.CodingExercise;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
    }

    public static boolean hasTeen(int one,int two,int three) {
        if (one >= 13 && one <= 19 || two >= 13 && two <= 19 || three >= 13 && three <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int number){
        if(number>=13&&number<=19){
            return true;
        }
        return false;
    }
}
