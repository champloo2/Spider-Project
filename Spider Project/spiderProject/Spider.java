package spiderProject;
//import java.util.Random;
import java.util.Scanner;

public class Spider {	
//make these methods:
//feed the spider
	//main method call the feed method for the "last meal" array
	public static void feedSpider(String[] feed, int[] addCrickets){	
	//ask the user which spider they want to feed
	System.out.println("Which spider babe are you feeding?\n1 = Gus, 2 = Tracy, 3 = Dolores, 4 = Diego, 5 = lilpoop, 6 = meep, 7 = tracyjr");
	//use scanner to read the input
	Scanner whichSpider = new Scanner(System.in); 
	if(whichSpider.hasNextInt()) {
		int spiderNum = whichSpider.nextInt();
			if(spiderNum <= 7) {
				 System.out.println(spiderNum);
			}
			else {
				System.out.println("Must be an integer that is less than 8");
			}
	}
	else {
		System.out.println("that is not an integer");
	}
	//if user inputs 1 or Gus, use array element 1 and so on
	
	//ask the user how many crickets
	//for the array element, update the last fed to "today" for now (until i figure out how to add dates"
	//add add crickets to numCrickets
	//print the dateLastFed array
}
//document a molt
//molt status

	
	
	public static void main(String[] args) {
		
		String spiders[]= {"Bby Gus", "bigTracy", "Dolores", "Diego", "lilpoop", "meep", "tracyjr"};
		//last date fed
			String dateLastFed[] = new String [spiders.length];
		//# of crickets fed
			int numCrickets[] = new int [spiders.length];
		//last molt
			String dateLastMolt[] = new String [spiders.length];
		//premolt/postmolt/normal
			String moltStatus[] = new String [spiders.length];
			feedSpider(dateLastFed, numCrickets);

		
			
			
			
			
			
			
			
			

		/*This was to practice with random numbers and arrays
		 * 
		 * Random rand = new Random();	
		int freq[] = new int[7];  //declar an array called "freq" with 7 (0-6) integers
		for(int i=1;i<1000;i++) {
			++freq[1+rand.nextInt(6)];	//plus 1 to the element of the array of whatever randome number is generated
		}
			System.out.println("Face\tFrequency");
		for(int face=1;face<freq.length;face++) {
			System.out.println(face+"\t"+freq[face]);
		}*/
		
	}

}
