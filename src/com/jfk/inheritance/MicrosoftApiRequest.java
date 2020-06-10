package src.com.jfk.inheritance;

public abstract class MicrosoftApiRequest extends ApiRequestService {


    public void send() {
        System.out.println("Sending to microsoft url");
    }

    protected abstract String read();
}
