package ru.neoflex.advanced.task1;

public class Main {

	public static void main(String[] args) {
		//Создадим класс простой дроби
		Ratio ratio = new Ratio(2, 6);

		Ratio r = new Ratio(1.5d);
		System.out.println(r.toString());
		
		//Проверим работу сокращения дроби
		if (ratio.toString().equals("1/3")){
			System.out.println("Ok:)");
			
		} else {
			System.out.println("Error:(");
		}

	}

}
