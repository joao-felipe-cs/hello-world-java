package br.com.concretesolutions.api.models;

// TODO: Auto-generated Javadoc
/**
 * The Class HelloWorldResponse.
 *
 * @author jfelipesp
 */
public class HelloWorldResponse {

  /** The Constant GREETING_PHRASE. */
  private final static String GREETING_PHRASE = "Hi there, %s, how are you today?";

  /** The greeting. */
  private final String greeting;

  /**
   * Instantiates a new hello world response.
   *
   * @param name the name
   */
  public HelloWorldResponse(String name) {
    this.greeting = String.format(GREETING_PHRASE, name);
  }

  /**
   * Gets the greeting.
   *
   * @return the greeting
   */
  public String getGreeting() {
    return greeting;
  }
}
