public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        long a0 = 1;
        long a1 = 1;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(a0);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            if (a0 % 2 != 0)
                numOdd++;
            long temp = a1;
            a1 = a0 + a1;
            a0 = temp;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
