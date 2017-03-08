/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kay.com;

import org.junit.jupiter.api.Test;

/**
 * Array Structure Test.
 *
 * @author kay
 * @version v0.0.1
 */
public class ArrayStructureTest {

    @Test
    public void printlnTest() {
        Integer[] ints = new Integer[60];
        ints = ArrayStructure.expandCapacity(null, 80);
        System.out.println(ints.length);
    }
}
