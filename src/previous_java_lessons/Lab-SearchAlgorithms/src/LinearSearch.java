
public class LinearSearch {
	
	public static void main(String[] args) {
		//create some dummy data for our method
		char letter ='a';
		char[] letters= { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		//call your methods here
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.findLetter(letter, letters));
	}
	
	//create your first method here
	
	public static int findLetter(char target, char[] data) {
		if(data==null) {
			return -1;
		}
		int result =-1;
		
		//return result;
	    //loop through the data
		for(int i=0; i<data.length;i++) {
		char temp = data[i];
		
		//test current element against target
		if(temp==target) {
			return i;
		}
	}
		return result;

}
}