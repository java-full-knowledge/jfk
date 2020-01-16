package repetition.transmission;

public class Test {
    public static void main(String[] args) {

        Mechanical mechanical=new Mechanical(Degree.nitral);
        Automate automate=new Automate(20);
        Car car1=new Car(mechanical,30);
        car1.getTransmission().increasegear();
        car1.getTransmission().increasegear();
       // car1.getTransmission().reversegear();
       // car1.getTransmission().geardown();
        Car car2=new Car(automate,71);
       // car2.getTransmission().reversegear();
        System.out.println(car1);
        System.out.println(car2);
    }
}
