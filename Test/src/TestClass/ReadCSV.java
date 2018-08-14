package TestClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
	public static void main(String[] args) {
		String csvFile = "C:/Users/Thirupathi/Desktop/infosys/userscsv.csv";
		 BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        try {
	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {
	                // use comma as separator
	                String[] country = line.split(cvsSplitBy);
	                System.out.println( country[0] +"==="+country[1]);
	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		
		
	}

}
