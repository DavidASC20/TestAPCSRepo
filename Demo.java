public class Demo{
    public static void main(String[] args){
         if(args.length == 0){
             printLoop(5);
         }else{
             int y = Integer.parseInt(args[0]);
             printLoop(y);
         }
      
}
    


     public static void printLoop(int a){
         for(int i = 1; i <= a; i++){
             for(int j = a; j >= i; j--){
                 System.out.print(i) ;
             }System.out.println();
         }
     }


    public static String arrToString(int[] arr){
        String total= "{";
        if(arr.length < 1){
          return "{}";
        }
        for(int i = 0; i < arr.length; i++){
          if(i == arr.length - 1){
            total += Integer.toString(arr[i]) + "}";
          }else{
          total += Integer.toString(arr[i]) + ", ";
          }
        }return total;
      }



    public static String arrayDeepToString(int[][]arr) {
        String total = "{{";
        if(arr.length < 1){
            return "{}";
        }
        int column;
        int row;
        for(row = 0; row < arr.length; row++){
            for(column = 0; column < arr[0].length; column++){
                if(column == arr[0].length - 1 && row == arr.length - 1){
                    total += Integer.toString(arr[row][column]) + "}}";
                }
                else if(column == arr[0].length - 1){
                    total += Integer.toString(arr[row][column]) + "}, \n{";
                }else{
                total += Integer.toString(arr[row][column]) + ", ";
                }
            }

        }

          return total;
      }
    public static int[][] create2DArray(int rows, int cols,int maxValue){
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                double randomNumber = Math.random() * maxValue + 1;
                double roundedNumber = Math.floor(randomNumber);
                int finalValue = (int)roundedNumber;
                arr[i][j] = finalValue;
            }
        }return arr;

    }   
    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    double randomCols = Math.random() * cols + 1;
    double roundedCols = Math.floor(randomCols);
    int finalCols = (int)roundedCols;
    int[][] arr = new int[rows][finalCols];

    for(int i = 0; i < rows; i++){
        for(int j = 0; j < finalCols; j++){
            double randomNumber = Math.random() * maxValue + 1;
            double roundedNumber = Math.floor(randomNumber);
            int finalValue = (int)roundedNumber;
            arr[i][j] = finalValue;
        }
    }return arr;
}   
}