package UserRegistration.service;

public interface CrudeService <Request,Response>{

        public Response create(Request creatparametrs);
        public Response read(int id);
        public Response update(Request updateParametrs);
        public boolean delete(int id);
}
