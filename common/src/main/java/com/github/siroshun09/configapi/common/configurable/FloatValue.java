/*
 *     Copyright 2020 Siroshun09
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

package com.github.siroshun09.configapi.common.configurable;

import com.github.siroshun09.configapi.common.Configuration;
import org.jetbrains.annotations.NotNull;

/**
 * A class that represents the value that can be set with {@link Float} and their keys.
 */
public class FloatValue extends AbstractConfigurableValue<Float> {

    FloatValue(@NotNull String key, @NotNull Float def) {
        super(key, def);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public @NotNull Float getValueOrNull(@NotNull Configuration configuration) {
        return (float) configuration.getDouble(getKey(), getDefault());
    }
}