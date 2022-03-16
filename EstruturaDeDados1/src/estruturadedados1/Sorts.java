/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados1;

/**
 *
 * @author Sciencegamer
 */
public class Sorts {
    
    public static void insertionSort(String x[]){
        int n = x.length;
        
        for (int j = 1; j < n; j++) {  
            int key = x[j].length();
            String savedKey= x[j];
            int i = j-1;  
            while ( (i > -1) && ( x [i].length() > key ) ) {  
                x [i+1] = x [i];  
                i--;  
            }  
            x[i+1] = savedKey;  
        }  
    }
    
    public static void selectionSort(String x[]) {
        int n = x.length;

        for (int i = 0; i < (n - 1); i++) {

            int min = x[i].length();
            String aux = x[i], aux2="";
            int aux3 = 0;

            for (int j = i + 1; j < n; j++) {
                if (x[j].length() < min) {
                    min = x[j].length();
                    aux2 = x[j];
                    aux3 = j;
                }
            }

            if (aux3!=0) {
                x[i] = aux2;
                x[aux3] = aux;
            }

        }
    }
    
    public static void mergeSort(String[] a) {
        int n = a.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        String[] l = new String[mid];
        String[] r = new String[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l);
        mergeSort(r);

        merge(a, l, r, mid, n - mid);

    }
    
    private static void merge(String[] a, String[] l, String[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].length() <= r[j].length()) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    
    
    
    public static void quickSort(String[] x, int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = x[lowerIndex + (higherIndex - lowerIndex) / 2].length();

        while (i <= j) {
            while (x[i].length() < pivot) {
                i++;
            }

            while (x[j].length() > pivot) {
                j--;
            }

            if (i <= j) {
                exchangeNames(x,i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(x,lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(x,i, higherIndex);
        }
    }
    
     public static String[] quickSort2(String[] x, int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = x[lowerIndex + (higherIndex - lowerIndex) / 2].length();

        while (i <= j) {
            while (x[i].length() < pivot) {
                i++;
            }

            while (x[j].length() > pivot) {
                j--;
            }

            if (i <= j) {
                exchangeNames(x,i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(x,lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(x,i, higherIndex);
        }
        
        return x;
    }

    private static void exchangeNames(String[]x, int i, int j) {
        String temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }
    
    
}
