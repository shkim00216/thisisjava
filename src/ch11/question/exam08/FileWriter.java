package ch11.question.exam08;

public class FileWriter implements AutoCloseable {
	public FileWriter(String filePath) throws IOEXception {
		System.out.println(filePath + " 파일을 엽니다.");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}

}
