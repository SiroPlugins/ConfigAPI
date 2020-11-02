package com.github.siroshun09.configapi.common.yaml;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

/**
 * An abstract class that implements {@link Yaml}.
 */
public abstract class AbstractYaml implements Yaml {

    protected final Path filePath;

    protected AbstractYaml(@NotNull Path filePath) {
        this.filePath = filePath;
    }
}
