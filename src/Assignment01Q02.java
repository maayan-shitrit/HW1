public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        double sign = 1;
        for (int i = 0; i < n; i++){
            approxPi += sign / (2 * i + 1);
            sign = -sign;
        }
        approxPi = 4 * approxPi; 
        System.out.println(approxPi + " " + actualPi);
    }
}
