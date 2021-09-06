package DSA;

public class Array {

	public static void main(String[] args) {
		
		int size = 6;
		int position = 2;
		int element = 100;
		int[] pos = new int[]{ 1,20,5,78,30 }; 

		
		for(int i = size; i > position; i--) {
			pos[i] = pos[i-1];
			
		pos[position] = element;
		
				
		}

	}

}
