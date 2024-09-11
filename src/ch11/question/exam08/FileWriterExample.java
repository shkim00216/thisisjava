package ch11.question.exam08;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("file.txt");
//			fw.write("Java");
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fw.close();
//			} catch (IOException e) {
//				
//			} 
//		}
		
		try( FileWriter fw = new FileWriter("file.txt") ) {
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		} //리소스 자동 닫기를 이용하여 수정한 코드
	}

}
