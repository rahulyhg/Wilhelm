/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.handlers;

import com.radixpro.share.calc.SEFrontend;
import com.radixpro.share.calc.SEFrontendFactory;

public class CalculationHandlerFactory {

    public CalculationHandler getCalculationHandler() {
        SEFrontendFactory seFrontendFactory = new SEFrontendFactory();
        SEFrontend seFrontend = seFrontendFactory.getSEFrontend();
        return new CalculationHandler(seFrontend);
    }
}
