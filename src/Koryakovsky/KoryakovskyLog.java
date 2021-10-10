package Koryakovsky;

import core.LogAbstract;
import core.LogInterface;

import java.util.ArrayList;

public class KoryakovskyLog extends LogAbstract implements LogInterface {

    @Override
    public LogInterface log(String str) {
        logList.add(str);
        return this;
    }

    @Override
    public LogInterface write() {
        writeConsole(logList.toArray(new String[0]));
        return this;
    }

    ArrayList<String> logList = new ArrayList<String>();

    private static KoryakovskyLog instance;

    private KoryakovskyLog(){};

    public static KoryakovskyLog I(){
        if(instance == null){
            instance = new KoryakovskyLog();
        }
        return instance;
    }
}
