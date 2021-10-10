package Koryakovsky;

import java.util.ArrayList;
import java.util.List;

public class Linear {
    protected ArrayList<Float> _xResult;
    public ArrayList<Float> getResult(float a, float b) throws KoryakovskyException{
        if(a == 0){
            throw new KoryakovskyException("Уравнение не имеет корней");
        }
        KoryakovskyLog.I().log("This is linear equation");
        return _xResult = new ArrayList<>(List.of(-b/a));
    }
}
