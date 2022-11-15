package us.lakshmi1.main;

public class DupsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={8, 20, 18, 30, 12, 25, 20, 10, 15, 8};
//		int[] sa=new int[arr.length];
	
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if (arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int ele:arr) System.out.println(ele);
		
		for(int i=0;i<arr.length-1;i++) {
				if (arr[i]==arr[i+1]) {
					System.out.println("Duplicates are at index:: " +(i)+ " and "+(i+1));
				}
			}
		
	}
}
