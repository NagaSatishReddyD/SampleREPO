package SampleProject;

import java.text.DecimalFormat;

public class GitCommandsExecution {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("0.000000");
		System.out.println(f.format(2/6.0));
		System.out.printf("%.6f",3/6.0);
	}

}
