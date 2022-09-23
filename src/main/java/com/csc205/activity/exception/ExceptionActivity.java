package com.csc205.activity.exception;

import java.util.Scanner;



public class ExceptionActivity {
    public static <string> void main(String[] args) {

        // Section 1 : try catch
        // try-catch
        try {
            // happy path - all this executes if no exception thrown
            int[] nums = { 1, 2, 3, 4, 5};
            System.out.println(nums[7]);
        } catch (Exception e) {
            // sad path - exception thrown
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //Section 2 : try catch catch
        try {
            String a = null;
            System.out.println(a.charAt(1));
        } catch (NullPointerException e) {
            // we'll catch the NullPointerException here and handle it differently than other exceptions
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Section 3 Try Catch Finally
        try {
            int T = 5/0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            // always do something
            System.out.println("bye");
        }


        //Section 4 - try-finally
        try {
            // do something we don't expect to throw exceptions
        } finally {
            // but if we do, always execute code here
        }

        //Section 5 - multi-try-catch
        try {
            // lets do something here
            int  num1 ;
            String num2;
         num1 = 5/0;
        num2 = null;
        System.out.println(num1);
        System.out.println(num2.charAt(3));
        } catch (ArithmeticException | NullPointerException e) {
            // when either of the exceptions are thrown, do this
            System.out.println(e.getMessage());
            System.out.println("sorry");

            e.printStackTrace();
        }
        //Section 6
        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
        } finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }

    }

}
