package loopsMethodsClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class _9_listOfProducts {

	public static void main(String[] args) {
		try{
			ArrayList<Product> products= new ArrayList<Product>();
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Filip\\workspace\\Introduction to Java\\src\\loopsMethodsClasses\\input1.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Filip\\workspace\\Introduction to Java\\src\\loopsMethodsClasses\\output.txt"));
			String input;
			while ((input=reader.readLine())!=null) {
				String []splited = input.split(" ");
				products.add(new Product(splited[0], Double.parseDouble(splited[1])));
			}
			Collections.sort(products);
			for (Product product : products) {
				writer.write(product.getPrice()+" "+product.getName()+"\r\n");
			}
			reader.close();
			writer.close();
			}
			catch(IOException ex){
				System.out.println("Error");
			}

	}

}
