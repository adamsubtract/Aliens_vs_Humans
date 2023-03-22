
public class Human extends Champion{
    private short attackDamage = 50;
    private String gender;
    private String type;

    Armour armour;

    static class Armour{

        private String name;
        private short defense;

        Armour(String name, short defense){
            this.name = name;
            this.defense = defense;
        }

        // Getters

        public String getName() {
            return name;
        }

        public short getDefense() {
            return defense;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setDefense(short defense) {
            this.defense = defense;
        }
    }

    public Human(String name, String type, String gender, Champion.Weapon weapon, Boots boots,
                  Armour armour){
        super(name, boots, weapon);
        this.gender = gender;
        this.type = type;
        this.armour = armour;
    }

    public <T extends Champion> void attack(T target){
         target.decreaseHp(this.getTotalDamage());
    }


    /**
     * Returns Human attack damage plus weapon damage.
     * @return Total Human damage output.
     */
    public short getTotalDamage(){
        return (short) (attackDamage + weapon.getDamage());
    }

    /**
     * Getters
     */

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    /**
     * Setters
     */

    public void setAttackDamage(short attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setType(String type) {
        this.type = type;
    }

}