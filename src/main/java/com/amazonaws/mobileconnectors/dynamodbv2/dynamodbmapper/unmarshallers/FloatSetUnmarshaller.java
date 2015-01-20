/*
 * Copyright 2014-2015 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.unmarshallers;

import java.util.HashSet;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * An unmarshaller that unmarshals DynamoDB NumberSets into sets of Java
 * {@code Float}s.
 */
public class FloatSetUnmarshaller extends NSUnmarshaller {

    private static final FloatSetUnmarshaller INSTANCE =
            new FloatSetUnmarshaller();

    public static FloatSetUnmarshaller instance() {
        return INSTANCE;
    }

    private FloatSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        Set<Float> result = new HashSet<Float>();
        for (String s : value.getNS()) {
            result.add(Float.valueOf(s));
        }
        return result;
    }
}
