package src.recursion;

import java.util.Set;

public class TowerOfHanoi {

    public void moveRings(int numRings, char fromRod, char toRod, char auxRod) {
        if (numRings == 1) {
            System.out.println("Moving disk 1 from " + fromRod + "to " + toRod);
            return;
        }

        moveRings(numRings - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + numRings + "from rod " + fromRod + " to rod " + toRod);
        moveRings(numRings - 1, auxRod, toRod, fromRod);
    }



    public void moveRingsUsingSets(int numRings, Set<Integer> A, Set<Integer> B, Set<Integer> C) {
        System.out.println("TowerOfHanoi");
    }

}



/**
 * Smallest on top and no big ring can be placed over a small ring. A [1, 2, 3] B [] C []
 * 
 * Move 1 to B A [2, 3] B [1] C []
 * 
 * Move 2 to C A [3] B [1] C [2]
 * 
 * Move 1 to C A [3] B [] C [1,2]
 * 
 * Move 3 to B A [] B [3] C [1,2]
 * 
 * Move 1 to A A [1] B [3] C [2]
 */
