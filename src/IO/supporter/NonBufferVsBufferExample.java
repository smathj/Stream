package IO.supporter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		
		String originalFilePath1 =
				NonBufferVsBufferExample.class.getResource("가나다.JPG").getPath();
//		String originalFilePath1 =
//				NonBufferVsBufferExample.class.getResource("originalFile1.JPG").getPath();
		String targetFilePath1 = "C:/Users/KSJ/Desktop/targetFile1.JPG";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		
		
		String originalFilePath2 =
				NonBufferVsBufferExample.class.getResource("가나다2.JPG").getPath();
//		String originalFilePath2 =
//				NonBufferVsBufferExample.class.getResource("originalFile2.JPG").getPath();
		String targetFilePath2 = "C:/Users/KSJ/Desktop/targetFile2.JPG";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을때:\t" + nonBufferTime + "ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을때:\t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();	// 시작 시간 저장
		
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();	// 끝 시간 저장
		return (end-start);				// 걸린 시간 리턴
	}

}
