package IO.supporter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception{
	// 보조 스트림을 이용하여 한줄씩 읽자
		
		Reader reader = new FileReader(
				ReadLineExample.class.getResource("DeathNote.txt").getPath());
		
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine(); // 한줄씩 읽고 리턴
			if(data == null) break;
			System.out.println(data);
		}
		br.close();
	}
}
