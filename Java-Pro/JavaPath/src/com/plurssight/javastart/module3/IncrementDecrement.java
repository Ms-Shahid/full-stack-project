package com.plurssight.javastart.module3;

public class IncrementDecrement {

    public static void main(String[] args) {

        /* Operator Precedence => PostFix(x++, x--) -> Prefix(++x, --x) -> multiplicative(* / %) -> Additive(+ -)
        * In-case of equal precedence the flow is left-to-right */
        //Prefix operator
        int sum  = 5;
        System.out.println(++sum); //6 => sum = sum + 1
        System.out.println(sum);

        int count = 4;
        System.out.print(--count); //3 => count = count - 1
        System.out.println("\t"+ count);

        //Postfix operator
        int post = 10;
        System.out.println(post++); //post = 10
        System.out.println(post);  //post = 11

        int n = 4;
        System.out.println(n++); //n = 10, value is just assigned, and then incremented
        System.out.println(n); //now the value is increment

        /* Note => In case of prefix-> if operator is used before the variable, then we get result of operation
        * whereas, in case of postfix => if operator is used after the variable, then we get result of operation
        * when we are just printing that variable */

        /* Operator Precedence => PostFix(x++, x--) -> Prefix(++x, --x) -> multiplicative(* / %) -> Additive(+ -) */
    }
}
