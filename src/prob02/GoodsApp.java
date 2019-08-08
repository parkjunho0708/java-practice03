package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[3];
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			String info = scanner.nextLine();
			String[] data = info.split(" ");
			
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int countStock = Integer.parseInt(data[2]);
			
			goods[i] = new Goods(name, price, countStock);
			//System.out.println(name + ":" + price + ":" + countStock);
		}
		
		for(int i = 0; i < goods.length; i++) {
			goods[i].show();
		}
		
		
		scanner.close();
	}
}
