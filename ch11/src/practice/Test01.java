package practice;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test01 {
	public static void main(String[] args) {
		try {
			// Connection Stream
			FileReader fr = new FileReader("src/practice/Test01.java");
			FileWriter fw = new FileWriter("src/practice/Test01.num");

			// Chain Stream
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			String data;
			for (int i =1; (data = br.readLine()) !=null; i++) {
				bw.write(i + " " + data + "\n");
			}

			br.close();
			bw.close();
			fr.close();
			fw.close();

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
