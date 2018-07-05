class Encryption{
	public static void main(String args[]){
		String pt="This is a string",ct="",ot="";
		int key[]={1,2,3,4};
		for(int i=0;i<pt.length();i++){
			int p=i%4;
			ct=ct+(char)(pt.charAt(i)+key[p]);
					
		}
			System.out.println("Encrypted code");
			System.out.println(ct);
		for(int i=0;i<ct.length();i++){
			int q=i%4;
			ot=ot+(char)(ct.charAt(i)-key[q]);
		}
			System.out.println("Decrypted code");
			System.out.println(ot);

	}
}