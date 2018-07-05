class Encryption1{
	public static void main(String args[]){
		String pt=args[0],ct="",ot="";
		int key=Integer.parseInt(args[1]);
		for(int i=0;i<pt.length();i++){
			ct=ct+(char)(pt.charAt(i)+key);
					
		}
			System.out.println("Encrypted code");
			System.out.println(ct);
		for(int i=0;i<ct.length();i++){
			ot=ot+(char)(ct.charAt(i)-key);
		}
			System.out.println("Decrypted code");
			System.out.println(ot);

	}
}