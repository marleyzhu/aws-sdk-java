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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetUser" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user to get information about.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to the user making the request. This parameter
     * allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: _+=,.@-
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The name of the user to get information about.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to the user making the request. This parameter
     * allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user to get information about.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to the user making the request. This
     *        parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: _+=,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user to get information about.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to the user making the request. This parameter
     * allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the user to get information about.</p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to the user making the request. This
     *         parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: _+=,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user to get information about.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to the user making the request. This parameter
     * allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user to get information about.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to the user making the request. This
     *        parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserRequest withUserName(String userName) {
        setUserName(userName);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserRequest == false)
            return false;
        GetUserRequest other = (GetUserRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public GetUserRequest clone() {
        return (GetUserRequest) super.clone();
    }

}
