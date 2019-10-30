class DnDCharacter {
    // Define character stat variables
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    // Variable for character hitpoints
    private int hp;

    /**
     * Create instance of DnDCharacter with random stats
     **/
    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hp = 10 + modifier(this.constitution);
    }

    private int rollDie6() {
        return (int) (Math.random() * 6.0) + 1;
    }

    /**
     * Roll four 6-sided dies. Sum the resulting numbers except for the smallest one
     **/
    public int ability() {
        int[] dieRolls = new int[4];
        // Keep track of the lowest roll
        int min = 7;
        for (int i = 0; i < dieRolls.length; ++i) {
            dieRolls[i] = rollDie6();
            if (dieRolls[i] < min) {
                min = dieRolls[i];
            }
        }
        // Subtract min from sum total
        int sum = 0 - min;
        for (int roll : dieRolls) {
            sum += roll;
        }
        // Return sum
        return sum;
    }

    /**
     * Calculate the constitution modifier given the constitution as the input
     **/
    public int modifier(int input) {
        int modPreDivision = input - 10;
        double res = Math.floor((double) modPreDivision / 2.0);
        if (modPreDivision < 0) {
            // Turn mod pre division into a positive version of itself
            int posMod = Math.abs(modPreDivision);
            // Change result to rounding posMod/2 and then multiplying it by negative 1
            res = Math.round(posMod / 2.0) * -1;
        }
        return (int) res;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }
}
