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
        void doBubbleSort(int arr[]){
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
        
    // Prints the customer rating array 
        void printRatingArray(CustomerData arr[]){
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i].getRating() + " ");
            System.out.println();
            System.out.println();
        }
        
    // Prints the customer name array 
        void printNameArray(CustomerData arr[]){
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i].getName() + " ");
            System.out.println();
            System.out.println();
        }
        
    
    public static void main(String[] args) {
    // Customer data records
        BubbleSortCustomerData ob = new BubbleSortCustomerData();
        CustomerData arr[] = {
            new CustomerData("Tama", "2", "Auckland"),
            new CustomerData("Amelia", "5", "Taranaki"),
            new CustomerData("Kaos", "3", "Hamilton"),
            new CustomerData("Karl", "4", "Papatoetoe"),
            new CustomerData("Carlos", "5", "Glenfield"),
            new CustomerData("Alicia", "2", "Whangarai"),
            new CustomerData("Zion", "2", "Wellingotn"),
            new CustomerData("Sara", "3", "Auckland"),
            new CustomerData("Bob", "4", "Papakura"),
            new CustomerData("Wiremu", "5", "Auckland"),
        };
        
        // welcome message
        System.out.println("Welcome! Here we will be ordering the customer data\n");
        
        // display unsorted collection
        System.out.println("The Unsorted customer rating array is: ");
        ob.printRatingArray(arr);
        
        System.out.println("The Unsorted name array is: ");
        ob.printNameArray(arr);
        
        
        // sort by customer rating (ascending)
        ob.doBubbleSort(arr);
        System.out.println("The Basic Bubble Sorted array is");
        ob.printRatingArray(arr);
        
            // then by customer name (decending)
        
        // display sorted data
            // terminate program
            
            
        
    }
    
}
