/*
 * @(#) Customer.java Dec 1, 2003 Copyright (c) 2002-2005 Delft University of
 * Technology Jaffalaan 5, 2628 BX Delft, the Netherlands. All rights reserved.
 * This software is proprietary information of Delft University of Technology
 * The code is published under the Lesser General Public License
 */
package calculations.simulation;

//import nl.tudelft.simulation.dsol.formalisms.devs.SimEvent;
//import nl.tudelft.simulation.dsol.formalisms.devs.SimEventInterface;
//import nl.tudelft.simulation.dsol.simulators.DEVSSimulatorInterface;

/**
 * The Customer class as presented in section 2.5 in the DSOL tutorial.
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
public class Customer
{
//    /** the simulator we can schedule on */
//    private DEVSSimulatorInterface simulator = null;
//
//    /**
//     * constructs a new Customer
//     * 
//     * @param simulator The simulator to use.
//     */
//    public Customer(final DEVSSimulatorInterface simulator)
//    {
//        super();
//        this.simulator = simulator;
//        this.generateOrder();
//    }
//
//    /**
//     * generates a new Order
//     */
//    private void generateOrder()
//    {
//        try
//        {
//            Order order = new Order("Television", 2.0);
//            System.out.println("ordered " + order + " @ time="
//                    + this.simulator.getSimulatorTime());
//
//            // Now we schedule the next action at time = time + 2.0
//            SimEventInterface simEvent = new SimEvent(this.simulator
//                    .getSimulatorTime() + 2.0, this, this, "generateOrder",
//                    null);
//            this.simulator.scheduleEvent(simEvent);
//        } catch (Exception exception)
//        {
//            //Logger.warning(this, "generateOrder", exception);
//        }
//    }
}