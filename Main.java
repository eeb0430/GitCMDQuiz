import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Num calculator = (int x, int y) -> {
            int sum = 0;
            for(int i = x; i<=y; i++)
                sum+=i;
            return sum;
        };


        System.out.println(calculator.calculate(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

    }

}