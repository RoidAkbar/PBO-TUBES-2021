public class Overlord implements Attacking, Defending, Intractable, Escaping{
    private String classChar;
    private String weapon;

    public Overlord(String classPlayer, String weapon) {
        this.classChar = classPlayer;
        this.weapon = weapon;
    }

    public String getClassPlayer() {
        return classChar;
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
