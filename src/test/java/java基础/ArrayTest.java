package java基础;

/**
 * @Author: cola
 * @Created: cola on 2021/3/30 21:10
 * @Version 1.0
 */
class Arraytest
{
    public static int a[] = new int[6];
    public static void main ( String arg[] ) {
        System.out.println ( a[0] );
        int[] a = {1,2};
        int[][] a1 = new int[3][];
        int[]a2[] = new int[3][];
        int a3[][] = new int[3][];
        int[][] a4 = {{1,2,3,4},{5,6,7,8},{8,7,6,5}}; //null
        for (int i = 0; i <a4.length; i++) {
            for (int j = 0; j < a4[i].length; j++) {
                System.out.print(a4[i][j]);
                if ((j+1)<a4[i].length){
                    System.out.print(" ");
                }
            }
            if ((i+1)<a4.length){
                System.out.print("\n");
            }
        }
    }
}
