public class CastingScript {

	public static void main(String[] args) {
	
		CastingScript cs = new CastingScript();
		cs.start();
	
	}
	
	private void start() {
	
		SmartPhone myPhone = new SmartPhone("Nokia");
		//MobilePhone myPhone = new SmartPhone("Nokia");
	
		myPhone.call("00 44 776 364 3566");			// inherited from Phone
		myPhone.browseWeb("www.google.com");		// method of Smartphone only
		System.out.println(myPhone.findPosition());	// method of Smartphone only
		
		
		System.out.println("\nCalling testPhone with Smartphone.\n");
		
		testPhone(myPhone);
		
		MobilePhone mp = new MobilePhone("Nokia");
		
		System.out.println("\nCalling testPhone with Mobilephone.\n");
		System.out.println("\nCauses ClassCastException.\n");
		
		//testPhone(mp);
	
	}

	private void testPhone(Phone p) {
	
		SmartPhone sp = (SmartPhone) p;
	
		sp.call("00 44 776 364 3566");		// inherited from Phone
		sp.browseWeb("www.google.com");		// method of Smartphone only
		System.out.println(sp.findPosition());	// method of Smartphone only
		
	}

}