package org.level500.Operators;

/*
 * Precendence matters:
 * -x--, ++x
 * /, *, %
 * +,-
 *
 * Assignment:
 * watch out for assigning larger types to variables of smaller type
 * cast or use compound assignment
 *
 * Logical and short circuit operations:
 * &&, ||
 * right side of the statement may not execute in case of ||
 *
 * Comparing:
 * primitives
 * object references trickier - same memory location
 * use equals() for strings
 * with == only equal literals will result in true.
 * For example:
 * String x = "hi"
 * String y = "hi"
 * System.out.println(x == y) //true
 * String z = "HI".toLowerCase();
 * System.out.println(x == z) //true
 * System.out.println(x.equals(z)) //false
 *
 *
 * */
public class Operators {
    public static void main(String[] args) {
        int x = 10;
        double y = 2;
        double z = x++ + --y;
        System.out.println(z);

        String x1 = "hi";
        String y1 = "hi";
        System.out.println(x1 == y1); //true
        String zz = "HI".toLowerCase();
        System.out.println(x1 == zz); //false
        System.out.println(x1.equals(zz)); //true
    }
}
