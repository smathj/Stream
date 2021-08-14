package IO.Char;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample2 {

	public static void main(String[] args) throws Exception {

		// 문자 기반 스트림 생성 
		Writer writer = new FileWriter("C:/Users/KSJ/Desktop/test.txt");
		// test.txt에 연결된 파일 출력 스트림 생성
		
		// String 으로 출력하자
		String str = "징가야 그런책 사지마슈";
		
		writer.write(str);	// 배열의 1번 인덱스부터 3개 출력
		
		writer.flush();		// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close();		// 출력 스트림 해제
	}
}
