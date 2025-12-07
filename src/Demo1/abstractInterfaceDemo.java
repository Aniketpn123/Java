package Demo1;

public class abstractInterfaceDemo {
	
	
//	static abstract class Parent{
//		static void hello() {
//			System.out.println("hello");
//		}
//		public void normal() {
//			System.out.println("normal");
//		}
//		final int value;
//		int age;
//		public Parent(int age){
//			this.age=age;
//			value=344;
//		}
//		public abstract void career(String name);
//	}
//
//	static class Son extends Parent{
//		Son(int age){
//			this.age=age;
//		}
//		@Override
//		public void career(String name) {
//			System.out.println(name);
//		}
//		
//	}
//	static class Daughter extends Parent{
//		 Daughter(int age) {
//	            this.age = age;
//	        }
//		public void career(String name) {
//			System.out.println(name);
//		}
//	}
//	
//	
//	public static void main(String args[]) {
//		Son son = new Son(30);
//		son.career("codder"); 
//		Parent daughter = new Daughter(34);
//		daughter.career("alien");
//		Parent.hello();
//		son.normal();
//	}

	
//	 public static interface Engine{
//		void start();
//		void stop();
//		void acc();
//	}
//	 public static interface Media {
//			void start();
//			void stop();
//		}
//		
//	 public static interface Brake{
//			void brake();
//			void start();
//		}
//	 
//	 public static class Car implements Engine , Brake,Media{
//		 public void brake() {
//			 System.out.println("brake");	
//		 }
//		 public void start() {
//			 System.out.println("start");	
//		 }
//		 public void stop() {
//			 System.out.println("stop");	
//		 }
//		 public void acc() {
//			 System.out.println("acc");	
//		 }
//	 }
//	 
//	 public static class CarPlayer implements Media{
//		 public void start() {
//			 System.out.println("play");	
//		 }
//		 public void stop() {
//			 System.out.println("stop to play");	
//		 }
//		 
//	 }
//	 
//	 public static class PowerEngine implements Engine{
//		 public void start() {
//			 System.out.println("engine strart");	
//		 }
//		 public void stop() {
//			 System.out.println("stop engine");	
//		 }
//		 public void acc() {
//			 System.out.println("acc engine");	
//		 }
//		 
//	 }
//	 
//	 public static class ElectricEngine implements Engine{
//		 public void start() {
//			 System.out.println("ELECTRIC engine strart");	
//		 }
//		 public void stop() {
//			 System.out.println("ELECTRIC stop engine");	
//		 }
//		 public void acc() {
//			 System.out.println(" ELECTRIC acc engine");	
//		 }
//		 
//	 }
//	 
//	 public static class NiceCar{
//		private Engine engine;
//		private Media player = new CarPlayer();
//		
//		public NiceCar() {
//			engine = new PowerEngine();
//		}
//		
//		public NiceCar(Engine engine) {
//			this.engine=engine;
//		}
//		
//		public void start() {
//			engine.start();
//		}
//		public void stop() {
//			engine.stop();
//		}
//		
//		public void startMusic() {
//			player.start();
//		}
//		public void upgradeEngine() {
//			this.engine =new ElectricEngine();
//		}
//	 }
		
		
	
	
	
	
	
	
//	public static void main(String args[]) {
////		Car car= new Car();
////		car.acc();
////		car.start();
////		car.brake();
//		
////		CarPlayer carplay = new CarPlayer();
////		carplay.stop();
//		
//		NiceCar car = new NiceCar();
//		car.start();
//		car.startMusic();
//		car.upgradeEngine();
//		car.start();
//	}

	
		//	interface extends...............
	
//	public static interface A{
//		void fun();
//	}
//	public static interface B extends A{
//		void greet();
//	}
//	public static class Main implements B{
//		public void fun() {
//			
//		}
//		public void greet() {
//			
//		}
//	}
	
	

}


