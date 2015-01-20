/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sqs.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Dead Letter Source Queues Request Marshaller
 */
public class ListDeadLetterSourceQueuesRequestMarshaller implements Marshaller<Request<ListDeadLetterSourceQueuesRequest>, ListDeadLetterSourceQueuesRequest> {

    public Request<ListDeadLetterSourceQueuesRequest> marshall(ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest) {

        if (listDeadLetterSourceQueuesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListDeadLetterSourceQueuesRequest> request = new DefaultRequest<ListDeadLetterSourceQueuesRequest>(listDeadLetterSourceQueuesRequest, "AmazonSQS");
        request.addParameter("Action", "ListDeadLetterSourceQueues");
        request.addParameter("Version", "2012-11-05");

        if (listDeadLetterSourceQueuesRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(listDeadLetterSourceQueuesRequest.getQueueUrl()));
        }

        return request;
    }
}
