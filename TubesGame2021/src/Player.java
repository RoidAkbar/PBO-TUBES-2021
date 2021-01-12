public class Player implements Attacking, Defending, Intractable, Escaping{
    private String classPlayer;
    private String weapon;

    public Player(String classPlayer, String weapon) {
        this.classPlayer = classPlayer;
        this.weapon = weapon;
    }

    public String getClassPlayer() {
        return classPlayer;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void escape() {

    }

    @Override
    public void speak() {

    }
}
