package IO.Char;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample4 {

	public static void main(String[] args) throws Exception {

		// 문자 기반 스트림 생성 
		Writer writer = new FileWriter("C:/Users/KSJ/Desktop/test.txt");
		// test.txt에 연결된 파일 출력 스트림 생성
		
		//char[] array = {'A', 'B', 'C'};
		char[] array = {'가', '나', '다'};
		
		writer.write(array);	// 배열의 모든 문자 출력
		
		writer.flush();			// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close();			// 출력 스트림 해제
	}
}
