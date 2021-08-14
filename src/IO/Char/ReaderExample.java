package IO.Char;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception {
		
		// 문자기반 입력스트림 생성
		Reader reader = new FileReader("C:/Users/KSJ/Desktop/test.txt");
		// test.txt에 연결된 문자기반 입력스트림 생성
		
		while(true) {
			int data = reader.read(); 		// 한문자씩 읽기 2바이트를 읽어서 4바이트 크기공간에 리턴
			if(data == -1) break;			// 읽을게 없으면 종료
			System.out.print((char)data); // 4바이트를 2바이트로 형변환
		}
		reader.close();
	}
}
