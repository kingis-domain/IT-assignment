public class ThreeDSales {
    public static void main(String[] args) {
        
        // declare and initialize 3D array
        int[][][] sales = {
            {   // Branch 1
                {10, 20, 30},  // Month 1
                {15, 25, 35}   // Month 2
            },
            {   // Branch 2
                {5, 10, 15},   // Month 1
                {8, 16, 24}    // Month 2
            }
        };
        
        // print all elements using 3 nested loops
        System.out.println("All sales data:");
        for (int i = 0; i < sales.length; i++) {           
            System.out.println("Branch " + (i + 1) + ":");
            for (int j = 0; j < sales[i].length; j++) {    
                for (int k = 0; k < sales[i][j].length; k++) { 
                    System.out.print("Month " + (j + 1) + ", Product " + (k + 1) + 
                                     ": " + sales[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        
        // calculate total sales for branch 1
        int totalBranch1 = 0;
        for (int j = 0; j < sales[0].length; j++) {
            for (int k = 0; k < sales[0][j].length; k++) {
                totalBranch1 += sales[0][j][k];
            }
        }
        System.out.println("Total sales for Branch 1: " + totalBranch1);
    }
}
