/*
 * @(#) Order.java Dec 4, 2003 Copyright (c) 2002-2005-2004 Delft University of
 * Technology Jaffalaan 5, 2628 BX Delft, the Netherlands. All rights reserved.
 * This software is proprietary information of Delft University of Technology
 * The code is published under the Lesser General Public License
 */
package calculations.simulation;

/**
 * The Order class as presented in section 2.5 in the DSOL tutorial.
 * <p>
 * (c) copyright 2002-2005-2004 <a href="http://www.simulation.tudelft.nl">
 * Delft University of Technology </a>, the Netherlands. <br>
 * See for project information <a href="http://www.simulation.tudelft.nl">
 * www.simulation.tudelft.nl </a> <br>
 * License of use: <a href="http://www.gnu.org/copyleft/lesser.html">Lesser
 * General Public License (LGPL) </a>, no warranty.
 * 
 * @version 1.1 Sep 6, 2004 <br>
 * @author <a href="http://www.peter-jacobs.com">Peter Jacobs </a>
 */
public class Order
{
    /** the product of an order */
    private String product = null;

    /** the amount of product to order */
    private double amount = Double.NaN;

    /**
     * constructs a new Order
     * 
     * @param product the product
     * @param amount the amount to buy
     */
    public Order(final String product, final double amount)
    {
        super();
        this.product = product;
        this.amount = amount;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Order[" + this.product + ";" + this.amount + "]";
    }
}