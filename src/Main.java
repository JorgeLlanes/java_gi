public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz: " + i);
            } else {
                System.out.println(i);
            }
        }
    }
}