package FirstCourse.Basic.CodingExercise;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0,4.0));
    }

//    public static double area(double radius){
//        if(radius<0){
//            return -1.0;
//        }
//        return radius * radius * Math.PI;
//    }
//
//    public static double area(double x,double y){
//        if(x<0 || y<0){
//            return -1;
//        }
//        return x * y;
//    }

    //Alternative
    public static double area(double radius){
        return radius<0? -1 : radius*radius*Math.PI;
    }

    public static double area(double x,double y){
        return (x<0 || y<0)? -1 : x*y;
    }
}
