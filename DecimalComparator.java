package FirstCourse.Basic.CodingExercise;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));

    }
    public static boolean areEqualByThreeDecimalPlaces(double decimal1,double decimal2){
        int x = (int) (decimal1*1000);
        int y = (int) (decimal2*1000);
        if(x==y){
            return true;
        }
        return false;
    }
}
