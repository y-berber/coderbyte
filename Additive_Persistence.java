package coderbyte;
import java.util. *;
public class Additive_Persistence{
	static int tekrar=0;
public static int AdditivePersistence(int number){
	int result =0;
	if(number>9) {
		int basamak=0 ;
		basamak=number%10;
		result=(number/10)+basamak;
		tekrar++;
		return AdditivePersistence(result);	}
		else {return tekrar;}
	}

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int number = Integer.valueOf(scn.nextLine()).intValue();
		System.out.println(AdditivePersistence(number));
		scn.close();
	}
}