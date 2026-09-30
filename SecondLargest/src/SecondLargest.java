
public class SecondLargest {
	
	public static void main(String[] args) {
		
		Integer[]arr = new Integer[] {1,2,3,4,5,6,9};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>=largest) {
				
				secondLargest = largest;
				largest = arr[i];
				
			}else if(arr[i]!=largest&&arr[i]>=secondLargest) {
				
				secondLargest=arr[i];
			}
			
		}
		
		System.out.println("Largest in the array:-"+largest+"\n"+"SecondLargest-:"+secondLargest);
	}

}
