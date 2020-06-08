package com.coolweather.android.db;

import android.os.Bundle;

public class testFlie {
    public static testFlie newInstance() {

        Bundle args = new Bundle();

        testFlie fragment = new testFlie();
        fragment.setArguments(args);
        return fragment;
    }

    private void setArguments(Bundle args) {
    }

}
