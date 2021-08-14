package IO.Byte;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("C:/Users/KSJ/Desktop/test.txt");

//		(1)
//		while(true) {
//			int data = is.read(); // 1바이트씩 읽기
//			if(data == -1) break;
//			System.out.println(data);
//		}
//		is.close();

		byte[] buffer = new byte[100]; // 길이가 100인 배열 생성
		
		while(true) {
			int readByteNum = is.read(buffer);
			if(readByteNum == -1) break;
			for(int i = 0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
	}
}
