/*
 * Copyright 2021 the original author or authors.
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

package org.gradle.api.attributes;

import org.gradle.api.Incubating;
import org.gradle.api.Named;

/**
 * Attributes to qualify the type of testing a Test Suite will perform
 * <p>
 * This attribute is usually found on variants that have the {@link Category} attribute valued at {@link Usage#VERIFICATION verification}.
 *
 * @since 7.4
 */
@Incubating
public interface TestType extends Named {
    Attribute<TestType> TEST_TYPE_ATTRIBUTE = Attribute.of("org.gradle.testsuitetype", TestType.class);

    /**
     * Unit tests, the default type of Test Suite
     */
    String UNIT_TESTS = "unit-tests";

    String INTEGRATION_TESTS = "integration-tests";

    /**
     * Functional tests, will be added automatically when initializing a new plugin project
     */
    String FUNCTIONAL_TESTS = "functional-tests";

    String PERFORMANCE_TESTS = "performance-tests";
}
