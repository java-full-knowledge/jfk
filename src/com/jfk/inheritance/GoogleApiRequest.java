package src.com.jfk.inheritance;

public abstract class GoogleApiRequest extends ApiRequestService {

    private final String url = "http://api.google.com";

    public final void send() {
        System.out.println("Content : " + read());
        System.out.println("Sending request to google service with url : " + url);
    }

    protected abstract String read();
}
