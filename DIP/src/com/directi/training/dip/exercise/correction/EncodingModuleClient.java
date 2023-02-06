package com.directi.training.dip.exercise.correction;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();
        encodingModule.encodeWithFiles();
        MyDatabase database = new MyDatabase();
        encodingModule.encodeBasedOnNetworkAndDatabase(database);
    }
}

