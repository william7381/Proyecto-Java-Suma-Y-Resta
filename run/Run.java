package run;

import logic.Operation;

public class Run {
	
	public static void main(String[] args) {
		Operation operation = new Operation();
		System.out.println(operation.sum(1,2));
		System.out.println(operation.subtract(2,1));

	}

}
