public class OneOfEach {
    public static void main(String[] args) {
        // init the boolean variable that indicates if a boy was born with false (a boy wasnt born yet)
        boolean have_boy = false;

        // init the boolean variable that indicates if a girl was born with false (a girl wasnt born yet)
        boolean have_girl = false;

        // init the counting children variable to 0
        int count = 0;

        // do the commands inside the while if a family have at least one boy and girl yet
        while (have_boy == false || have_girl == false){

            // init variable that generates random number - 0 or 1
            int x = (int) (Math.random() * 2);
            // check if a girl was born
            if (x == 0){

                // printing the sign
                System.out.print("g ");

                // check if she is the first girl
                if (have_girl == false){

                    // change the value
                    have_girl = true;
                }
            } else {
                // printing the sign
                System.out.print("b ");

                // check if she is the first boy
                if (have_boy == false){

                    // change the value
                    have_boy = true;
                }
            }

            // increase the counting
            count ++;
        }

        // get down one line
        System.out.println();

        // print the result
        System.out.println("You made it... and you now have " + count + " children.");

    }

}
