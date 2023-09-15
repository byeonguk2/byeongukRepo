package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args)throws Exception {
		
		System.out.println("=====STREAM=====");
		
		File f = new File("D:\\byeonguk2\\Hello.txt");
		//f.delete();  //파일 삭제
		
//		FileOutputStream fos = new FileOutputStream(f);  
//		fos.write(70); //f파일에 70을 넣었지만 아스키코드에 의해 F로 보임
		
//		FileWriter fw = new FileWriter(f);
//		fw.write("dasd");
//		fw.flush();
		
//		PrintStream ps = new PrintStream(f);
//		ps.println("테스트 ㅎㅎㅎ");
		
		
		//===========================================================
		
//		FileInputStream fis = new FileInputStream(f);
//		for(int i = 0 ; i < 3; i++) {
//			int result = fis.read();
//			char x = (char) result;
//			System.out.println(x);
//		}
		
		FileReader fr = new FileReader(f);
		//같은 리더타입만 들어올수 있음(리더는 버퍼트나 파일에 부모클래스)
		BufferedReader br = new BufferedReader(fr);
		String result = br.readLine();
		System.out.println(result);
		
		String result2 = br.readLine();
		System.out.println(result2);
		
		String result3 = br.readLine();
		System.out.println(result3);
		
	}//main

}//class
	