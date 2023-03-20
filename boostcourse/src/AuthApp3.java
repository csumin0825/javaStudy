
public class AuthApp3 {

	public static void main(String[] args) {
		String [][] users= {
				{"egoing","1111"},
				{"sumin","2222"},
				{"minkyung", "3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];
		
		Boolean isLogined = false;
		for(int i = 0;i<users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputId)&&current[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		System.out.println("HI");
		if(isLogined) {
			System.out.println("Master");
		}else {
			System.out.println("Who are you?");
		}
	}

}
