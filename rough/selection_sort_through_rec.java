package rough;

import java.util.Scanner;

public class selection_sort_through_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner s = new Scanner(System.in);
				int[] arr = takeinput();
			
				// 8 80 40 60 30 70 20 50 10
				selectionSort(arr,0);
			display(arr);	
			}
			public static void display(int[] arr) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i] + " ");
				}
			}

			public static int[] takeinput() {

				Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = s.nextInt();
				}

				return arr;

			}
			
		public static void selectionSort(int[] array, int startIndex)
		{
		    if ( startIndex >= array.length - 1 )
		        return;
		    int minIndex = startIndex;
		    for ( int index = startIndex + 1; index < array.length; index++ )
		    {
		        if (array[index] < array[minIndex] )
		            minIndex = index;
		    }
		    int temp = array[startIndex];
		    array[startIndex] = array[minIndex];
		    array[minIndex] = temp;
		    selectionSort(array, startIndex + 1);
		}
		

		

			
		public static void bubbleSort(int arr[], int n)
		{
		    int temp;
		    if (n == 1)
		        return;
		 
		    for (int i=0; i<n-1; i++)
		        if (arr[i] > arr[i+1])
		            { temp=arr[i];
		            arr[i]=arr[i+1];
		            arr[i+1]=temp;
		            }
		    bubbleSort(arr, n-1);
		}
			}
		
