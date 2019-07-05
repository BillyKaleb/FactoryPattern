package com.kaleb.factorypattern.abstractfactory;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version ElectronicsWorkerAbstractFactory, v 0.1 09/05/19 14.01 by Billy Kaleb Hananto
 */
public class ElectronicsWorkerAbstractFactory implements FactoryWorkerAbstractFactory {

    @Override
    public String createWorker() {
        return "Worker lv17";
    }
}
