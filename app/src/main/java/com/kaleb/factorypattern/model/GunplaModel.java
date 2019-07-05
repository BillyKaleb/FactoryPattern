package com.kaleb.factorypattern.model;

import com.kaleb.factorypattern.Factory;
import com.kaleb.factorypattern.abstractfactory.FactoryWorkerAbstractFactory;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version GunplaModel, v 0.1 09/05/19 09.30 by Billy Kaleb Hananto
 */
public class GunplaModel implements Factory {

    private FactoryWorkerAbstractFactory factoryWorkerAbstractFactory;

    public GunplaModel() {

    }

    public GunplaModel(FactoryWorkerAbstractFactory factoryWorkerAbstractFactory) {
        this.factoryWorkerAbstractFactory = factoryWorkerAbstractFactory;
    }

    @Override
    public String worker() {
        return factoryWorkerAbstractFactory.createWorker();
    }

    @Override
    public String createSomething() {
        return "Gunpla Created!";
    }

    @Override
    public String workerGoHome() {
        return "around 6 PM";
    }
}
