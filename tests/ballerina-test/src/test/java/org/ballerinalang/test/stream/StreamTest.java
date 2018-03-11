/*
*  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.test.stream;

import org.ballerinalang.launcher.util.BCompileUtil;
import org.ballerinalang.launcher.util.BRunUtil;
import org.ballerinalang.launcher.util.CompileResult;
import org.ballerinalang.model.values.BValue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * This contains methods to test different behaviours of Stream Functions.
 *
 * @since 0.8.0
 */
public class StreamTest {

    private CompileResult result;
    private final String funcName = "test";

    @BeforeClass
    public void setup() {
        result = BCompileUtil.compile("test-src/statements/stream/stream-test.bal");
        System.out.printf("fdfdf");
    }

    @Test(description = "Check Stream Functions")
    public void testIfBlock() {
        BValue[] args = {};
        BValue[] returns = BRunUtil.invoke(result, funcName, args);
    }

}
