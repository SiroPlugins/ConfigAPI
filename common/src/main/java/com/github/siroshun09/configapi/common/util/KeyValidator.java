/*
 *     Copyright 2021 Siroshun09
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.github.siroshun09.configapi.common.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class KeyValidator {

    private KeyValidator() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    public static @NotNull String notEmpty(@Nullable String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("key must not be null or empty.");
        }

        return key;
    }
}