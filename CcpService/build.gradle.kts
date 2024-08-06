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

plugins {
    id("application")
    java
}

dependencies {
    val edcVersion: String by project
    val retrofitVersion: String by project
    val mockitoVersion: String by project
    val assertjVersion: String by project
    val junitVersion: String by project

    implementation("org.eclipse.edc:control-plane-core:$edcVersion")
    implementation("org.eclipse.edc:control-plane-spi:$edcVersion")
    implementation("org.eclipse.edc:api-core:$edcVersion")
    implementation("org.eclipse.edc:monitor-jdk-logger:$edcVersion")
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-jackson:$retrofitVersion")

    // Test dependencies
    testImplementation("org.mockito:mockito-core:$mockitoVersion")
    testImplementation("org.assertj:assertj-core:$assertjVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.test {
    useJUnitPlatform()
}