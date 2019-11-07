package Homework_04_11_19;

/*Задача на взаимодействие между классами. Разработать систему «Автобаза».
 Диспетчер распределяет заявки на Рейсы между Водителями и назначает для этого Автомобиль.
  Водитель может сделать заявку на ремонт. Диспетчер может отстранить Водителя от работы.
  Водитель делает отметку о выполнении Рейса и состоянии Автомобиля.*/

//Диспетчер
class Dispatcher extends Person {
    private int number;

    Dispatcher(String firstName, String lastName, int number) {
        super(firstName, lastName);
        this.number = number;
    }

    public Job newJob(Car car, Flights flights, Driver driver) {
        Job job = null;
        if (driver.getStates() == true) {
            driver.setCar(car);
            job = new Job(flights, driver);
            System.out.println("New Job!!!");
        } else
            System.out.println("Eror");
        return job;
    }
}

class Driver extends Person {
    private Car car;
    private Flights flights;
    private String location;
    private boolean states;

    public Driver(String firstName, String lastName, Car car, Flights flights, String location) {
        super(firstName, lastName);
        this.car = car;
        this.flights = flights;
        this.location = location;
        this.states = true;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean getStates() {
        return states;
    }

    public void setStates(boolean states) {
        this.states = states;
    }

    public boolean endFlights() {
        return location == flights.getFinish();
    }
}

//Рейсы
class Flights {
    private String start;
    private String finish;

    public Flights(String start, String finish) {
        this.start = start;
        this.finish = finish;
    }

    public String getStart() {
        return start;
    }

    public String getFinish() {
        return finish;
    }
}

class Job {
    private Flights flights;
    private Driver driver;

    public Job(Flights flights, Driver driver) {
        this.flights = flights;
        this.driver = driver;
        this.driver.setStates(false);
    }
}

class Car {
    private String car_model;
    private int year_of_issue;
    private String color;

    public Car(String car_model, int year_of_issue, String color) {
        this.car_model = car_model;
        this.year_of_issue = year_of_issue;
        this.color = color;
    }

    public String getCar_model() {
        return car_model;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car:\n" + car_model + "\n" + color + "\n" + year_of_issue;
    }
}


