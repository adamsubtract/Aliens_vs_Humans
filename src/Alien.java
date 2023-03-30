
public class Alien extends Champion {
    private short shield;
    private short magicDamage;
    private String race;
    private short mana;

    public Alien(String name,
                 Weapon weapon,
                 Boots boots,
                 short shield,
                 short magicDamage,
                 String race,
                 short mana){

        super(name, boots, weapon);
        this.shield = shield;
        this.magicDamage = magicDamage;
        this.race = race;
        this.mana = mana;
    }

    /**
     * This method simulates and attack between two Human entities or Human
     * and Alien entity.
     * @param target is the Human or Alien being attacked
     * @param <T> Champion, Human or Alien entity.
     */

    public <T extends Champion> void attack(T target){
        target.decreaseHp(getTotalDamage());
    }

    /**
     * decreases Aliens health.
     * @param damage how much health to be removed.
     */
    @Override
    public void decreaseHp(short damage) {
        if((getHp() + getShield() - damage) < 1)
            setHp((byte) 0);
        else if ( (getHp() + getShield()) - damage > MAX_HEALTH ) {
            setHp((byte) MAX_HEALTH);
        }
        else
            setHp((short) ((getHp() + getShield()) - damage));
    }



    /**
     * Getters
     */

    public short getShield() {
        return shield;
    }

    public short getMagicDamage() {
        return magicDamage;
    }

    public String getRace() {
        return race;
    }

    public short getMana() {
        return mana;
    }

    public short getTotalDamage(){
        return (short) (getMagicDamage() + weapon.getDamage());
    }

    public short getTotalSpeed(){
        return (short) (getSpeed() + boots.getSpeed());
    }


    /**
     * Setters
     */

    public void setShield(short shield) {
        this.shield = shield;
    }

    public void setMagicDamage(short magicDamage) {
        this.magicDamage = magicDamage;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setMana(short mana) {
        this.mana = mana;
    }
}