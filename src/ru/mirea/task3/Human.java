package ru.mirea.task3;

public class Human {
    private Head head;
    private Hand rightHand;
    private Hand leftHand;
    private Leg rightLeg;
    private Leg leftLeg;

    public Human(){
        this.head = new Head();
        this.rightHand = new Hand();
        this.leftHand = new Hand();
        this.rightLeg = new Leg();
        this.leftLeg = new Leg();
    }

    public void BrakeRightHand(){
        rightHand.Break();
    }

    public void BrakeLeftHand(){
        leftHand.Break();
    }

    public void BrakeRightLeg(){
        rightLeg.Break();
    }

    public void BrakeLeftLeg(){
        leftLeg.Bent();
    }

    public void BentRightHand(){
        rightHand.Bent();
    }

    public void BentLeftHand(){
        leftHand.Bent();
    }

    public void BentRightLeg(){
        rightLeg.Bent();
    }

    public void BentLeftLeg(){
        leftLeg.Bent();
    }

    public void Evolve(){
        head.Evolve();
    }

    public void Degrade(){
        head.Degrade();
    }

    public void BaldHaircut(){
        head.BaldHaircut();
    }

    public void TransplantHair(){
        head.TransplantHair();
    }

    @Override
    public String toString() {
        return "Human{\n" +
                "head=" + head +
                "\nrightHand=" + rightHand +
                "\nleftHand=" + leftHand +
                "\nrightLeg=" + rightLeg +
                "\nleftLeg=" + leftLeg +
                "\n}";
    }
}
