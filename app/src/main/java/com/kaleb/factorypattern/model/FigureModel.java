package com.kaleb.factorypattern.model;

import com.kaleb.factorypattern.Factory;
import com.kaleb.factorypattern.abstractfactory.FactoryWorkerAbstractFactory;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version FigureModel, v 0.1 09/05/19 10.39 by Billy Kaleb Hananto
 */
public class FigureModel implements Factory {

    private FactoryWorkerAbstractFactory factoryWorkerAbstractFactory;

    public FigureModel(FactoryWorkerAbstractFactory factoryWorkerAbstractFactory) {
        this.factoryWorkerAbstractFactory = factoryWorkerAbstractFactory;
    }

    @Override
    public String worker() {
        return factoryWorkerAbstractFactory.createWorker();
    }

    @Override
    public String createSomething() {
        return "Figure Created!";
    }

    @Override
    public String workerGoHome() {
        return "around 8 PM";
    }

}
