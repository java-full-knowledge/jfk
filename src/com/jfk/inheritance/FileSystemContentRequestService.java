package src.com.jfk.inheritance;

public final class FileSystemContentRequestService extends GoogleApiRequest {
    @Override
    protected String read() {
        System.out.println("Reading content from filesystem ...");
        return "File system content";
    }
}
