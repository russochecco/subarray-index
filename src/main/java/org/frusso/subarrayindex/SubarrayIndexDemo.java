package org.frusso.subarrayindex;

public class SubarrayIndexDemo {

    public static void main(String args[]) {
        int[] parent = new int[]{3, 6, 5, 6, 2, 1, 6, 4};
        int[] child = new int[]{1, 6, 4};
        int index = SubarrayIndexSearcher.findIndex(parent, child);

        System.out.print("Parent array: ");
        for (int v : parent) {
            System.out.print(v + " ");
        }

        System.out.print("\nChild array: ");
        for (int v : child) {
            System.out.print(v + " ");
        }

        System.out.println("\nStart index: " + index);
    }
}
