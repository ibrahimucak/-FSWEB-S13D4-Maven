package org.example;

public enum Weapon {
    SWORD(20,5),
    AXE(30,3.5),
    MACE(45,1.8);

    private int damage;
    private double attackSpeed;

    Weapon(int damage,double attackSpeed){
        this.attackSpeed = attackSpeed;
        this.damage = damage;
    }
    public int getDamage(){
        return this.damage;

    }
    public double getattackSpeed(){
        return this.attackSpeed;
    }



}

