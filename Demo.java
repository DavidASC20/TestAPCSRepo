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


}