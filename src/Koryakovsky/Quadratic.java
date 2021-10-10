package Koryakovsky;

import java.util.ArrayList;
import java.util.List;

public class Quadratic extends Linear {
    protected float getDisc(float a, float b, float c){
        return b * b - 4 * a * c;
    }
    public ArrayList<Float> getResult(float a, float b, float c) throws RuntimeException{
        if(a == 0){
            return this.getResult(b, c);
        }
        float _forX = getDisc(a,b,c);
        if(_forX < 0){
            throw new RuntimeException("This equation has no roots");
        }
        _xResult = new ArrayList<Float>();
        if(_forX > 0){
            _forX = (float) Math.sqrt(_forX);
            return _xResult = new ArrayList<Float>(List.of((-b + _forX) / (2 * a), (-b - _forX) / (2 * a)));
        }
        return _xResult = new ArrayList<Float>(List.of(-b / 2 * a));
    }

    protected ArrayList<Float> _xResult;
}
