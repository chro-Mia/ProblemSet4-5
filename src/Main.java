public class Main {
    public static void main(String[] args){
        String[][] strArray = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        double[][] dbArray = {{1,2,3},{4,5,6,},{7,8,9}};

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
    }

    public static void flip(String[][] array){
        for(int r = 0; r < array.length / 2; r++){
            String[] a = array[r];
            String[] b = array[array.length - 1 - r];
            array[r] = b;
            array[array.length - 1 - r] = a;
        }
    }

    static double[] columnSums(double[][] grid){
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
}

