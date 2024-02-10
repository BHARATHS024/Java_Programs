//To update String with specific index.
package p2;
import java.util.*;

public class ReplaceAtIndexString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=sc.nextLine();
		System.out.print("Enter the index to change character : ");
		int a=sc.nextInt();
		System.out.print("Enter the new character : ");
		char c=sc.next().charAt(0);
		str=str.substring(0,a)+c+str.substring(a+1);
		System.out.print("The Updated String : "+str);
	}

}

/*Other methods :
StringBuilder string=new StringBuilder(str);  string.setCharAt(index,ch);
StringBuffer string=new StringBuffer(str);  string.setCharAt(index,ch);
*/
