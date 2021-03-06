/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeviceDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeviceDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A client token used to correlate requests and responses. */
    private String amznClientToken;
    /** Information about the initial version of the device definition. */
    private DeviceDefinitionVersion initialVersion;
    /** The name of the device definition. */
    private String name;

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @return A client token used to correlate requests and responses.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceDefinitionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * Information about the initial version of the device definition.
     * 
     * @param initialVersion
     *        Information about the initial version of the device definition.
     */

    public void setInitialVersion(DeviceDefinitionVersion initialVersion) {
        this.initialVersion = initialVersion;
    }

    /**
     * Information about the initial version of the device definition.
     * 
     * @return Information about the initial version of the device definition.
     */

    public DeviceDefinitionVersion getInitialVersion() {
        return this.initialVersion;
    }

    /**
     * Information about the initial version of the device definition.
     * 
     * @param initialVersion
     *        Information about the initial version of the device definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceDefinitionRequest withInitialVersion(DeviceDefinitionVersion initialVersion) {
        setInitialVersion(initialVersion);
        return this;
    }

    /**
     * The name of the device definition.
     * 
     * @param name
     *        The name of the device definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the device definition.
     * 
     * @return The name of the device definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the device definition.
     * 
     * @param name
     *        The name of the device definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceDefinitionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getInitialVersion() != null)
            sb.append("InitialVersion: ").append(getInitialVersion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeviceDefinitionRequest == false)
            return false;
        CreateDeviceDefinitionRequest other = (CreateDeviceDefinitionRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getInitialVersion() == null ^ this.getInitialVersion() == null)
            return false;
        if (other.getInitialVersion() != null && other.getInitialVersion().equals(this.getInitialVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getInitialVersion() == null) ? 0 : getInitialVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeviceDefinitionRequest clone() {
        return (CreateDeviceDefinitionRequest) super.clone();
    }

}
