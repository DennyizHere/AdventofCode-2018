import java.util.*;

public class Day1 {

	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		Scanner stuff = new Scanner(System.in);
		String action = stuff.nextLine();

		while (!action.equals("")) {
			numbers.add(Integer.parseInt(action));
			action = stuff.nextLine();
		}
		
		System.out.println(part1(numbers));
	}
	
	static int part1(List<Integer> moves) {
		int total = 0;
		
		for (int i = 0; i < moves.size(); i++) {
			total += moves.get(i);
		}
		
		return total;
	}
	

}
