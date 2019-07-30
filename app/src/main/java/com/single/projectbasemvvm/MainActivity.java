package com.single.projectbasemvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.single.projectbasemvvm.base.BaseActivity;
import com.single.projectbasemvvm.base.BaseViewModel;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public BaseViewModel getViewModel() {
        return null;
    }

    @Override
    protected void setUp() {

    }

    @Override
    public int getLayoutRes() {
        return 0;
    }
}
