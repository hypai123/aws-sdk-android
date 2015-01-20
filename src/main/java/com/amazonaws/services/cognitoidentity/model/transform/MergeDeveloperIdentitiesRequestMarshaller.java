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
package com.amazonaws.services.cognitoidentity.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Merge Developer Identities Request Marshaller
 */
public class MergeDeveloperIdentitiesRequestMarshaller implements Marshaller<Request<MergeDeveloperIdentitiesRequest>, MergeDeveloperIdentitiesRequest> {

    public Request<MergeDeveloperIdentitiesRequest> marshall(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) {
    if (mergeDeveloperIdentitiesRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<MergeDeveloperIdentitiesRequest> request = new DefaultRequest<MergeDeveloperIdentitiesRequest>(mergeDeveloperIdentitiesRequest, "AmazonCognitoIdentity");
        String target = "AWSCognitoIdentityService.MergeDeveloperIdentities";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (mergeDeveloperIdentitiesRequest.getSourceUserIdentifier() != null) {
                jsonWriter.key("SourceUserIdentifier").value(mergeDeveloperIdentitiesRequest.getSourceUserIdentifier());
            }
            if (mergeDeveloperIdentitiesRequest.getDestinationUserIdentifier() != null) {
                jsonWriter.key("DestinationUserIdentifier").value(mergeDeveloperIdentitiesRequest.getDestinationUserIdentifier());
            }
            if (mergeDeveloperIdentitiesRequest.getDeveloperProviderName() != null) {
                jsonWriter.key("DeveloperProviderName").value(mergeDeveloperIdentitiesRequest.getDeveloperProviderName());
            }
            if (mergeDeveloperIdentitiesRequest.getIdentityPoolId() != null) {
                jsonWriter.key("IdentityPoolId").value(mergeDeveloperIdentitiesRequest.getIdentityPoolId());
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
