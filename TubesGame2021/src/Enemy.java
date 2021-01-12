public class Enemy implements Attacking, Defending, Intractable, Escaping {
    private String classChar;
    private String weapon;

    public Enemy(String classChar, String weapon) {
        this.classChar = classChar;
        this.weapon = weapon;
    }

    public String getClassChar() {
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
