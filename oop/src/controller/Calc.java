/**
 * 
 */
package controller;

/**
 * @date :2016. 6. 14.
 * @author :오승준
 * @file :Calc.java
 * @story :
 */
public class Calc {
	public String execute(int inputNum1,String opcode, int inputNum2) {

		int num1 = inputNum1;
		int num2 = inputNum2;
		String op = opcode;
		num1 = inputNum1;
		int result = 0;
	
		switch (op) {
		case "+":
			op = "+"; 
			result = num1 + num2;
			break;
		case "-":
			op = "-"; 
			result = num1 - num2;
			break;
		case "*":
			op = "*"; 
			result = num1 * num2;
			break;
		case "/":
			op = "/";
			result = num1 / num2;
			break;
		case "%":
			op = "%";
			result = num1 % num2;
			break;
		default:
			System.out.println("1~5까지만 입력바랍니다.\n");
			break;
		}
		return num1 + op + num2 + "=" + result;
		}
}
