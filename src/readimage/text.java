package readimage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class text {
	static File f=null;
	static String st;
	public text() {
		
	}
	public static void TextInBinary() {
		f=new File("C:\\Users\\lenovo\\Desktop\\message.txt");
		try {
			BufferedReader br=new BufferedReader(new FileReader(f));

			while((st=br.readLine())!=null) {
				System.out.println(st);
			}
			 
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
