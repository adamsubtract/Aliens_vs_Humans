
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