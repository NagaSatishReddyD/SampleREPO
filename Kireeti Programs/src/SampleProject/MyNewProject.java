package SampleProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyNewProject {
	public static void main(String args[]) {
	int iteratorValue;
	List<Integer> initialValue = new ArrayList<Integer>();
	       for(iteratorValue=1;iteratorValue<100;iteratorValue++) {
	    	initialValue.add(iteratorValue);
	    	}
	       System.out.println(initialValue);
	       List<Integer> resultValue =  initialValue
	    		   .stream().collect(Collectors.toList());
	       System.out.println(resultValue);
	       }
  
}
