package FirstCourse.Basic.CodingExercise;

//Menjumlahkan digit angka genap
public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenSum(252));
        System.out.println(getEvenSum(123456789));

    }

    public static int getEvenSum(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        int temp;
        while (number>0){
            temp = number % 10;
            if(number % 2==0){
                sum += temp;
            }
            number /=10;
        }
        return sum;
    }
}
