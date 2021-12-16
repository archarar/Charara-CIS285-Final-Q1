import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
}
    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
        	assertEquals("POS ERROR AT INDEX " + i, Sortedarr[i], arr[i]);
        }
    }
    
    public void testNegative(){
        
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
        	assertEquals("NEG ERROR AT INDEX " + i, Sortedarr[i], arr[i]);
        }
    }
    
    public void testMixed(){
        
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = -10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 8;

        SelectionSort.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
        	assertEquals("MIX ERROR AT INDEX " + i, Sortedarr[i], arr[i]);
        }
    }
}