package jsonparsing.jsonobject;

import java.util.Arrays;

public class Google_Map {

    private Marker [] markers;

    public Google_Map(Marker[] markers) {
        this.markers = markers;
    }

    public Marker[] getMarkers() {
        return markers;
    }

    @Override
    public String toString() {
        return "Google_Map{" +
                "markers=" + Arrays.toString(markers) +
                '}';
    }
}
