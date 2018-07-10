public class Encrypt{
	public static void main(String args[]){
		String pt="welcome to java",ct="",ot="";
		int[] key={1,2,3,4} ;
		for(int i=0; i<pt.length(); i++)
				ct=ct+(char)(pt.charAt(i)+key[i%4]);
		System.out.println(ct);

	}
}