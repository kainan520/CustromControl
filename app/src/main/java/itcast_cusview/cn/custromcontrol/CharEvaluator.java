package itcast_cusview.cn.custromcontrol;

import android.animation.TypeEvaluator;

public class CharEvaluator implements TypeEvaluator<Character> {

    @Override
    public Character evaluate(float fraction, Character startValue, Character endValue) {
        int startInt = (int) startValue;
        int endInt = (int) endValue;
        int curInt = (int) (fraction * (endInt - startInt) + startInt);
        char result = (char) curInt;
        return result;
    }
}
