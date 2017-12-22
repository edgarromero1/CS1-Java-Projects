/*
 * author Edgar Romero
 * This program will give you your horoscope
 */
import java.util.Scanner;

public class Horoscope {
   
	public static void main(String[] args) {
		

	  Scanner input = new Scanner(System.in);
	  // asks user for birthday
	  System.out.print("Enter your birth month (1-12): ");
      int month = input.nextInt();
      System.out.print("Enter your birth day (1-31): ");
      int day = input.nextInt();
      input.close();
      String sign;
     
      // if user puts invalid number return this
      if (month < 1 || month > 12) {
          System.out.println("Invalid month number. Months are between 1-12");
          return;
      }


      else if (day < 1 || day > 31) {
        System.out.println("Invalid 	day number. Days are between 1-31");
        return;
    }
 
      // determines all possible birthdays to their possible signs
      else if (month == 1) {
        if (day <= 19) {
            sign = "Capricorn";
        } else {
            sign = "Aquarius";
        }
    } 
      else if (month == 2) {
        if (day <= 18)
            sign = "Aquarius";
        else {
            sign = "Pisces";
        }
    }
      else if (month == 3) {
        if (day <= 20) {
            sign = "Pisces";
        } else {
            sign = "Aries";
        }
    }
      else if (month == 4) {
        if (day <= 19) {
            sign = "Aries";
        } else {
            sign = "Taurus";
        }
    } 
      else if (month == 5) {
        if (day <= 20) {
            sign = "Taurus";
        } else {
            sign = "Gemini";
        }
    }
      else if (month == 6) {
        if (day <= 21) {
            sign = "Gemini";
        } else {
            sign = "Cancer";
        }
    } 
      else if (month == 7) {
        if (day <= 22) {
            sign = "Cancer";
        } else {
            sign = "Leo";
        }
    }
      else if (month == 8) {
        if (day <= 22) {
            sign = "Leo";
        } else {
            sign = "Virgo";
        }
    } 
      else if (month == 9) {
        if (day <= 22) {
            sign = "Virgo";
        } else {
            sign = "Libra";
        }
    } 
      else if (month == 10) {
        if (day <= 23) {
            sign = "Libra";
        } else {
            sign = "Scorpio";
        }
    }
      else if (month == 11) {
        if (day <= 21) {
            sign = "Scorpio";
        } else {
            sign = "Sagittarius";
        }
    } 
      else {
        if (day <= 21) {
            sign = "Sagittarius";
        } else {
            sign = "Capricorn";
        }
    }
// assigns birthday to fortune 
    System.out.println("You are a " + sign);
    String fortune;
    if (sign.equals("Capricorn")) {
        fortune = "Wonder fills your mind";
    }
    else if (sign.equals("Aquarius")) {
        fortune = "You are a visionary";
    }
    else if (sign.equals("Pisces")) {
        fortune = "You're probably the most chill person there is";
    } 
   	else if (sign.equals("Aries")) {
        fortune = "You'll get Michael Phelp's autograph";
    }
    	else if (sign.equals("Taurus")) {
        fortune = "Working out lies in your future";
    } 
    	else if (sign.equals("Gemini")) {
        fortune = "Become a rapper, you'll hit it big";
    } 
    	else if (sign.equals("Cancer")) {
        fortune = "Don't drink the kool aid";
    } 
    	else if (sign.equals("Leo")) {
        fortune = "You will be a millionaire";
    } 
    	else if (sign.equals("Virgo")) {
        fortune = "After graduation you'll get a job fast";
    } 
    	else if (sign.equals("Libra")) {
        fortune = "You're destined for great things";
    }
    	else if (sign.equals("Scorpio")) {
        fortune = "Never ever go to South Dakota";
    } 
    
    	else {
        fortune = "You are a god";
    }
    System.out.println(fortune);
}
}