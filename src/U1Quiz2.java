
public class U1Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {1,3,2,4,6,7,5,8,10};
		
		//return the average of all the values in the array
		
		double sum = 0;
		double lowest = 100;
		
		for(int i=0; i< array1.length; i++) {
			sum = sum + array1[i];
			
		}
		double average = sum / array1; 
		System.out.println("average is " + average);
		
		printArray(average);
		
		
//lowest and highest 
		lowest = 100
		highest = 0 
		for (int i = 0; i<array1.length; i++) {
			sum = sum + array1 [i];
			if(lowest > array1[i]) {
				lowest = array1[i];
			if(highest > array1[i]) {
				highest = array1[i];
	System.out.println("lowest is " + lowest);
	System.out.println("highest is " + highest);
	
				
				
	public static void printArray(double array1) {
			if (array1 >= 100) {
				System.out.println("100");
			if (array1 >= 50) {
					System.out.println("lower than 50");
			
			}
	}

}
