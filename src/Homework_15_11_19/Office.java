package Homework_15_11_19;

 class Office {

    private Object [] employee;

     public Office(Object[] employee) {
         this.employee = employee;
     }

     public Object[] getEmployee() {
         return employee;
     }

     public void setEmployee(Object[] employee) {
         this.employee = employee;
     }

     public void infoOffice(){
         for(Object ob :employee)
             System.out.println(ob);
     }
 }
