/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.directoryservices.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.directoryservices.*;
import static com.microsoft.services.odata.Helpers.*;



/**
 * The type OAuth2PermissionGrantCollectionOperations
 */
public class OAuth2PermissionGrantCollectionOperations extends ODataOperations{

    /**
     * Instantiates a new OAuth2PermissionGrantCollectionOperations.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
    public OAuth2PermissionGrantCollectionOperations(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public OAuth2PermissionGrantCollectionOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public OAuth2PermissionGrantCollectionOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }
}
