package FirstCourse.Basic.CodingExercise;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }
        int count = 2;

        while (count < number){
            if(number % count != 0){
                count++;
            }else{
                number = number/count;
                count = 2;
            }
        }
        return number;
    }
}
