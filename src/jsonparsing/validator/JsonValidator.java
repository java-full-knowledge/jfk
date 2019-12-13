package jsonparsing.validator;

public interface JsonValidator<P,T> {

    T validate(P content);
}
