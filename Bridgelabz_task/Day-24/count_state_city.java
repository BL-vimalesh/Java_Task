package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class contact{
	String name;
	String city;
	String state;
	public contact(String name, String city, String state) {
		this.name = name;
		this.city = city;
		this.state = state;
	}
}
public class count_state_city {

	public static void main(String[] args) {
		List<contact> person = Arrays.asList(
				new contact("vimalesh","tiruppur","tn"),
				new contact("rajesh","ernakulam","kl"),
				new contact("gopal","whitefield","ka"),
				new contact("kl rahul","whitefield","ka"));
		
		Map<String, Long> citycount = person.stream().collect(Collectors.groupingBy(p -> p.city,
				       Collectors.counting()));
		
		Map<String, Long> statecount = person.stream().collect(Collectors.groupingBy(p -> p.state,
				       Collectors.counting()));
		


		citycount.forEach((city, Long) ->
        System.out.println(city + " -> " + Long));
		
		statecount.forEach((state, Long) ->
        System.out.println(state + " -> " + Long));
	}

}
