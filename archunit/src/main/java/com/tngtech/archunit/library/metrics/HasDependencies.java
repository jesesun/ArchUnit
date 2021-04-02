/*
 * Copyright 2014-2021 TNG Technology Consulting GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tngtech.archunit.library.metrics;

import java.util.Set;

import com.tngtech.archunit.core.domain.JavaClass;

/**
 * An abstract way to specify that some element of type {@code T} has dependencies
 * on other elements of this type. Often this is a necessary property to calculate
 * certain metrics, e.g. {@link LakosMetrics}.<br>
 * An example would be a {@link JavaClass} which has dependencies on other
 * {@link JavaClass JavaClasses}.
 */
interface HasDependencies<T> {
    Set<T> getDependencies();
}
