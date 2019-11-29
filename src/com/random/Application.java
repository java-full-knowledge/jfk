package com.random;

public class Application {


    public static void main(String[] args) {
        WaterMachine waterMachine = new HyundaiWaterMachine();
        ElectricalMachine electricalMachine = new HyundaiWaterMachine();
    }

    public static void turnOnAllElectricalMachines(ElectricalMachine... machines) {
        for (ElectricalMachine machine : machines) {
            machine.turnOn();
        }
        /*for (int i = 0; i < machines.length; i++) {
            machines[i].turnOn();
        }*/
//        Arrays.asList(machines).forEach(ElectricalMachine::turnOn);
    }

    public static void turnOffAllElectricalMachines(ElectricalMachine... machines) {
        for (ElectricalMachine machine : machines) {
            machine.turnOff();
        }
    }
}
