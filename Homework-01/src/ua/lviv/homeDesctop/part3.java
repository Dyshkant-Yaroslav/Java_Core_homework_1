package ua.lviv.homeDesctop;

public class part3 {
public static void main(String[] args) {
	
	int [] array = {5,64,128,69,227,436,893,2};
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for (int i = 0; i < array.length; i++) {
		max = Math.max(max, array[i]);
		min = Math.min(min, array[i]);
	}
	System.out.println("Максимальний елемент в массиві "+ max);
	System.out.println("Мінімальний елемент в массиві "+ min);
}
}
