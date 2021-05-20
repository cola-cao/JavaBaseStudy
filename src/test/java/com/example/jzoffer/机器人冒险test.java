package com.example.jzoffer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * @Author: cola
 * @Created: cola on 2020/11/14 21:35
 * @Version 1.0
 */
@SpringBootTest
public class 机器人冒险test {

    @Test
    void test1(){
        String[][] strings = new String[3][2];
        //strings = @74174a23
        //strings[1] = @74174a23
        //strings[2] =@74174a23
        System.out.println(strings);
        int[][] obstacles;
        obstacles = new int[][]{};
        System.out.println(obstacles.length);
    }


    public boolean robot(String command, int[][] obstacles, int x, int y) {
      Boolean b = true;
      int U = 0, R = 0;
        if (obstacles.length == 0){
            return true;
        }

      while (b){

          for (int i = 0; i <command.length(); i++){

              if(command.charAt(i) == 'U'){
                  U += 1;
                  System.out.println(U);
                  if(U == obstacles[0][1] && R == obstacles[0][0]){
                      return false;
                  }

                  if (U > obstacles[0][1] || R >obstacles[0][0]){

                      return true;
                  }
              }

              if(command.charAt(i) == 'R'){
                  R += 1;

                  if((U == obstacles[0][1] && R == obstacles[0][0])){
                      return false;
                  }

                  if (U > obstacles[0][1] || R >obstacles[0][0]){

                      return true;
                  }
              }
          }
      }

    return false;
    }

    @org.junit.Test
    void test2(){
        int[][] obstacles;
        obstacles = new int[][]{{3,0}};
        boolean urr = robot("RRRUUU", obstacles, 3, 3);
        System.out.println(urr);

        ArrayList arrayList = new ArrayList();
        arrayList.iterator();
}


}
