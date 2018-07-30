package JenkinsTest.jenkinsDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class HelloWorld {

	public static void count(byte i) {
		System.out.println(1/i);
		//i = i-1;
		System.out.println(i);
		System.out.println(1/i);
		
	}
	
	public static void testDouble(float i) {
		System.out.println(1/i);
	}
	
	public static void testByte(byte b) {
		System.out.println(b);
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hello hello world");
		
		String str1="1" ;
		//Integer i=Integer.parseInt(str1);
		int i=256;
		//count((byte)i);
		//count("tst");
		
		/*
		 * 发生NumberFormatException
		String str="123j";
		double result = 12.0/Integer.parseInt(str);
		String str2="128";
		Byte b1 = Byte.parseByte(str2);
		System.out.println(b1);
		*/
		testDouble((float)0.00000000001);
		System.out.println(1/0.0);
		String str2 = "+128";
		//byte i2 = Byte.parseByte(str2);
		//System.out.println(i2);
		
		//testByte(128);
		
        int ins[]= {1,2,3};
        //System.out.println(ins[3]);
        
        String file="filename.txt";
        String charSet = "UTF-8";
        FileOutputStream fileWriter = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(fileWriter,charSet);
        try {
        	writer.write("测试字符串1");
        }catch(Exception e) {
        	
        }
        finally {
        	writer.close();
        }
        

	}

}
