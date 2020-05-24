package com.qalens.persona.cucumber;

import com.qalens.persona.managers.PageObjectManager;

public class TestContext {
    private PageObjectManager pageObjectManager;

    public TestContext(){
        pageObjectManager = new PageObjectManager();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}