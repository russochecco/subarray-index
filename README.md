This repository contains a simple java console application based on Maven to implement an algorithm
to find the index of a 'child array' in a more large array 'parent array'.
The approach used is to iterate over the parent until its current element matches with the first
element of the child. When this happens the algorithm starts to iterate over the child to verify that all
its elements are sequentially present after the current element of the parent that is inspected. If the child is
traversed until the end without move the cursor on the parent and each inspected element matches the
parent contains the child, so it's possible to get its start position. If the cursor is moved on the parent until
to meet its last element, it means that child is not contained.

The package 'org.frusso.subarrayindex' under the folder 'test' contains the Junit test class 'SubarrayIndexSearcherTest'
which defines the test cases covered during the development.


Thank you for the interest in this repository,
Francesco Russo
