package IO.supporter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {
	
	public static void main(String[] args) throws Exception {
	// 객체 입출력 보조 스트림	
	// 객체 직렬화 , 역직렬화	
		writeList();					// List를 파일에 저장
		List<Board> list = readList();	// 파일에 저장된 List 읽기
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
			System.out.println(
					board.getBno() + "\t" + board.getTitle() + "\t" +
					board.getContetnt() + "\t" + board.getWriter() + "\t" +
					sdf.format(board.getDate())
					);
		}
	}	
		
	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Users/KSJ/Desktop/test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);	// 직렬화 , 바이트로 만든다 (바이트 직렬화)
		oos.flush();
		oos.close();
		
	}
	
	@SuppressWarnings("unchecked")
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/KSJ/Desktop/test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject(); // 역직렬화 객체로만든다
		return list;
	}
		
		
	

}
