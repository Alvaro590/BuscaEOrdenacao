/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Sciencegamer
 */
public class Busca {

    public static int linearSearch(String arr[], String element) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index].equals(element)) {
                return index;
            }

        }
        return -1;
    }

    public static int binarySearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            int aux= mid;
            if (a[mid].length()-x.length() < 0) {
                low = mid + 1;
            } else if (a[mid].length()-x.length() > 0) {
                high = mid - 1;
            } else if (a[mid].length()-x.length() == 0) {
                while(a[aux].length()==x.length()){
                    if(a[aux].equals(x)){
                        return aux;
                    }
                    else{
                      aux++;  
                    }
                    
                }
                aux=mid-1;
                while(a[aux].length()==x.length()){
                    if(a[aux].equals(x)){
                        return aux;
                    }
                    else{
                      aux--;  
                    }
                    
                }
                
            } 
        }

        return -1;
    }

}
