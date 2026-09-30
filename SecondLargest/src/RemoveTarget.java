import java.util.Scanner;

public class RemoveTarget {
	
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {1,2,3,4,5,6};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to remove:");
		int n = sc.nextInt();
		
	    boolean found = false;
		
		int size = arr.length;
		
		for(int i=0;i<size;i++) {
			
			if(n==arr[i]) {
				found = true;
				for(int j=i;j<size-1;j++) {
					
					arr[j] = arr[j+1];
				}
				
				size --;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Element not found");
		}else {
			for(int k=0;k<size;k++) {
				System.out.println(arr[k]);
			}
		}
		
	}
}
