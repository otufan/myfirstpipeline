import java.time.LocalTime;

public class JavaFirst {
	
	public static void main(String[] args) {
		
	LocalTime zeit=LocalTime.now();
	LocalTime morgen=LocalTime.parse("09:00:00");
	LocalTime feierAbend=LocalTime.parse("15:00:00");
	
	if (zeit.isBefore(morgen)) {
		System.out.println("Good morning");
	} else if (zeit.isAfter(feierAbend)) {
		System.out.println("Good evening");
	} else {
		System.out.println("I am here");
	}
	
	}
}
