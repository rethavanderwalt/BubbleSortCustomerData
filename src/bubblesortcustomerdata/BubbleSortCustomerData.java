/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

/**
 *
 * @author 91030418
 */
public class BubbleSortCustomerData {

    // use bubble sort
        void doBubbleSort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap temp and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }
        
    // Prints the array 
        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
            System.out.println();
        }
        
    
    public static void main(String[] args) {
        // welcome message
        
        // display unsorted collection
        
       
        
        // sort by customer rating (ascending)
            // then by customer name (decending)
        
        // display sorted data
            // terminate program
            
            
        BubbleSortCustomerData ob = new BubbleSortCustomerData();
        CustomerData arr[] = {
            new CustomerData("Tama", 2, "Auckland"),
            new CustomerData("Amelia", 5, "Taranaki"),
            new CustomerData("Kaos", 3, "Hamilton"),
            new CustomerData("Karl", 4, "Papatoetoe"),
            new CustomerData("Carlos", 5, "Glenfield"),
            new CustomerData("Alicia", 2, "Whangarai"),
            new CustomerData("Zion", 2, "Wellingotn"),
            new CustomerData("Sara", 3, "Auckland"),
            new CustomerData("Bob", 4, "Papakura"),
            new CustomerData("Wiremu", 5, "Auckland"),
        };
    }
    
}
