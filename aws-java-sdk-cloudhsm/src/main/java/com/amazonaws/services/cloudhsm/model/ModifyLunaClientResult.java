/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

/**
 * 
 */
public class ModifyLunaClientResult implements Serializable, Cloneable {

    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     */
    private String clientArn;

    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the client.
     */
    public String getClientArn() {
        return clientArn;
    }
    
    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @param clientArn The ARN of the client.
     */
    public void setClientArn(String clientArn) {
        this.clientArn = clientArn;
    }
    
    /**
     * The ARN of the client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @param clientArn The ARN of the client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyLunaClientResult withClientArn(String clientArn) {
        this.clientArn = clientArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientArn() != null) sb.append("ClientArn: " + getClientArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClientArn() == null) ? 0 : getClientArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyLunaClientResult == false) return false;
        ModifyLunaClientResult other = (ModifyLunaClientResult)obj;
        
        if (other.getClientArn() == null ^ this.getClientArn() == null) return false;
        if (other.getClientArn() != null && other.getClientArn().equals(this.getClientArn()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyLunaClientResult clone() {
        try {
            return (ModifyLunaClientResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    