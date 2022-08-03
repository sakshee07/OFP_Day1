package Polymorphism;

class Main{
	public static void main(String[] args) {
		MethodOvrloading methodOvrloading = new MethodOvrloading();
	int add = methodOvrloading.add(12,12);
	int add3 = methodOvrloading.add3(12, 34, 78);
	double add4 = methodOvrloading.add4(11.23, 11.11, 10.00);
	System.out.println(add  +" "+ add3 + " "+ add4);
	}
}