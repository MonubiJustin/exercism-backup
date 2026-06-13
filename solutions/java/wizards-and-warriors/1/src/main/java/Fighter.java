class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        if (fighter.isVulnerable()) return 10;

        return 6;
    }

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {

   private boolean spellFlag = false;

 

    public void prepareSpell(){
        this.spellFlag = true;
    }
    
    @Override
    boolean isVulnerable(){
        return !spellFlag;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        if(spellFlag) return 12;

        return 3;
    }

     @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
}