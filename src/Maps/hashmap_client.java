package Maps;

public class hashmap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashmap<String, Integer>map=new hashmap<>();
		map.put("Riya", 90);
		map.put("Nitish", 77);
		map.put("Akash", 67);
		map.put("Zaid", 76);
		map.put("Omika", 88);
		map.put("Puneet", 77);
		System.out.println(map);
		map.put("Omika", 18);
		System.out.println(map);
		System.out.println(map.get("Raj"));
		System.out.println(map.get("Riya"));
		System.out.println(map.containskey("Raj"));
		System.out.println(map.containskey("Riya"));
		System.out.println(map.remove("Riya"));
		System.out.println(map);

	}

}
