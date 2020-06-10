package com.jfk.bankaccountsystem;


/**
 * @author William Arustamyan
 */


public class BankApplication {

    private Storage memoryStorage;

    public BankApplication() {
        this.memoryStorage = new MemoryAccountStorage(10);
    }


    public AbstractBankEntity findByName(String name) {
        for (AbstractBankEntity entity : memoryStorage.entities) {
            if (entity.name == name) {
                return entity;
            }
        }
        return null;
    }

    public AbstractBankEntity findById(int id) {
        for (AbstractBankEntity entity : memoryStorage.entities) {
            if (entity.id == id) {
                return entity;
            }
        }
        return null;
    }

    public void add(AbstractBankEntity entity) {

    }

    public void remove(AbstractBankEntity entity) {

    }

    public void remove(int id) {
        //find and remove
    }


    public static void main(String[] args) {

//        Employee[] employees = new Employee[10];
//        Employee[] lessThen50 = new Employee[10];
//        int k = 0;
//        for (Employee employee : employees) {
//            if (employee.age < 50) {
//                lessThen50[k] = employee;
//                k++;
//            }
//        }
//        System.out.println(lessThen50);
//
//        Employee employee = new Employee(10);
//        Employee second = new Employee(60);
//        Predicate<Employee> employeePredicate = new AgePredicate();
//        System.out.println(employeePredicate.test(employee));
//        System.out.println(employeePredicate.test(second));
//
//
//        List<Employee> collect = Arrays.stream(employees)
//                .filter(new Predicate<Employee>() {
//                    @Override
//                    public boolean test(Employee employee) {
//                        return employee.age < 50;
//                    }
//                })
//                .collect(Collectors.toList());

        Light light = new Light() {
            public void turnOn() {
                System.out.println("TURN ON");
            }
        };
//        light.turnOn();

        Employee emp = new Employee(10) {
            public String tableName() {
                return "test";
            }
        };
        Employee xx = new Employee(30);
        System.out.println(emp.tableName());
    }

    /*AbstractBankEntity entity = new AbstractBankEntity() {
        public String toString() {
            return "XXX";
        }
    };*/

}






















