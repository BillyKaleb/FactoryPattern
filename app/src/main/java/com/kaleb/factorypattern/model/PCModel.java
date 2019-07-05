package com.kaleb.factorypattern.model;

import com.kaleb.factorypattern.Factory;
import com.kaleb.factorypattern.abstractfactory.FactoryWorkerAbstractFactory;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version PCModel, v 0.1 09/05/19 10.38 by Billy Kaleb Hananto
 */
public class PCModel implements Factory {

    private FactoryWorkerAbstractFactory factoryWorkerAbstractFactory;

    public PCModel(FactoryWorkerAbstractFactory factoryWorkerAbstractFactory) {
        this.factoryWorkerAbstractFactory = factoryWorkerAbstractFactory;
    }

    @Override
    public String worker() {
        return factoryWorkerAbstractFactory.createWorker();
    }

    @Override
    public String createSomething() {
        return "PC only";
    }

    @Override
    public String workerGoHome() {
        return "10 PM Exact";
    }

}
