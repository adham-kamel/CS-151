import java.util.*;
import java.time.*;

public class DaysSinceBorn {

	public static void main(String[] args){
		ZoneId zoneId = ZoneId.of("UTC-8");
		LocalDateTime birthday = LocalDateTime.of(1998, 8, 12, 10, 0);
		ZonedDateTime birthdayZone = ZonedDateTime.of(birthday, zoneId);
		
		ZonedDateTime currentZone = ZonedDateTime.now();
		
		System.out.println(Duration.between(currentZone, birthdayZone));
		
	}
}
