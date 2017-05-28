package SampleProject;

import java.util.Arrays;
import java.util.List;

public class PrintListValues {

	public static void main(String[] args) {
		List<String> datas = Arrays.asList("1","2","3");
		System.out.println(datas);
		
		datas.forEach(System.out::println);
	}

}
