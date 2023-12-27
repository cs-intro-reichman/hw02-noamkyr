public class DamkaBoard {
    public static void main(String[] args) {
        // init n as the requested number of rows and columns
        int n  = Integer.parseInt(args[0]);

        // init the variable that check if i need to add space at the beginning or at the end of a line
        boolean space_at_start = false;

        // init a loop that runs n times (every line)
        for (int i = 0; i < n; i++) {

            // check if need to add space at the start
            if (space_at_start == true){
                // add space
                System.out.print(" ");
            }
            // init a loop that runs n time that prints a line
            for (int j = 0; j < n; j++) {
                
		// dont unnecessary space at the end
                if (j == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print("* ");
                }
            }
            // change the boolean to the opposite value
            space_at_start = !space_at_start;
            // get one line down
            System.out.println();
        }
    }
}
