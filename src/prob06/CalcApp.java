package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		System.out.println("실행 결과:");
		while (true) {
			System.out.print(">> ");
			String expression = scanner.nextLine();

			if ("quit".equals(expression)) {
				break;
			}

			String[] tokens = expression.split(" ");

			int firstNum = Integer.parseInt(tokens[0]);
			String formula = tokens[1];
			int secondNum = Integer.parseInt(tokens[2]);

			switch (formula) {
			case "+":
				add.setValue(firstNum, secondNum);
				System.out.print(">> " + add.calculate());
				break;
			case "-":
				sub.setValue(firstNum, secondNum);
				System.out.print(">> " + sub.calculate());
				break;
			case "*":
				mul.setValue(firstNum, secondNum);
				System.out.print(">> " + mul.calculate());
				break;
			case "/":
				div.setValue(firstNum, secondNum);
				System.out.print(">> " + div.calculate());
				break;
			}
			System.out.println();

			if (tokens.length != 3) {
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}

			/* 코드를 완성 합니다 */

		}

		scanner.close();

	}

}
