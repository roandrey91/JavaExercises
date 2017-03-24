package com.company;

/**
 * Created by Andrei on 3/5/2017.
 */
public class InvalidStatementException extends Exception {

    public InvalidStatementException(String reason, String statemnt){
            super(reason + ": " + statemnt );
    }

    public InvalidStatementException(String reason, String statemnt, Throwable cause){
        super(reason + ": " + statemnt, cause );
    }


}
