public class Main {
    public static void main(String[] args){
        String[][] strArray = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        double[][] dbArray = {{1,2,3},{4,5,6,},{7,8,9}};
        int[] intArray = {1,2,3,4,5};
        int[][] grid = rowFill(intArray, 4);
        int[][] grid2 = colFill(intArray, 4);


        flip(strArray);
        for(String[] row : strArray){
            for(String string : row){
                System.out.print(string + " ");
            }
            System.out.println();
        }

        for(double num : columnSums(dbArray)){
            System.out.print(num + " ");
        }

        System.out.println();

        for(int[] row : grid){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] row : grid2){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void flip(String[][] array){
        for(int r = 0; r < array.length / 2; r++){
            String[] a = array[r];
            String[] b = array[array.length - 1 - r];
            array[r] = b;
            array[array.length - 1 - r] = a;
        }
    }

    public static double[] columnSums(double[][] grid){
        double[] sums = new double[grid.length];
        for(int r = 0; r < grid.length; r++){
            double total = 0;
            for(int c = 0; c < grid[0].length; c++){
                total += grid[c][r];
            }
            sums[r] = total;
        }
        return sums;
    }

    public static int[][] rowFill(int[] vals, int rowLength){
        int[][] newArray = new int[(int)Math.ceil(vals.length / (double)rowLength)][rowLength];
        int index = 0;
        for(int r = 0; r < newArray.length; r++){
            for(int c = 0; c < newArray[0].length; c++){
                if(index < vals.length){
                    newArray[r][c] = vals[index];
                }
                else{
                    newArray[r][c] = -1;
                }
                index++;
            }
        }
        return newArray;
    }

    public static int[][] colFill(int[] vals, int rowLength){
        int[][] newArray = new int[(int)Math.ceil(vals.length / (double)rowLength)][rowLength];
        int index = 0;
        for(int c = 0; c < newArray[0].length; c++){
            for(int r = 0; r < newArray.length; r++){
                if(index < vals.length){
                    newArray[r][c] = vals[index];
                }
                else{
                    newArray[r][c] = -1;
                }
                index++;
            }
        }
        return newArray;
    }
}