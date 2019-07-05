package com.kaleb.factorypattern.factorymethod;

import com.kaleb.factorypattern.abstractfactory.ElectronicsWorkerAbstractFactory;
import com.kaleb.factorypattern.model.ComputerModel;
import com.kaleb.factorypattern.Factory;
import com.kaleb.factorypattern.model.PCModel;
import com.kaleb.factorypattern.abstractfactory.FactoryWorkerAbstractFactory;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version ComputerMethodFactory, v 0.1 09/05/19 10.38 by Billy Kaleb Hananto
 */
public class ComputerMethodFactory extends FactoryMethodFactory {

    private FactoryWorkerAbstractFactory factoryWorkerAbstractFactory = new ElectronicsWorkerAbstractFactory();

    @Override
    Factory createNewFactory(String factoryDecide) {
        if (factoryDecide.equals("PC")) {
            return new PCModel(factoryWorkerAbstractFactory);
        }
        return new ComputerModel(factoryWorkerAbstractFactory);
    }
}
