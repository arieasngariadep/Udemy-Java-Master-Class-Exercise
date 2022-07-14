package FirstCourse.Basic.CodingExercise;

public class MinutesToYearsDaysCalculators {
    public static void main(String[] args) {
        printYearsAndDays(-525600);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            long years = minutes/525600;
            long daysRemaining = (minutes % 525600)/60/24;
            System.out.println(minutes +" min = "+ years + " y and " + daysRemaining + " d");
        }
    }
}
