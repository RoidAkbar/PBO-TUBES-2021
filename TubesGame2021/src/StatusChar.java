public class StatusChar {
    private String status;
    private int health;
    private int mana;
    private int maxMana;
    private int maxHp;

    public StatusChar(String status, int health) {
        this.status = status;
        this.health = health;
    }

    public String getStatus() {
        return status;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getMaxHp() {
        return maxHp;
    }
}
