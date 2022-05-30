package com.qa.stepdef;

import com.qa.utils.GlobalParams;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void initialize() {
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();
    }

    @After
    public void quit() {

    }
}
