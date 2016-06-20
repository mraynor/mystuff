package com.varentech.deploya;

import com.varentech.deploya.Form.ServerConnection;
import java.io.IOException;

public class Driver {
    //This string should be final as it should not change. At initial run, the
    //program should be able to create this directory if it is not found.
    final static String pathToLocal = "/opt/deploya";

    public static void main(String[] args) throws IOException {

        //connect to server
        ServerConnection server = new ServerConnection();
        server.connect();

        //TODO: Make sure that a directory is located at /opt/deploya/

        //TODO: Create that directory if it does not exist.


        //TODO: Find a way to get the unpacking arguments. If none given, default of null.
        //Get unpack arguments.
        //entriesDetail.setUnpackArguments();
    }

}
