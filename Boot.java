/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{


    private int cost;

  public Boot()
  {
      super();
      cost = 0; 
  }

    @Override
    public String say() {
        return "You now have a boot!";
    }

    // 16
    @Override
    public boolean wasCaught(Hook h)
    {
        return true;
    }
}
