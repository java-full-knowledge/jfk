package com.random;

public class HyundaiWaterMachine implements WaterMachine, ElectricalMachine {

    private boolean isOn = false;

    public HyundaiWaterMachine() {

    }

    @Override
    public void hotWater() {
        if (isOn) {
            System.out.println(this.getClass().getSimpleName() + " : hotWater");
        } else {
            System.out.println("Please turn on the ... ");
        }
    }

    @Override
    public void coldWater() {
        if (isOn) {
            System.out.println(this.getClass().getSimpleName() + " : coldWater");
        } else {
            System.out.println("Please turn on the ... ");
        }
    }


    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }
}
