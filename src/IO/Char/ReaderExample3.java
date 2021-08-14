package IO.Char;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample3 {

	public static void main(String[] args) throws Exception {
		
		// 문자기반 입력스트림 생성
		Reader reader = new FileReader("C:/Users/KSJ/Desktop/test.txt");
		// test.txt에 연결된 문자기반 입력스트림 생성
		
		char[] buffer = new char[5];						// 길이 100인 배열 생성
		
		int readCharNum = reader.read(buffer, 2, 3); 	// 한문자씩 읽기 2바이트를 읽어서 4바이트 크기공간에 리턴
		if(readCharNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.print(buffer[i]); 				// 4바이트를 2바이트로 형변환
			}
		}
		reader.close();
	}
}
