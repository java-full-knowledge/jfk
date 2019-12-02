package UserRegistration.service;

import UserRegistration.domein.Domain;

public interface CrudeService <D extends Domain, R, C>{

        public R create(C creatparametrs);
        public D read(int id);
        public R update(C updateParametrs);
        public boolean delete(int id);
}
