package JavaProgram;

import java.io.File;
import java.util.Scanner;

public class ReadDataFromTxtFile {

	public static void main(String[] args) throws Exception  {
		
		//Apprach1(By suing FileReader and Buffer Reader calss )
		
		/*
		 * FileReader fr= new FileReader("C:\\Users\\DELL\\Desktop\\TestFile1.txt");
		 * 
		 * //Create object of Buffer Reader calss
		 * 
		 * // BufferReader br= new BufferReader();
		 * 
		 * BufferReader br= new BufferReader(fr);
		 * 
		 * while((str=br.readLine())!=null) { System.out.println(str); } br.close;
		 */
		
		
		//Apprach 2 By usoing File and scanner class
		
		/*File file = new File("C:\\Users\\DELL\\Desktop\\TestFile1.txt");
		
		Scanner sc= new Scanner(file);
		
		while(sc.hasNextLine()) {
			 System.out.println("the Data of text file: "+sc.nextLine());
		}
		*/
		
		
		//Apprach 3 By using delemiter
		
		File file = new File("C:\\Users\\DELL\\Desktop\\TestFile1.txt");
		
		Scanner sc= new Scanner(file);
		
		sc.useDelimiter("\\z");
		
		System.out.println(sc.next());
	}

}
