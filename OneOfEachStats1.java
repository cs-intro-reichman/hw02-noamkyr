public class OneOfEachStats1 {
    public static void main(String[] args) {

        // define t as parameter from args
        int t = Integer.parseInt(args[0]);
        // init the value of sum of born children (to calculate the average)
        int sum_children = 0;
        // init the variable that counts number of families with 2 children
        int two_children = 0;
        // init the variable that counts number of families with 3 children
        int three_children = 0;
        // init the variable that counts number of families with 4 or more children
        int four_or_more = 0;
        for (int i = 0; i < t; i++) {
            // init the boolean variable that indicates if a boy was born with false (a boy wasnt born yet)
            boolean have_boy = false;
            // init the boolean variable that indicates if a girl was born with false (a girl wasnt born yet)
            boolean have_girl = false;
            // init the variable the count of children in each family
            int count = 0;
            // do the commands inside the while if a family have at least one boy and girl yet
            while (have_boy == false || have_girl == false){
                // init variable that generates random number - 0 or 1
                int x = (int) (Math.random() * 2);

                // 0 if a girl was born
                if (x == 0){
                    // check if a girl was born yet
                    if (have_girl == false){
                        // change the value because a girl was just born
                        have_girl = true;
                    }
                // if a boy was born
                } else {
                    // check if a boy was born yet
                    if (have_boy == false){
                        // change the value because a boy was just born
                        have_boy = true;
                    }
                }
                // increase the count of born children
                count ++;
            }
            // add the sum of the count of children of this current family
            sum_children += count;
            // check the value of count
            if (count == 2){
                // increase the value of number of families with 2 children
                two_children ++;
            } else {
                if (count == 3){
                    // increase the value of number of families with 3 children
                    three_children ++;
                } else {
                    // increase the value of number of families with 4 or more children
                    four_or_more ++;
                }
            }

        }
        // calculating the value average children per family and casting the result to double
        double avg = (double)(sum_children)/t;
        // printing the results
        System.out.println("Average: " + avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + two_children);
        System.out.println("Number of families with 3 children: " + three_children);
        System.out.println("Number of families with 4 or more children: " + four_or_more);

        // get the maximum value of the 3 variables using math.max function
        int most_common = Math.max(Math.max(two_children, three_children), four_or_more);

        // check if the most common case is family with 2 children
        if (most_common == two_children){
            // print result
            System.out.println("The most common number of children is 2.");
        } else {
            // check if the most common case is family with 3 children
            if (most_common == three_children){
                // print result
                System.out.println("The most common number of children is 3.");
            } else {
                // check if the most common case is family with 4 or more children - default case
                // print result
                System.out.println("The most common number of children is 4 or more.");
            }
        }


        System.out.println();

    }
}
