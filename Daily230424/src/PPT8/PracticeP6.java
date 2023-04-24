package PPT8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeP6 {
	public static void FileWrite() throws IOException {
		File f_k36 = new File("c:\\Users\\DataSWB\\Mytest.txt");
		BufferedWriter bw_k36 = new BufferedWriter(new FileWriter(f_k36));

		bw_k36.write("안녕 파일");
		bw_k36.newLine();
		bw_k36.write("hello 헬로");
		bw_k36.newLine();
		
		bw_k36.close();
	}
	public static void FileRead() throws IOException {
		File f_k36 = new File("c:\\Users\\DataSWB\\Mytest.txt");
		BufferedWriter br_k36 = new BufferedWriter(new FileWriter(f_k36));
		
		String readtxt_k36;
		
		while((readtxt_k36 = br_k36.readLine()) != null) {
			System.out.printf("%s\n", readtxt_k36);
		}
		br_k36.close();
	}		
	public static void main(String[] args) throws IOException {
		FileWrite();
		FileRead();
	}
}
