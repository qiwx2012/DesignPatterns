package qiwx.com.designpatterns.bridge;

import android.util.Log;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 17:42
 * @desc:
 */

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        Log.i("dd","初始化 DrawAPI");
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}
