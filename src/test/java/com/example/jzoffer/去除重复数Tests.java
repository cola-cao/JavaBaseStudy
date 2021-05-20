package com.example.jzoffer;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@SpringBootTest
class 去除重复数Tests {

    /**
     * 取出
     */
    @Test
    void test(){
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        //int i = findRepeatNumber(nums);

        //findRepeatNumber2(nums);

        //findRepeatNumber3(nums);
        findRepeatNumber4(nums);
    }

    //1.hashset
    public int findRepeatNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){

                System.out.println(nums[i]);
            }

            set.add(nums[i]);
        }

        return -1;
    }
    //2.暴力枚举
    public int findRepeatNumber2(int[] nums) {
        for(int i = 0; i < nums.length; i++){
           for (int j = i+1; j <= nums.length-1;j++){
               if(nums[i] == nums[j]){
                   System.out.println(nums[i]);
               }
           }
        }

        return -1;
    }

    //3.数组代替哈希表
    public int findRepeatNumber3(int[] nums) {
        int[] solt = new int[nums.length];
        Arrays.fill(solt,-1);
        for(int i = 0; i < nums.length; i++){
            if(solt[nums[i]] != -1){
                System.out.println(nums[i]);
            }else {
                solt[nums[i]] = i;
            }
        }

        return -1;
    }

    public int findRepeatNumber4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {

                if (nums[i] == nums[nums[i]]) {
                    System.out.println(nums[i]);
                }else {
                    // 交换
                    int tmp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = tmp;
                }


            }
        }

        return -1;
    }

    @Test
    public void testUpData() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-beijing.aliyuncs.com";
// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4GGHdYXaX8chnJXzbARi";
        String accessKeySecret = "pGgYh7FLUVckbnaJlwym9qWwIEyZbO";

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\cola\\Desktop\\ps.png");
        ossClient.putObject("legou-mall", "ps.png", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功");
    }

}
