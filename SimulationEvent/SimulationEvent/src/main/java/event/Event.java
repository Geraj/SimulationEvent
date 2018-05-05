/*
 * Copyright (C) TBA BV
 * All rights reserved.
 * www.tba.nl
 */
package event;

import java.io.Serializable;

/**
 * Event class
 * 
 * @author Geraj
 */
public class Event implements Serializable, EventInterface, Comparable<Event> {
  /** serialVersionUID */
  private static final long serialVersionUID = 1L;
  /**BEFORE*/
  static final int BEFORE = -1;
  /** EQUAL */
  static final int EQUAL = 0;
  /** AFTER */
  static final int AFTER = 1;
  
  /** timeStamp */
  private long timeStamp;
  /** type */
  private EventType type;

  /**
   * Constructs a new instance.
   * @param timeStamp
   * @param type
   */
  public Event(long timeStamp, EventType type) {
    this.timeStamp = timeStamp;
    this.type = type;
  }

  /**
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  public int compareTo(Event that) {
    if (that != null) {
      if (this.getTimeStamp() > that.getTimeStamp()) {
        return AFTER;
      }
      if (this.getTimeStamp() < that.getTimeStamp()) {
        return BEFORE;
      }
      if (this.getType().getWeight() == that.getType().getWeight()) {
        return EQUAL;
      } else if (this.getType().getWeight() < that.getType().getWeight()) {
        return AFTER;
      } else if (this.getType().getWeight() > that.getType().getWeight()) {
        return BEFORE;
      }

    } else {
      throw new NullPointerException("Null compare to");
    }
    return 0;
  }

  /**
   * @see event.EventInterface#getTimeStamp()
   */
  public long getTimeStamp() {
    return this.timeStamp;
  }

  /**
   * @see event.EventInterface#getType()
   */
  public EventType getType() {
    return this.type;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(getTimeStamp());
    builder.append(" ");
    builder.append(getType().getTypeDescription());
    builder.append(" ");
    builder.append(getType().getProb());
    return builder.toString();
  }
    

}
