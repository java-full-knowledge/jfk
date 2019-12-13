package jsonparsing.Applications;

import java.io.IOException;

public interface Parsingproces<T> {

    T parsing() throws IOException;
}
