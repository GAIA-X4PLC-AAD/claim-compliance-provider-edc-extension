/*
 *  Copyright (c) 2024 msg group.
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *      msg group - initial implementation
 */
rootProject.name = "Claim-Compliance-Provider-EDC-Extension"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
    }
}

// modules ------------------------------------------------------------------------
include(":CcpService")