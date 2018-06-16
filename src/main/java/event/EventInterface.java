package event;

/**
 * TODO DESCRIPTION
 * 
 * @author Geraj
 */
public interface EventInterface {
  
  /**
   * Return the time stamp
   * @return
   */
  long getTimeStamp();
  /**
   * Returm the event type
   * @return
   */
  EventType getType();

}
