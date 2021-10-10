package com.company;

import java.util.ArrayList;
import java.util.List;

public class Linear {
    protected ArrayList<Float> _xResult;

    public ArrayList<Float> getResult(float a, float b) throws RuntimeException{
        if(a == 0){
            throw new RuntimeException("Уравнение не имеет корней");
        }
        return _xResult = new ArrayList<>(List.of(-b/a));
    }
}
