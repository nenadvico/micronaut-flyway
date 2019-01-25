/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.configuration.dbmigration.flyway.event;

import io.micronaut.configuration.dbmigration.flyway.FlywayConfigurationProperties;
import io.micronaut.context.event.ApplicationEvent;

/**
 * Fired when a the schema has been cleaned.
 *
 * @author Iván López
 * @since 1.0.0
 */
public class SchemaCleanedEvent extends ApplicationEvent {

    /**
     * @param config The Flyway configuration that was cleaned
     */
    public SchemaCleanedEvent(FlywayConfigurationProperties config) {
        super(config);
    }
}
