public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print2D(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Test / debugging 
    public static void main(String[] args){
        int[][] array2d = new int[][]{
            {1, -2, 3, 4, 5},
            {6, 7, -8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, -22, 23, 24, 25}
        };
        int[][] array2d2 =
                new int[][]{
                        {11, -2, 3, 14, 5},
                        {6, 71, 28, 9, 30},
                        {11, 123, -13, 14, 15},
                        {16, 17, 108, -29, 20},
                        {21, 22, 203, 24, 45}
                };

        int [][]array2d3 =
                new int[][] {
                        {14, 2, 3, 14, 5},
                        {6, 71, 28, 9, 30},
                        {11, 123, 13, 14, 15},
                        {16, 127, 108, 39, 20},
                        {21, 222, 20, 29, 45}
                };
        print2D(array2d);
        System.out.println(average(array2d));
        System.out.println(average(array2d2));
        System.out.println(average(array2d3));

        System.out.println(minimum(array2d));
        System.out.println(minimum(array2d2));
        System.out.println(minimum(array2d3));
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][]matrix){
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][]matrix){
        return (double)sum(matrix)/(matrix.length*matrix.length);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][]matrix){
        int min = matrix[0][0];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
        }
        
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] matrix){
        int max = matrix[0][0];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }
        
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] matrix){
        int counter = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]%2==0){
                    counter++;
                }
            }
        }
        
        return counter;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] matrix){
        int counter = 0;
        for(int[] row : matrix){
            for(int element : row){
                if(element%2==0){
                    counter++;
                }
            }
        }
        return counter;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] matrix){
        for(int[] row : matrix){
            for(int element : row){
                if(element<0){
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] matrix){
        int[] arr = new int[matrix.length];
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                sum += matrix[i][j];
            }
            arr[i] = sum;
            sum = 0;
        }
        return arr;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] matrix){
        int[] arr = new int[matrix.length];
        int sum = 0;
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                sum += matrix[j][i];
            }
            arr[i] = sum;
            sum = 0;
        }
        return arr;
    }
}