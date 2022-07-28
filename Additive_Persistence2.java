package coderbyte;
import java.util. *;
public class Additive_Persistence2{
	static int count=0 ;
	
public static int AdditivePersistence(int number){
	int result =0;
	
	if(number>9) {
		count++;
		
		while(number>0) {	// basamak değerlerini topluyoruz
			result +=number%10;
			number/=10;
			}	//while kapama
		
	return AdditivePersistence(result);
	}else {return count;
		} // if-else  kapama
	
	}	//metod kapama

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int number = Integer.valueOf(scn.nextLine()).intValue();
		System.out.println(AdditivePersistence(number));
		scn.close();
	}
}