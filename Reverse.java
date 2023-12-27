public class Reverse {

    public static void main(String[] args) {

        // init the original string that was given from user
        String original = args[0];

        // init the reversed sting
        String reversed = "";

        // get the length os the string using the function
        int length = original.length();

        // get the mid index of the string
        int mid = (length - 1) / 2;

        // init the mid char of the string
        char mid_char = '!';

        // init a loop that runs from the end to the start of the string
        for (int i = length - 1; i >=0 ; i--) {

            // get the current letter using the function
            char current_letter = original.charAt(i);

            // check if it is now the current letter
            if (i == mid){

                // set the value of the current letter
                mid_char = current_letter;
            }

            // add the current letter to the current result
            reversed = reversed + current_letter;
        }


        // print the results
        System.out.println(reversed);
        System.out.println("The middle character is " + mid_char);
    }

}
