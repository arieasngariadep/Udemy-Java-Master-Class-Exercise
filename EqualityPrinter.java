package FirstCourse.Basic.CodingExercise;

public class EqualityPrinter {
    public static void main(String[] args) {
    printEqual(1,1,1);
    printEqual(1,1,2);
    printEqual(-1,-1,-1);
    printEqual(1,2,3);
    }

    public static void printEqual(int numb1,int numb2,int numb3){
        if(numb1<0 || numb2<0 || numb3<0){
            System.out.println("Invalid Value");
        }else if(numb1==numb2 && numb1 == numb3){
            System.out.println("All numbers are equal");
        }else if(numb1!=numb2 && numb1 != numb3 && numb2 != numb3){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }

    }
}
