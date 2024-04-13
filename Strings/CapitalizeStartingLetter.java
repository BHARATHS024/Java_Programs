package p1;
import java.util.*;

public class capital {

		  public static String capitalizeEachWord(String line) {
		    if (line == null || line.isEmpty()) {
		      return line;
		    }

		    String[] words = line.split("\\s");
		    StringBuilder sb = new StringBuilder();

		    for (String word : words) {
		      sb.append(word.substring(0, 1).toUpperCase());
		      sb.append(word.substring(1));
		      sb.append(" ");
		    }
		    sb.setLength(sb.length() - 1);

		    return sb.toString();
		  }

		  public static void main(String[] args) {
			  Scanner sc=new Scanner(System.in);
		    String line = sc.nextLine();
		    String capitalizedLine = capitalizeEachWord(line);
		    System.out.println(capitalizedLine); 
		  }
		


}
