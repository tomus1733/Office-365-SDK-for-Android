/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.outlookservices.*;
import static com.microsoft.services.odata.Helpers.*;

/**
 * The type CalendarGroupOperations.
 */
public class CalendarGroupOperations extends EntityOperations {

     /**
      * Instantiates a new CalendarGroupOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public CalendarGroupOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public CalendarGroupOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public CalendarGroupOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }


}