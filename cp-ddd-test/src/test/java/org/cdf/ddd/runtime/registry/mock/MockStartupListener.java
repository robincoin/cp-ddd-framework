package org.cdf.ddd.runtime.registry.mock;

import org.cdf.ddd.runtime.IStartupListener;
import org.springframework.stereotype.Component;

@Component
public class MockStartupListener implements IStartupListener {
    private boolean called = false;

    @Override
    public void onStartComplete() {
        called = true;
    }

    public boolean isCalled() {
        return called;
    }

}
