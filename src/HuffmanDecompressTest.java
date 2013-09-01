import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *Takes in file name through cmd and decompresses the file.
 *
 *@author Alvin Prieto
 *
 *@date 11/26/12
 **/

public class HuffmanDecompressTest{
	public static void main (String [] args) throws IOException{
	
		if (args.length == 0){
			System.out.println("Please enter a file name.");
		}
		else if (args.length > 1){
			System.out.println("Please enter only one file name.");
		}
		else {
	
			try {
	
				String fileName = args[0];
		
					if (!fileName.endsWith(".huff")){
						System.out.println("File name must end with .huff.");
					}
					else {
						Decompress decom = new Decompress(fileName);
					}
			}
			catch (FileNotFoundException FNFE){
				System.out.println("File Not Found.");
			}
		}			
	}
}