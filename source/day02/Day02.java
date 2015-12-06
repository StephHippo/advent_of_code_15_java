import java.io.*;
import java.util.Arrays;

class Day02{
	public static void main(String args[]){
	String fileName = "../../input/Day02_input.txt";
	
  try{
 		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String measurements;
		int total_paper = 0;
    int total_ribbon = 0;	
		while((measurements = br.readLine()) != null){
			String[] dimensions = measurements.split("x");
			int l = Integer.parseInt(dimensions[0]);
			int w = Integer.parseInt(dimensions[1]);
			int h = Integer.parseInt(dimensions[2]);
	    
			int sides[] = {l, w, h};
			Arrays.sort(sides);
	
			total_paper += 2*l*w + 2*w*h + 2*h*l + sides[0]*sides[1];
			total_ribbon += 2*sides[0] + 2*sides[1] + l*w*h ; 
		}
		System.out.printf("Total paper needed: %d\n", total_paper);
		System.out.printf("Total ribbon needed: %d\n", total_ribbon);
	} catch (FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
	} catch (IOException ex){
			System.out.println(ex.getMessage());
	}
	}
}
