package FirstCourse.Basic.CodingExercise;

public class  AllFactors {
    public static void main(String[] args) {
        printFactors(10);
    }

//    public static void printFactors(int number) {
//       if (number<1){
//           System.out.println("Invalid Value");
//       }else{
//           for (int i = 1; i <= number; i++) {
//               if(number % i == 0){
//                   System.out.println(i);
//               }
//           }
//       }
//    }

    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        int count = 1;
        while (count <= number) {
            if(number % count == 0){
                System.out.println(count);
                if(number == count){
                    break;
                }
            }
            count++;
        }
    }
}
