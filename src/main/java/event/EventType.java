package event;

import java.util.Arrays;
import java.util.List;

/**
 * Type of an event
 * 
 * @author Geraj
 */
public enum EventType {
  /** TIME_CHANGE */
  TIME_CHANGE(100, 1, "Time change event"),
  /** BREAKDOWN */
  BREAKDOWN(10, 0.01, "Break down event"),
  /**MIRACLE*/
  MIRACLE(5, 0.001, "Miracle event"),
  /**RAIN*/
  RAIN(50, 0.1, "Rain event");

  /** Importance used for ordering events in same time stamp */
  private final int weight;

  /** Probability of event creation per time stamp */
  private double probability;

  /** description of event type */
  private String typeDescription;

	/**
	 * Constructs a new instance.
	 * 
	 * @param weight
	 * @param prob
	 * @param typeDescription
	 */
	private EventType(int weight, double prob, String typeDescription) {
    this.weight = weight;
    this.probability = prob;
    this.typeDescription = typeDescription;
  }
	
	

   /* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return typeDescription;
	}



public static List<EventType> asList(){
	   return Arrays.asList(EventType.values());
   }
  /**
   * Get weight.
   * 
   * @return weight
   */
  public int getWeight() {
    return this.weight;
  }

  /**
   * Get prob.
   * 
   * @return prob
   */
  public double getProb() {
    return this.probability;
  }

  /**
   * Set prob.
   * 
   * @param prob
   */
  public void setProb(double prob) {
    this.probability = prob;
  }

  /**
   * Get typeDescription.
   * 
   * @return typeDescription
   */
  public String getTypeDescription() {
    return this.typeDescription;
  }

}
