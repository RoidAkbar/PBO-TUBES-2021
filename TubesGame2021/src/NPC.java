import java.util.ArrayList;

public abstract class NPC {
    public ArrayList<String> listOfItem = new ArrayList<String>();
    public abstract String GetItem();
    public abstract String BuyItem();
    public abstract String SellItem();
    public abstract String Display();

}
