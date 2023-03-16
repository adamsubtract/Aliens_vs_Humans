
public class Human extends Champion{
    private int armour;
    private int attackDamage;
    private String gender;
    private String type;

    public Human(String name, String type, Champion.Weapon weapon, Boots boots, int armour, int attackDamage, String gender){
        super(name, boots, weapon);
        this.type = type;
        this.armour = armour;
        this.attackDamage = attackDamage;
        this.gender = gender;
    }

    /**
     * Setter and getters
     */

    public int getArmour() {
        return armour;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getGender() {
        return gender;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}