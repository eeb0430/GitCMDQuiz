public class Main {
    public static void main(String[] args) {
        Num calculator = new Num() {
            @Override
            public int calculate(int x, int y) {
                int sum = 0;
                for(int i = x; i<=y; i++)
                    sum+=i;

                return sum;
            }
        };

        System.out.println(calculator);

    }
}