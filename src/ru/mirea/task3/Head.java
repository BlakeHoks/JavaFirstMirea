package ru.mirea.task3;

public class Head {
    private int iq;
    private boolean hair;

    public Head(int iq, boolean hair){
        this.iq = iq;
        this.hair = hair;
    }

    public Head(int iq){
        this.iq = iq;
        this.hair = true;
    }

    public Head(){
        this.iq = 89;
        this.hair = true;
    }

    public void Degrade(){
        this.iq -= 5;
    }

    public void Evolve(){
        this.iq += 5;
    }

    public int GetIq(){
        return iq;
    }

    public boolean IsHair() {
        return hair;
    }

    public void BaldHaircut(){
        this.hair = false;
    }

    public void TransplantHair(){
        this.hair = true;
    }

    @Override
    public String toString() {
        return "Head{" +
                "iq=" + iq +
                ", hair=" + hair +
                '}';
    }
}
