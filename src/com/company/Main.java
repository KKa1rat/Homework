package com.company;

public class Main {

    public static void main(String[] args) {
        double[] sa = new double[15];
        for (double i = -1.81 ; i < 1.222; i= i + 0.21) {
            System.out.println(i );
        }
        // 8, -2, -4, 2, 3, 6
        int[] so = {8, -2, -4, 2, 3, 6};
        for (int k = 1; k < so.length; k++) {
            if (so[k] < 0 ) {
               continue;
            }
            System.out.println( (so[3] + so[4]+ so[5])/ 3);







        }
        }


}
