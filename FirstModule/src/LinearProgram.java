import static java.lang.Math.*;

public class LinearProgram {
    public static double firstTask(double a, double b, double c){
        return ((a - 3) * b / 2) + c;
    }

    public static double secondTask(double a, double b, double c){
        return (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) + pow(b, -2);
    }

    public static double thirdTask(double x, double y){
        return (sin(x) + cos(y)) / (cos(x) - sin(y)) * log10(x * y);
    }

    public static String fourthTask(double R){
        String[] number = String.valueOf(R).split("\\.");
        return number[1] + number[0];
    }

    public static String fifthTask(int T){
        int hours = T / 3600;
        int minutes = T - (hours * 3600) / 60;
        int seconds = T - hours * 3600 - minutes * 60;

        return hours + "ч " + minutes + "мин " + seconds + "c";
    }

    /*public static sixthTask(){

    }*/
}

