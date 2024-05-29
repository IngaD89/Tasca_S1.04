package org.example.n1exercici3;

public class Main {
    public static void main(String[] args) {

        try {

        error();
        } catch (RuntimeException e){
            System.out.println("Array out of index");
        }

    }

    public static void error() throws ArrayIndexOutOfBoundsException{
        int[] nums = {1,2,3};
        System.out.println(nums[3]);
    }
}
