public abstract class GameCharacter {
    private String type;
    private String name;
    private int health;
    private int damage;
    private  int money;
    private String status;

    public GameCharacter(String type, String name) {
        this.type = type;
        this.name = name;

    }


    public void HealthCalc(int health){
        this.health = health;

    }

    public void damageCalc(int damage) {
        this.damage = damage;

    }
    public void DisplayStatusChar(){
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public abstract String getGender();
}
