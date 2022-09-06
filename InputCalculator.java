package FirstCourse.Basic.CodingExercise;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0,count = 0;
        double average = 0;
        long avg = 0;
        while (true){
            System.out.println("Input a number :");
            boolean isInt = scanner.hasNextInt();
            if(isInt){
            int number = scanner.nextInt();
            sum += number;
            count++;
            average = (double)sum/count;
            avg = (long) Math.ceil(average);
            }else{
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
