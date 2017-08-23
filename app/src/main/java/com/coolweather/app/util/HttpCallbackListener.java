package com.coolweather.app.util;

/**
 * Created by Pan on 2017/8/23.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
