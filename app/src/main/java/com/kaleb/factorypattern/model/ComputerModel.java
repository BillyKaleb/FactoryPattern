package com.kaleb.factorypattern.model;

import com.kaleb.factorypattern.Factory;
import com.kaleb.factorypattern.abstractfactory.FactoryWorkerAbstractFactory;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version ComputerModel, v 0.1 09/05/19 09.34 by Billy Kaleb Hananto
 */
public class ComputerModel implements Factory {

    private FactoryWorkerAbstractFactory factoryWorkerAbstractFactory;

    public ComputerModel() {

    }

    public ComputerModel(
        FactoryWorkerAbstractFactory factoryWorkerAbstractFactory) {
        this.factoryWorkerAbstractFactory = factoryWorkerAbstractFactory;
    }

    @Override
    public String worker() {
        return factoryWorkerAbstractFactory.createWorker();
    }

    @Override
    public String createSomething() {
        return "Computers and stuff";
    }

    @Override
    public String workerGoHome() {
        return "9 PM Exact";
    }
}
