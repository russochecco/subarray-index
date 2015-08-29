package org.frusso.subarrayindex;

import java.security.InvalidParameterException;

/**
 * Class used to find the start index of a sub array in a 'parent' array of integer.
 * */
public class SubarrayIndexSearcher {

    public static int findIndex(int[] parent, int[] child) {
        if (parent == null || child == null)
            throw new NullPointerException("Invalid arrays");

        if (parent.length == 0 || child.length == 0)
            throw new InvalidParameterException("Invalid arrays");

        if (child.length > parent.length)
            throw new InvalidParameterException("Second array is greater than first");

        int i = 0;

        int indexFound = -1;

        outerloop:
        for (i = 0; i < parent.length; i++) {
            int k = i; // index used to score the elements in the parent
            for (int j = 0; j < child.length; j++) { // cycle used to iterate over the child
                if (parent[k] == child[j]) { // if the current elements of both arrays match...
                    k++; // ... increment the index used to iterate over the parent
                    if (j == child.length - 1) { // if the tail of the child is reached, it means
                        // we've found it
                        indexFound = i;
                        break outerloop; // used to break the outer loop
                    }
                    if (k == parent.length) { // if the index to iterate over the parent becomes equal
                        // to its size, it means the second array is not present
                        break outerloop;
                    }
                } else {
                    break;
                }
            }
        }

        return indexFound;
    }
}
