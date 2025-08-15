import java.util.Arrays;
import java.util.Scanner;
public class Arrayoperations
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n+ "elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements:");
        for(int num :arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        int sum = 0;
        for(int num : arr)
        {
            sum += num;
        }
        System.out.println("Sum = " + sum);
        int max = arr[0],min = arr[0];
        for(int num:arr)
        {
            if(num > max) max = num;
            if(num < min) min = num;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(arr,key);
        if(index >= 0)
        {
            System.out.println(key + " found at index");
        }
        else
        {
            System.out.println(key + " not found in array");
        }
        System.out.print("Enter number to delete: ");
        int del = sc.nextInt();
        int pos = -1;
        for(int i = 0; i < n; i++) {
            if (arr[i] == del) {
                pos = i;
                break;
            }
        }
        if(pos == -1) {
            System.out.println(del + "not found in array");
        }
        else {
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.print("Array after deleting " + del + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
