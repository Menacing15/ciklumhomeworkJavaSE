package ua.aleksandr.ciklumhomework.Lambda.lamdatheory;

import org.apache.log4j.Logger;

public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();

        //1
        walker(human);
        walker(robot);

        //2
        walker(new Walkable() {
            @Override
            public void walk() {
                log.info("Dead man walking");
            }
        });

        //3
        walker(() -> log.info("Dead man walking"));


        //4
        LambdaInterface blockOfCode = (() -> {
            log.info("Dead man walking");
            log.info("And I'm passing a code");
        });

        //walker(blockOfCode); compile error

        Walkable niceBlockOfCode = (() -> {
            log.info("Dead man walking");
            log.info("And I'm passing a code");
        });

        walker(niceBlockOfCode);

        //5 - numbers and ~
        LambdaInterface hello = () -> sayHello();

        //5.1
        Calculate calculate = (i, j) -> sum(20, 8);
        log.info("Calculating by passing method: " + calculate.compute(8, 20));

        Calculate calculateAlternative = (i, j) -> i + j;
        log.info("Calculating by passing code: " + calculateAlternative.compute(8, 20));
        hello.wavyBabyLambda();

        //5.2
        Calculate nonZeroDivider = (a, b) -> {
            if (b == 0) {
                return 0;
            }
            return a / b;
        };
        log.info("Non zero divider using lambda: " + nonZeroDivider.compute(50, 5));

        //5.3

        NumberHandler numberHandler = (a) -> {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result = i * result;
            }
            return result;
        };
        int number = 3;
        log.info("Factorial of number " + number + " is " + numberHandler.handle(number));

        //6 - strings and ~
        StringHandler reverser = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };

        log.info(reverser.handle("highxshoo"));

        //7 generic variant

        GenericHandler<Integer> genericNumberHandler = (a) -> {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result = i * result;
            }
            return result;
        };

        GenericHandler<String> genericReverser = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };

    }

    private static void sayHello() {
        log.info("Hello mf");
    }

    private static int sum(int i, int j) {
        return i + j;
    }

    private static void walker(Walkable walkable) {
        walkable.walk();
    }
}
