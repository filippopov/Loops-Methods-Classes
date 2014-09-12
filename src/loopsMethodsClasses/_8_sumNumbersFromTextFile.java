package loopsMethodsClasses;

import java.io.BufferedReader;
import java.io.FileReader;

public class _8_sumNumbersFromTextFile {

	public static void main(String[] args) {
		try{
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Filip\\workspace\\Introduction to Java\\src\\loopsMethodsClasses\\input.txt"));
			String line = null;
			int result =0;
			while((line=reader.readLine())!=null){
				result+=Integer.parseInt(line);
			}
			System.out.println(result);
		}
		catch(Exception ex){
			System.out.println("mising file");
		}

	}

}
