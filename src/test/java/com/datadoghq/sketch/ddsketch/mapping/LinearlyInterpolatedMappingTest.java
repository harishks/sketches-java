/* Unless explicitly stated otherwise all files in this repository are licensed under the Apache License 2.0.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019 Datadog, Inc.
 */

package com.datadoghq.sketch.ddsketch.mapping;

class LinearlyInterpolatedMappingTest extends IndexMappingTest {

    @Override
    IndexMapping getMapping(double relativeAccuracy) {
        return new LinearlyInterpolatedMapping(relativeAccuracy);
    }
}