public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello world!");
        // For example
        for(int i = 1; i <= 10; ++i) {
            System.out.println("Hey!");
        }

        // Fib numbers
        System.out.println("Fibonacci numbers:");
        int f1 = 1, f2 = 1;
        System.out.println(f1);
        System.out.println(f2);
        for(int i = 3; i <= 10; ++i) {
            f2 = f2 + f1;
            f1 = f2 - f1;
            System.out.println(f2);
        }

        // 
    }
}
