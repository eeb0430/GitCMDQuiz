import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Num calculator = (int x, int y) -> {
            int sum = 0;
            for(int i = x; i<=y; i++)
                sum+=i;
            return sum;
        };

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println(calculator.calculate(x, y));

    }

}