/*
 * author Edgar Romero
 * This program will give you the area of a triangle
 */
import java.util.Scanner;

public class Triangle_Area {
	
	public static void main(String[] args) {

		//here I declare the variable that will be used 
		double s1, s2, s3, s4, area; 
		
		//asks users for sides to assign them a value
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of side a :"); 
        s1 = s.nextDouble();
        System.out.print("Enter the length of side b :"); 
        s2 = s.nextDouble();
        System.out.print("Enter the length of side c :"); 
        s3 = s.nextDouble();
        
        //Heron's formula used for how to use the user inputs
        s4 = (s1 + s2 + s3 )/ 2 ;
        area = Math.sqrt(s4 * (s4 - s1) * (s4 - s2) * (s4 - s3));
        System.out.print("Area of Triangle is: "+area);
        
        
        //validates triangle
        if (((s1+s2) > s3) && ((s1+s3) > s2) && ((s2+s3) >s1)) {
        	
        } 
        		          
	  		
        
    }
}
			
	
			