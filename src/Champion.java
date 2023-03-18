
public class Champion {
    private String name;
    private byte hp = 100;
    private short speed = 10;
    private Boots boots;
    private Weapon weapon;

    public static class Boots {
        private String name;
        private short speed;

        public Boots(String name, short speed){
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public short getSpeed() {
            return speed;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSpeed(short speed) {
            this.speed = speed;
        }
    }
    public static class Weapon {
        private String name;
        private short damage;
        public Weapon(String name, short damage){
            this.name = name;
            this.damage = damage;
        }

        /**
         * Getters
         */

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }

        /**
         * Setters
         */

        public void setName(String name) {
            this.name = name;
        }

        public void setDamage(int damage) {
            this.damage = (short) damage;
        }
    }

    public Champion(String name, Boots boots, Weapon weapon) {
        this.name = name;
        this.boots = boots;
        this.weapon = weapon;
    }

    public void decreaseHp(byte damage) {
        if((hp - damage) < 1) hp = 0;
        else hp -= damage;
    }

    public void increaseHp(byte health) {
        if((hp + health) >= 100) hp = 100;
        else hp += health;
    }

    public void attack(Champion champ, byte damage){
        champ.decreaseHp(damage);
    }


    /**
     * Getters
     */

    public String getName() {
        return name;
    }

    public byte getHp() {
        return hp;
    }

    public short getSpeed() {
        return (short) (speed + this.boots.getSpeed());
    }

    public String getWeaponName() {
        return this.weapon.name;
    }

    public short getWeaponDamage(){ return this.weapon.damage; }

    public String getBootsName() {
        return this.boots.name;
    }

    public int getBootsSpeed(){
        return this.boots.speed;
    }

    /**
     * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public void setHp(byte hp) {
        this.hp = hp;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeaponName(String name){
        this.weapon.setName(name);
    }

    public void setWeaponDamage(int damage){
        this.weapon.setDamage((short) damage);
    }

    public void setBoots(Boots boots){
        this.boots = boots;
    }

    public void setBootsName(String boots) {
        this.boots.setName(boots);
    }

    public void setBootsSpeed(short speed){
        this.boots.setSpeed(speed);
    }


}