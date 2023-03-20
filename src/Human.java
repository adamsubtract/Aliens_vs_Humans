
public class Human extends Champion{
    private short attackDamage = 5;
    private String gender;
    private String type;



    public Human(String name, String type, Champion.Weapon weapon, Boots boots, short attackDamage,
                 String gender){
        super(name, boots, weapon);
        this.type = type;
        this.attackDamage = attackDamage;
        this.gender = gender;
    }

    @Override
    public void attack(Champion champ, short attackDamage){
        champ.decreaseHp((short) (this.getWeaponDamage() + attackDamage));
    }

    /**
     * Setter and getters
     */

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getGender() {
        return gender;
    }

    public void setAttackDamage(short attackDamage) {
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