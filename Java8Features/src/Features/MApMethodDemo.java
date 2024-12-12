package Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MApMethodDemo {

	public static void main(String[] args) {
		List<Integer>salaries = Arrays.asList(55000,45000,25000,350000,65000);
		System.out.println(salaries);
		
		List<Integer>incrementedsalaries = new ArrayList<>();
		//60000, 50000, 30000, 355000, 70000
		
		Function<Integer, Integer> fun = (salary) -> salary +5000;
		
		incrementedsalaries = salaries.stream()
				.map(fun)
				.toList();
		System.out.println(incrementedsalaries);
		
		//Increment each salary by 10% 
		List<Double>incrSalaries = new ArrayList<>();
		
	

	}

}
