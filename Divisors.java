public class Divisors {

    public static void main(String[] args) {

        // init the param of x
        int x = Integer.parseInt(args[0]);

        // init a loop that runs x times from 1 to x
        for (int d = 1; d <= x ; d++) {
            // m has the remainder of dividing x / d
            int m = x % d;

            // check if it has no remainder - a divisor
            if (m == 0){
                // print the divisor
                System.out.println(d);
            }

        }


    }

}
