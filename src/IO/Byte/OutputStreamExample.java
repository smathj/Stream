package IO.Byte;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Users/KSJ/Desktop/test3.db");
		//test.txt 파일에다 출력. 즉, 여기다 적겠다
		
		
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
//		os.write(a);	// 1바이트씩 출력
//		os.write(b);	// 1바이트씩 출력
//		os.write(c);	// 1바이트씩 출력
		
//		byte[] array = { 10,20,30 };
		byte[] array = { 10,20,30,40,50 };
		
//		os.write(array); // 배열의 모든 바이트를 출력
		os.write(array,1,3); // 배열의 1번 인덱스부터 3개를 출력
		
		os.flush();		// 출력 버퍼에 남아있는 모든 바이트 출력
		os.close();		// 출력 스트림 해제
		
	}

}
