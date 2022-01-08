public class SwitchExamples {
	public static void main(String[] args) {
		var dayOfWeek = 5;
		switch(dayOfWeek) {
			case 0:
				System.out.println("Sunday");	
			default:
				System.out.println("Weekday");	
			case 6:
				System.out.println("Saturday");
				break;
		}	

		System.out.println("next switch statement\n");

		dayOfWeek = 6;
		switch(dayOfWeek) {
			case 0:
				System.out.println("Sunday");	
			default:
				System.out.println("Weekday");	
			case 6:
				System.out.println("Saturday");
		}	

		System.out.println("next switch statement\n");

		dayOfWeek = 1;
		switch(dayOfWeek) {
			case 6:
				System.out.println("Saturday");
			case 1:
				System.out.println("Monday");	
			default:
				System.out.println("Weekday");	
			case 0:
				System.out.println("Sunday");	
		}	
	}
}