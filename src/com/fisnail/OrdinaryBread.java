package com.fisnail;

public class OrdinaryBread  extends AbstractMakeBread {

    @Override
    protected void addWater() {
        System.out.println("加水");
    }

    @Override
    protected void addEgg() {
        System.out.println("加蛋");
    }

    @Override
    protected void addSuger() {
        System.out.println("加糖");
    }

    @Override
    protected void addSalt() {
        System.out.println("加盐");
    }

    @Override
    protected void addMilk() {
        System.out.println("加奶");
    }

    @Override
    protected void addFlour() {
        System.out.println("加面粉");
    }

    @Override
    protected void otherDiy() {
    }

    @Override
    protected boolean diy() {
        return false;
    }



}
