/*
 * @(#) ConsoleRunner.java Dec 1, 2003 Copyright (c) 2002-2005 Delft University
 * of Technology Jaffalaan 5, 2628 BX Delft, the Netherlands. All rights
 * reserved. This software is proprietary information of Delft University of
 * Technology The code is published under the Lesser General Public License
 */
package calculations.simulation;

import java.io.File;
import java.net.URL;
import java.util.logging.Level;

//import nl.tudelft.simulation.dsol.experiment.ExperimentalFrame;
//import nl.tudelft.simulation.language.io.URLResource;
import nl.tudelft.simulation.xml.dsol.ExperimentParser;

/**
 * A ConsoleRunner <br>
 * (c) copyright 2002-2005 <a href="http://www.simulation.tudelft.nl">Delft University of Technology
 * </a>, the Netherlands. <br>
 * See for project information <a href="http://www.simulation.tudelft.nl">www.simulation.tudelft.nl
 * </a> <br>
 * License of use: <a href="http://www.gnu.org/copyleft/lesser.html">Lesser General Public License
 * (LGPL) </a>, no warranty.
 * 
 * @version 1.0 Dec 1, 2003 <br>
 * @author <a href="http://www.peter-jacobs.com">Peter Jacobs </a>
 */
public final class ConsoleRunner {

  /**
   * constructs a new ConsoleRunner
   */
  private ConsoleRunner() {
    // unreachable code
    super();
  }

  /**
   * executes our model
   * 
   * @param args the experiment xml-file url
   */
  public static void main(final String[] args) {
    String url;
    if (args.length != 1) {
      System.out.println("Usage : java nl.tudelft.simulation.dsol."
          + "tutorial.section25.ConsoleRunner [experiment-url]");
      //System.exit(0);
      url="AgroSim/src/calculations/simulation/section25.xml";
    }else{
      url=args[0];
    }
    try {
      // We are ready to start
      //Logger.setLogLevel(Level.WARNING);
      URL url1 = (new java.io.File(url)).toURI().toURL();
      File f=new File((new java.io.File(url)).toURI());
      if (f.exists()){
        System.out.println("dfgdfgd");
      }
      // First we resolve the experiment and parse it
//      URL experimentalframeURL = URLResource.getResource(url);
//      ExperimentalFrame experimentalFrame = ExperimentParser.parseExperimentalFrame(url1);

//      experimentalFrame.start();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}