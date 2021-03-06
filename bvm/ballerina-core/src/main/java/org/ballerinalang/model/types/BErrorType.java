/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinalang.model.types;

import org.ballerinalang.model.values.BError;
import org.ballerinalang.model.values.BValue;

/**
 * Represents runtime type of an error.
 *
 * @since 0.983.0
 */
public class BErrorType extends BType {

    public BType reasonType;
    public BType detailsType;

    BErrorType(String typeName, BType reasonType, BType detailsType, String pkgPath) {
        super(typeName, pkgPath, BError.class);
        this.reasonType = reasonType;
        this.detailsType = detailsType;
    }

    public BErrorType(BType reasonType, BType detailsType) {
        super(TypeConstants.ERROR, null, BError.class);
        this.reasonType = reasonType;
        this.detailsType = detailsType;
    }

    @Override
    public <V extends BValue> V getZeroValue() {
        return null;
    }

    @Override
    public <V extends BValue> V getEmptyValue() {
        return null;
    }

    @Override
    public int getTag() {
        return TypeTags.ERROR_TAG;
    }
}
