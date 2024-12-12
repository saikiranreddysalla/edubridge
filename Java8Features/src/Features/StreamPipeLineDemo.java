package Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeLineDemo {

	private static final String JAVA = null;

	public static void main(String[] args) {

		List<Integer> salaries = Arrays.asList(50000, 40000, 20000, 30000, 60000);
		System.out.println(salaries);
		
		/* 
		  1.Filter the salaries which are >=50000
		  2.Increment the filtered salaries by 10%  //50000+60000
	      3.Find the total of filtered and incremented salaries //1,11,000
		  Expected output: 121000
		 */
             
       /*
		List<Integer> filteredSalaries = salaries.stream()
                .filter(salary -> salary >= 50000)
                .collect(Collectors.toList());
        System.out.println("Filtered Salaries: " + filteredSalaries);
        
        List<Integer> incrementedSalaries = filteredSalaries.stream()
                .map(salary -> (int) (salary * 1.10)) 
                .collect(Collectors.toList());
        System.out.println("Incremented Salaries: " + incrementedSalaries);

        
        int totalSalary = incrementedSalaries.stream()
                .mapToInt(Integer::intValue)
                .sum();
            System.out.println("Total Salary: " + totalSalary);
            */
		
		double totalSalary= salaries.stream()        //source
				.filter((salary) -> salary >=50000) //Intermediate operation -1
				.map((salary) -> salary+ salary*.1) //Intermediate operation -2
				.mapToDouble(salary-> salary)       //Intermediate operation -3 
				.sum();                             //Terminal operation
		System.out.println(totalSalary);
		
		System.out.println("----------------------------");
		
		/* 
		  Task-2:
		  Filter the salaries which are <=50000
		  sort the filtered salaries in Descending order
	      Expected output:[50000,40000,30000,20000]
		 */
           
       List<Integer> incrementedsalaries=salaries.stream() //source	   
          .filter((salary) -> salary <=50000)              //Intermediate operation-1
          .sorted(Comparator.reverseOrder())               //Intermediate operation-2
          .toList();                                       //Terminal operation
       System.out.println(incrementedsalaries);
       
       System.out.println("----------------------------");
       
       /* Input: [1,3,2,4,3,1,2]
       Output: [4,3,2,1]
        */
       List<Integer> nums = Arrays.asList(1,3,2,4,3,1,2);
       List<Integer> uniquenums = nums.stream()
                                .distinct()                        // Remove duplicates
                                 .sorted(Comparator.reverseOrder()) // Sort in descending order
                                 .toList(); 
       System.out.println(uniquenums);
       
       System.out.println("----------------------------");
       
       
       /* Input: JAVA
       Output: J A V A
       */
       // Input string
       String input = "JAVA";

       // Convert the string to a stream of characters and join with spaces
       String spacedOutput = Arrays.stream(input.split("")) // Split the string into individual characters
                                   .collect(Collectors.joining(" ")); // Join characters with space

       System.out.println(spacedOutput);
       
       
       System.out.println("----------------------------");
   		
   		
   		
        /*
		Task 5:
		Input: ["ja va", "py thon", "an gu lar"] 
		Output: ["JAVA","PYTHON","ANGULAR"]
		*/
       // Task 5: Convert input strings to uppercase and remove spaces
       List<String> inputs = Arrays.asList("ja va", "py thon", "an gu lar");

       List<String> result = inputs.stream() // Source
               .map(str -> str.replaceAll(" ", "")) // Remove spaces
               .map(String::toUpperCase) // Convert to uppercase
               .collect(Collectors.toList()); // Collect as a list

       System.out.println(result);
 
	}
	
}
