public class VirtualPet{
//! Attributes-----------------------------------------------------------
private String petName;
private int hungerLevel = 0;
private boolean isHungry = false;
private boolean isOverFed = false;
private int thirstLevel = 0;
private boolean isThirsty = false;
private int boredLevel = 0;
private boolean isBored = false;

//! Constructor----------------------------------------------------------
public VirtualPet(String petName){
    this.petName = petName;
}
//! Getters and Setters ------------------------------------------------
public String getPetName() {
    return petName;
}

public void setPetName(String petName) {
    this.petName = petName;
}

public int getHungerLevel() {
    return hungerLevel;
}

public void setHungerLevel(int hungerLevel) {
    this.hungerLevel = hungerLevel;
}

public int getThirstLevel() {
    return thirstLevel;
}

public void setThirstLevel(int thirstLevel) {
    this.thirstLevel = thirstLevel;
}

public boolean isBored() {
    return isBored;
}

public void setBored(boolean isBored) {
    this.isBored = isBored;
}

public boolean isHungry() {
    return isHungry;
}
public void setHungry(boolean isHungry) {
    this.isHungry = isHungry;
}
public boolean isThirsty() {
    return isThirsty;
}
public void setThirsty(boolean isThirsty) {
    this.isThirsty = isThirsty;
}
public boolean isOverFed() {
    return isOverFed;
}
public void setOverFed(boolean isOverFed) {
    this.isOverFed = isOverFed;
}
public int getBoredLevel() {
    return boredLevel;
}
public void setBoredLevel(int boredLevel) {
    this.boredLevel = boredLevel;
}

//! Methods ---------------------------------------------------------------

public void petHungryDead(){
    if(this.hungerLevel >= 100){
        System.out.println(this.petName + " has starved to death");
        System.exit(0);
    }
}
public void petThirstyDead(){
    if(this.thirstLevel >= 100){
        System.out.println(this.petName + " has died of Thirst");
        System.exit(0);
    }
}
public void petLeftBored(){
    if(this.boredLevel >= 100){
        System.out.println(this.petName + " Chewed through the door and left for a more active life!");
        System.exit(0);
    }
}

public void petHungry(){
    if (this.hungerLevel > 50 ){
        setHungry(true);
    }
    if (this.hungerLevel <= 50 ){
        setHungry(false);
    }
    if (this.hungerLevel < 0){
        setOverFed(true);
    }
    if (this.hungerLevel >= 0){
        setOverFed(false);
    }
}

public void petThirsty(){
    if (this.thirstLevel > 30){
        setThirsty(true);
    }else {
        setThirsty(false);
    }
}

public void petBoredom(){
    if(boredLevel >= 30){
        setBored(true);
    }
    if(boredLevel <= 31){
        setBored(false);
    }
}
public void petStats(){
    System.out.println(petName + " hunger is " + hungerLevel + "%" + " and is Hungry " + isHungry);
    System.out.println(petName + " thirst is " + thirstLevel + "%" + " and is Thirsty " + isThirsty);
    System.out.println(petName + " bordom is " + boredLevel + "%" + " and is Bored " + isBored);
}

public void play(){
    hungerLevel += 20;
    thirstLevel += 30;
    boredLevel -= 40;
    petHungry();
    petThirsty();
    petBoredom();
    noNegative();
}

public void feed(){
    hungerLevel -= 50;
    thirstLevel += 10;
    boredLevel -= 10;
    petHungry();
    petThirsty();
    petBoredom();
    noNegative();
}

public void water(){
    hungerLevel -= 10;
    thirstLevel -= 50;
    boredLevel += 5;
    petHungry();
    petThirsty();
    petBoredom();
    noNegative();
}
public void noNegative(){
        if (this.hungerLevel < 0){
        hungerLevel = 0;
    }
        if (thirstLevel < 0){
        thirstLevel = 0;
    }
        if (boredLevel < 0){
        boredLevel = 0;
    }
}

public void tick(){
    hungerLevel += 10;
    thirstLevel += 10;
    boredLevel += 20;
    petHungry();
    petThirsty();
    petBoredom();
    petStats();
    System.out.println(" ");
    petHungryDead();
    petThirstyDead();
    petLeftBored();
    noNegative();
}




}