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
		
		System.out.println("Part 1 answer: " + part1(numbers));
		System.out.println("Part 2 answer: " + part2(numbers));
	}
	
	static int part1(List<Integer> moves) {
		int total = 0;
		
		for (int i = 0; i < moves.size(); i++) {
			total += moves.get(i);
		}
		
		return total;
	}
	
	static int part2(List<Integer> moves) {
		HashSet<Integer> freqs = new HashSet<Integer>();
		int total = 0;
		freqs.add(0);
		
		for (int i = 0; i < moves.size(); i++) {
			total += moves.get(i);
			if (freqs.contains(total)) {
				break;
			}
			else {
				freqs.add(total);
			}
			if (i == moves.size() - 1) i = -1;
		}
		
		return total;
	}
	

}
