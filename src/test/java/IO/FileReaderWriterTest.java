package IO;

import com.example.jzoffer.替换空格test;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author: cola
 * @Created: cola on 2021/3/16 20:57
 * @Version 1.0
 *
 * 一、流的分类：
 *    1.操作数据单位：字节流、字符流
 *    2.数据的流向：输入流、输出流
 *    3.流的角色：节点流、处理流
 * 二、流的体系结构
 *    抽象基流          文件流（节点流）      缓冲流
 *    InputStream      FileInputStream      BufferedInputStream
 *    OutPutStream     FileOutPutStream     BufferedOutputStream
 *    Reader           FileReaderStream     BufferedReader
 *    Writer           FileReaderSteam      BufferWriter
 *
 *
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file1 = new File("Hello.txt");
        System.out.println(file1.getAbsoluteFile());
    }

    @Test
    void testFileReader() {
        File file = new File("/home/santi/Downloads/api文档/cola/剑指offer/src/test/java/IO/Hello.txt");
        System.out.println(file.getAbsoluteFile());
        FileReader fileReader = null;
        try {
            //2.提供具体的流
            fileReader = new FileReader(file);
            //3.数据的读入
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data + "");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    void testFileReader2() throws IOException {
        //实例化文件
        File file = new File("/home/santi/Downloads/api文档/cola/剑指offer/src/test/java/IO/FileReaderWriterTest.java");
        int hasData = 0;
        //2.提供流
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            char[] c1 = new char[512];

            while ((hasData = fileReader.read(c1)) > 0) {
                // System.out.println("hasData="+hasData);
                System.out.println(new String(c1, 0, hasData));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

            if (null != fileReader) {
                fileReader.close();
            }
        }

    }

    @Test
    void fileWriter() throws IOException {
        //读入数据
        FileReader fileReader = new FileReader("F:\\剑指offer\\src\\test\\java\\IO\\FileReaderWriterTest.java");
        //1.创建字节输出流
        FileWriter fileWriter = new FileWriter("FileOut.txt");
        try {

            //2.创建接收容器
            char[] c = new char[100];
            int hasData = 0;
            //3.接收字符
            while ((hasData = fileReader.read(c)) > 0) {

                fileWriter.write(c, 0, hasData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileReader) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != fileWriter) {

                fileWriter.close();
            }

        }
    }

    @Test
    void fileInPut() {

        FileInputStream fs = null;
        FileOutputStream fw = null;

        try {
            //读文件
            fs = new FileInputStream("F:\\剑指offer\\src\\test\\java\\IO\\微信图片_20210309150038.jpg");
            //输出文件
            fw = new FileOutputStream("lege.jpg");
            //设置容器大小
            byte[] b = new byte[10];
            int hasData = 0;
            //输出
            while ((hasData = fs.read(b)) > 0) {
                fw.write(b, 0, hasData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fs) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 转换流
     * 字节输入流 ->字符输入流 解码
     * 字符输出流 ——》字节输出流 编码
     */
    @Test
    void change() {
        FileInputStream fs = null;
        try {
            //获取字节流
            fs = new FileInputStream("F:\\剑指offer\\FileOut.txt");
            //转换成字符输出入流,指明字符集
            InputStreamReader inputStream = new InputStreamReader(fs, "UTF-8");
            BufferedReader br = new BufferedReader(inputStream);
            int hasData = 0;
            char[] c = new char[1024];
            while ((hasData = br.read(c)) > 0) {
                System.out.print(new String(c, 0, hasData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fs) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 综合使用 file
     */
    @Test
    void comprehensiveUse() throws Exception {
        //创建字符流
        FileInputStream fis = new FileInputStream("F:\\剑指offer\\src\\test\\java\\IO\\FileReaderWriterTest.java");
        FileOutputStream fos = new FileOutputStream("F:\\剑指offer\\FileOut1.txt");


        //创建转化流
        InputStreamReader isr = new InputStreamReader(fis);
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        int hasData = 0;
        char[] c = new char[1024];
        while ((hasData = isr.read(c)) > 0) {

            osw.write(c, 0, hasData);
        }

        fis.close();
        fos.close();



    }

    @Test
    void test5() throws ClassNotFoundException {
        //调用运行时属性
        Class clazz = Person.class;
        System.out.println(clazz.hashCode());

        //通过运行时类的对象
        Person person = new Person();
        Class aClass = person.getClass();
        System.out.println(aClass.hashCode());
        Class aClass1 = Class.forName("IO.Person");
        System.out.println(aClass1.hashCode());

        System.out.println();

        System.out.println(person.hashCode());


    }

}
