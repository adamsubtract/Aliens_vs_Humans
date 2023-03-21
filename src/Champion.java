
public class Champion {
    private String name;
    private short hp = 1000;
    private short speed = 10;
    Boots boots;
    Weapon weapon;

    static class Boots {
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
    static class Weapon {
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

        public short getDamage() {
            return damage;
        }

        /**
         * Setters
         */

        public void setName(String name) {
            this.name = name;
        }

        public void setDamage(short damage) {
            this.damage = damage;
        }
    }

    public Champion(String name, Boots boots, Weapon weapon) {
        this.name = name;
        this.boots = boots;
        this.weapon = weapon;
    }

    public void increaseHp(short health) {
        if((hp + health) >= 1000) hp = 1000;
        else hp += health;
    }

    public void decreaseHp(short damage) {
        if((hp - damage) < 1) hp = 0;
        else hp -= damage;
    }

    /**
     * Getters
     */

    public String getName() {
        return name;
    }

    public short getHp() {
        return hp;
    }

    public short getSpeed() {
        return (short) (speed + this.boots.getSpeed());
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

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

}