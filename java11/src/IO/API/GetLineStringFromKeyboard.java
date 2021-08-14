package IO.API;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		
		// InputStream을 Reader로 변환하고 다시 BufferedReader을 연결 
		InputStream is = System.in;
		Reader read = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(read);
		
		while(true) {
			System.out.print("입력하세요 : ");
			String lineStr = br.readLine();	// 라인 단위로 문자열을 읽음
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.print("입력된내용 : " + lineStr);
			System.out.println();
		}
		br.close();
	}
}
