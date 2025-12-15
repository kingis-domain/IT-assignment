public class StudentMarksTable {
    public static void main(String[] args) {
        
        // 3 students with 3 subject marks each
        int[][] studentMarks = {
            {75, 80, 90},  // Student 1
            {65, 70, 85},  // Student 2
            {88, 92, 81}   // Student 3
        };
        
        // print the marks in table (matrix) form
        System.out.println("Student Marks Table:");
        for (int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + "\t"); // \t for nice spacing
            }
            System.out.println();
        }
        
        // calculate and print average marks of Student 3 (third row, index 2)
        int sumStudent3 = 0;
        for (int j = 0; j < studentMarks[2].length; j++) {
            sumStudent3 += studentMarks[2][j];
        }
        double averageStudent3 = (double) sumStudent3 / studentMarks[2].length;
        System.out.println("Average marks of Student 3: " + averageStudent3);
    }
}
