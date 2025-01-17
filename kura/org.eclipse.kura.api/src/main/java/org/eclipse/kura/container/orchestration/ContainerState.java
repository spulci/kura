/*******************************************************************************
 * Copyright (c) 2022 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Eurotech
 *******************************************************************************/

package org.eclipse.kura.container.orchestration;

/**
 * Enum representing the possible container states as tracked by the orchestrator
 *
 * @since 2.3
 */
public enum ContainerState {
    STARTING,
    INSTALLED,
    ACTIVE,
    FAILED,
    STOPPING;
}
