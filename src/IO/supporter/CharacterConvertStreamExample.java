package IO.supporter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/KSJ/Desktop/test.txt");
		// 바이트 기반
		Writer writer = new OutputStreamWriter(fos);
		// 				바이트로 나간다, 문자가 
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/KSJ/Desktop/test.txt");
		// 바이트 기반
		Reader reader = new InputStreamReader(fis);
		//				바이트가 들어온다  , 문자로 읽는다
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}

}
