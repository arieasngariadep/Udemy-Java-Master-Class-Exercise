package FirstCourse.Basic.CodingExercise;

public class SpeedConverter {
    public static void main(String[] args) {
        long result = toMilesPerHour(10.5);
        System.out.println(result);

        printConversion(10.5);
    }
    public static long toMilesPerHour(double kilometerPerHour){
//        if(kilometerPerHour<0){
//            return -1;
//        }else{
//            return Math.round(kilometerPerHour/1.609);
//        }

        //Alternative
        return kilometerPerHour < 0 ? -1 : Math.round(kilometerPerHour/1.609);
    }

    public static void printConversion(double kilometerPerHour){
//        if(kilometerPerHour<0){
//            System.out.println("Invalid Value");
//        }else{
//            long milesPerHour = toMilesPerHour(kilometerPerHour);
//            System.out.printf("%.1f km/h = %d mi/h",kilometerPerHour,milesPerHour);
//        }

        //Alternative
        System.out.println(kilometerPerHour<0? "Invalid Value" : kilometerPerHour + " km/h = " + toMilesPerHour(kilometerPerHour) + " mi/h");
    }
}
