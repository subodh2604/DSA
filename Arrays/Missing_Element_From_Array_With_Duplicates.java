package Arrays;

import java.util.*;

public class Missing_Element_From_Array_With_Duplicates {

	public static void main(String[] args) {
		int n;
		int[] arr=new int[]{1,3,5,3,3};
		n=arr.length;
		
//		findMissingNegativeMarkingMethod(arr,n);
		findMissingUpdatedPositioningMethod(arr,n);

	}

	private static void findMissingUpdatedPositioningMethod(int[] arr, int n) {

		int i=0;
		
		while(i<n)
		{
			
			int index=arr[i]-1;
//			System.out.println(index);
			if(arr[i]!=arr[index])
			{
				swap(arr,i,index);
			}
			else {
				i++;
			}
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]!=j+1)
			{
				System.out.println("missing element: "+(j+1));
			}
		}
		
	}

	private static void swap(int[] arr, int i, int index) {
		int temp=arr[i];
		arr[i]=arr[index];
		arr[index]=temp;	
	}

	private static void findMissingNegativeMarkingMethod(int[] arr, int n) {
		
		for(int i=0;i<n;i++)
		{
			int index=Math.abs(arr[i]);
			if(arr[index-1]>0)
			{
				arr[index-1]=arr[index-1]*-1;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				System.out.println("missing element: "+(i+1));
			}
		}
		
		
	}

}
