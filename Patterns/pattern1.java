//* * * * *
//* * * * *
//* * * * *
//* * * * *

import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {      // STEP 1: Rows = 5
            for (int j = 1; j <= n; j++) {  // STEP 2: Columns = 5 (fixed)
                System.out.print("* ");      // STEP 3: Print star
            }
            System.out.println();            // New line after each row
        }
    }
}