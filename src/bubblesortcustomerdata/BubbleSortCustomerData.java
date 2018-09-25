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
        //Sort customer name
        public static void doBubbleSortNames(CustomerData arr[]){
            int n = arr.length;
            for (int i = 0; i < n; i++)
                for (int j = 1; j < (n-i); j++)
                    if (arr[j-1].getName().compareTo(arr[j].getName()) < 0)
                    {
                        // swap temp and arr[i]
                        CustomerData temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
        }
        
        // Sort Customer Rating
        public static void doBubbleSortRating(CustomerData arr[]){
            int n = arr.length;
            for (int i = 0; i < n; i++)
                for (int j = 1; j < (n-i); j++)
                    if (arr[j-1].getRating().compareTo(arr[j].getRating()) > 0)
                    {
                        // swap temp and arr[i]
                        CustomerData temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
        }
        
 
    /* Prints the array */
    void printArray(CustomerData arr[])
    {
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
        ob.printArray(arr);
        
        System.out.println("The Unsorted name array is: ");
        ob.printArray(arr);
        
        
        // sort by customer rating (ascending)
        ob.doBubbleSortRating(arr);
        System.out.println("The Rating Sorted array is");
        ob.printArray(arr);
        
            // then by customer name (decending)
            ob.doBubbleSortNames(arr);
            System.out.println("The Name Sorted array is");
            ob.printArray(arr);
        
        // display sorted data
            // terminate program
            
            
        
    }
    
}
