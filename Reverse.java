public class Perfect {
    public static void main(String[] args) {

        // init the parameter that holds the given value from the user
        int parameter = Integer.parseInt(args[0]);

        // init the start of success message
        String equation = parameter + " is a perfect number since " + parameter + " = 1";

        // init the sum of dividers - 1 always divides
        int sum = 1;

        // init a loop that runs from 2 to param -1
        for (int i = 2; i < parameter; i++) {

            // check if the current number divides the parameter with no remainder
            if ( parameter % i == 0){

                // add i to the sum
                sum += i;

                // add i to the equation
                equation = equation + (" + " + i);
            }
        }

        // check if perfect number
        if(sum == parameter){

            // print the final equation
            System.out.println(equation);
        }else{

            // print the fail message
            String message_not_perfect = parameter +" is not a perfect number";
            System.out.println(message_not_perfect);
        }

    }
}
