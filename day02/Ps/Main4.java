package day02.Ps;

public class Main4 {
	public static void main(String[] args) {
		double celsius = 12.0;

		double fahrenheit = (celsius * 9 / 5) + 32;

		double kelvin = celsius + 273.15;

		fahrenheit = (double) Math.round(fahrenheit * 100) / 100;
		kelvin = (double) Math.round(kelvin * 100) / 100;

		System.out.println("Temperature in Fahrenheit: " + fahrenheit);
		System.out.println("Temperature in Kelvin: " + kelvin);
	}
}
