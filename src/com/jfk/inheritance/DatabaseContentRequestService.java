package com.jfk.inheritance;

public class DatabaseContentRequestService extends MicrosoftApiRequest {

    @Override
    protected String read() {
        System.out.println("Reading content from database ...");
        return "Database content";
    }

}
