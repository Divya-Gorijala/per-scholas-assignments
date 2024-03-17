/*Write a program where you create three variables that represent products at a cafe.
The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
Assign prices to each product. Create two more variables called subtotal and totalSale
and complete an “order” for three items of the first product, four items of the second
product, and two items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.
 */

package com.perscholas.java_basics;

import java.text.DecimalFormat;

public class Order {

    public static void main(String[] args) {
        //define the double variables and assigning values
        double coffee = 7.00;
        double cappuccino = 10.00 ;
        double espresso = 4.00;
        double subTotal=3*coffee+4*cappuccino+2*espresso;
        //declaring the constant
        final double SALES_TAX = 0.08*subTotal;
        double totalSale=subTotal+SALES_TAX;
        //format the values upto two digits
        DecimalFormat df = new DecimalFormat("#.00");
        String subtotalFormatted = df.format(subTotal);
        String totalSaleFormatted = df.format(totalSale);
        //Print out the values subtotal and total
        System.out.println(subtotalFormatted);
        System.out.println(totalSaleFormatted);
    }

}
