package java基础;

import net.bytebuddy.implementation.bytecode.Throw;

/**
 * @Author: cola
 * @Created: cola on 2021/3/15 21:58
 * @Version 1.0
 */
public class Print{
    static boolean out(char c){
        System.out.println(c);
        return true;
    }
    public static void main(String[] argv) throws Exception{
        int i = 0;
        for(out('A');out('B') && (i<2);out('C')){
            i++;
            out('D');
        }



        try {

        }catch (Exception e){

        }finally {

        }

    }
}