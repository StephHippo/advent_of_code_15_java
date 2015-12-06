import java.io.*;

class Day01{
	public static void main(String args[]){

		String fileName = "../../input/day01_input.txt";

		FileReader fileInput = null;
		Boolean foundBasement = false;
	  try{	
			fileInput = new FileReader(fileName);
			int r;
			int floor = 1;
			int i = 0;
			while ((r = fileInput.read()) != -1) {			
				char c = (char) r;
				if (c == '('){
					floor++;	
				}
				if (c == ')'){
					floor--;
				}
				if (floor < 0 && !foundBasement){
					foundBasement = true;
					System.out.printf("In basement at position %d \n", i);
				}
				i++;
			}
			System.out.printf("Final Floor: %d \n", floor);
		} catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
		} catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
	}
}
