package IO.Char;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws Exception {

		// 문자 기반 스트림 생성 
		Writer writer = new FileWriter("C:/Users/KSJ/Desktop/test.txt");
		// test.txt에 연결된 파일 출력 스트림 생성
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);	// 한 문자씩 출력
		writer.write(b);	// 한 문자씩 출력
		writer.write(c);	// 한 문자씩 출력
		
		writer.flush();
		writer.close();
	}
}
