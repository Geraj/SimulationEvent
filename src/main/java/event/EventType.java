package event;

/**
 * TODO DESCRIPTION
 * 
 * @author Geraj
 */
public enum EventType {
  /** TIME_CHANGE */
  TIME_CHANGE(100, 1, "Time change event"),
  /** BREAKDOWN */
  BREAKDOWN(10, 0.01, "Break down event");

  /** Importance used for ordering events in same time stamp */
  private final int weight;

  /** Probability of event creation per time stamp */
  private double prob;

  /** description of event type */
  private String typeDescription;

  /**
   * Constructs a new instance.
   * 
   * @param weight
   * @param prob
   */
  private EventType(int weight, double prob, String typeDescription) {
    this.weight = weight;
    this.prob = prob;
    this.typeDescription = typeDescription;
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
    return this.prob;
  }

  /**
   * Set prob.
   * 
   * @param prob
   */
  public void setProb(double prob) {
    this.prob = prob;
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
