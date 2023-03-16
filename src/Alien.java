
public class Alien extends Champion {
    private int shield;
    private int magicDamage;
    private String race;
    private int mana;

    public Alien(String name, String type, Weapon weapon, Boots boots, int shield, int magicDamage,
                 String race, int mana){

        super(name, boots, weapon);
        this.shield = shield;
        this.magicDamage = magicDamage;
        this.race = race;
        this.mana = mana;
    }



    /**
     * Getters and Setters
     */

    public int getShield() {
        return shield;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public String getRace() {
        return race;
    }

    public int getMana() {
        return mana;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}