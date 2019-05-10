package com.fisnail;

public abstract class AbstractMakeBread {
    protected abstract void addWater();

    protected abstract void addEgg();

    protected abstract void addSuger();

    protected abstract void addSalt();

    protected abstract void addMilk();

    protected abstract void addFlour();

    //    其他自己喜欢的东西
    protected abstract void otherDiy();

    protected boolean diy() {
        return false;
    }

    public final void make() {
        this.addWater();
        this.addEgg();
        this.addSuger();
        this.addSalt();
        this.addMilk();
        this.addFlour();
        if (diy()) {
            this.otherDiy();
        }
    }

}
