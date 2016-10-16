package com.KemalBakacak.library;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;


public class TestView extends LinearLayout {
    public TestView(Context context) {
        super(context);
        definition(context);
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
        definition(context);
    }

    private void definition(Context context)
    {
        inflate(context, R.layout.test_view, this);
    }
}
