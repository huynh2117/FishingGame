/**
 * Activity 4.9.3
 */
public class Hook extends LakeObject
{
  // 8) Hook has an additional instance variable, strength, and an additional method, getStrength. 
  private int strength;

  public Hook()
  {
      super();
      strength = 15; 
  }

  /*---------- accessor ----------*/
  public int getStrength() 
  {
    return strength; // This return will be updated in the next activity
    //return strength;
  }

  // 12)
  @Override
  public String say() {
    return "You now have a hook!";
  }

}