/*
 * Copyright (C) TBA BV
 * All rights reserved.
 * www.tba.nl
 */
package event;

/**
 * TODO DESCRIPTION
 * 
 * @author Geraj
 */
public interface EventInterface {
  
  /**
   * TODO DESCRIPTION
   * @return
   */
  long getTimeStamp();
  /**
   * TODO DESCRIPTION
   * @return
   */
  EventType getType();

}
