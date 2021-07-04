package module1;

public class BranchingProgram {

    public static void isTriangle(int a, int b){
        if(180 - a - b > 0 && a > 0 && b > 0){
            System.out.println("Triangle exist");
            if(isRightTriangle(a, b)){
                System.out.println("This triangle is right");
            }
            else{
                System.out.println("This is random triangle");
            }
        }
        else{
            System.out.println("Triangle isn't exist");
        }
    }

    private static boolean isRightTriangle(int a, int b){
        return a + b == 90;
    }

    public static double secondTask(double a, double b, double c, double d){

        if(a > b){
            a = b;
        }

        if(c > d){
            c = d;
        }

        if(a < c){
            a = c;
        }

        return a;
    }


}
