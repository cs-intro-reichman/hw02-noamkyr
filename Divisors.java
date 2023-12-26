public class Divisors {

    public static void main(String[] args) {

        // init the param of x
        int x = Integer.parseInt(args[0]);

        // init a loop that runs x times from x to 1
        for (int d = x; d >=1 ; d--) {
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
