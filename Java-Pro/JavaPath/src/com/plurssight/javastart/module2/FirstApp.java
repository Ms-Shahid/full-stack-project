package com.plurssight.javastart.module2;

public class FirstApp {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Intellij"); //line comment
        System.out.println("Main App");     /* Multi-line comment */
        System.out.println("Java App");

        /*
            * In the package structure, to run java application, start from out.production.project-name.com
            => from com => terminal and type below cmd
            => java full-package-name.class-name
         */
        /**
         * Java docs comments
         * ..*/
        String s = "Run from cmd";
        System.out.println(s);
    }
}
