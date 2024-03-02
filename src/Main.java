//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int [] m = {2};
        int [] k = {1, 3, 1, 4, 3};
        int [] t = mergeAndSort(m, k);
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] m = new int [firstArray.length + secondArray.length];
        int j = 0;
        for (int i = 0; i < firstArray.length; i++) {
            m[j] = firstArray[i];
            j++;
        }
        for (int i = 0; i < secondArray.length; i++) {
            m[j] = secondArray[i];
            j++;
        }
        for (int i = 0; i < m.length - 1; i++) {
            for (int p = 0; j < m.length - i - 1; p++) {
                if (m[p] > m[p + 1]) {
                    int temp = m[p];
                    m[p] = m[p + 1];
                    m[p + 1] = temp;
                }
            }
        }
        return m;
    }
}