/*
 * Activity 4.9.3
 */
public class Bait extends LakeObject
{

  private int cost;

  public Bait()
  {
      super();
      cost = 10; 
  }
    @Override
    public String say() {
        return "You now have a bait!";
  }
}