public class InOrder {
    public static void main(String[] args) {

        // init a random number between 0 - 10
        int current_number = (int) (Math.random() * 11);

        // init the value of the following number
        // the value is not between the range in order to check if it is the first time
        int next_number = -1;

        // init do while loop that runs while the next_number > current_number
        do {
            // check if it is the first iteration
            if (next_number != -1 ){
                // if not the first time - the current number is the next one form the previous iteration
                current_number = next_number;
            }
            // print the current number
            System.out.println(current_number);
            // set a random value of 0 - 10 to the following number at the series
            next_number = (int) (Math.random() * 11);
        }
        // check if the next one is greater
        while (next_number > current_number);

    }
}
