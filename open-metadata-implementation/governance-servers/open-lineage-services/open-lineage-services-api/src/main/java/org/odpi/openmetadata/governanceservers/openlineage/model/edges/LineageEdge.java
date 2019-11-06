/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.governanceservers.openlineage.model.edges;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

@JsonAutoDetect(getterVisibility = PUBLIC_ONLY, setterVisibility = PUBLIC_ONLY, fieldVisibility = NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "class"
)
public class LineageEdge {

    protected String edgeType;
    protected String sourceNodeID;
    protected String destinationNodeID;

    public LineageEdge(String edgeType, String sourceNodeID, String destinationNodeID) {
        this.edgeType = edgeType;
        this.sourceNodeID = sourceNodeID;
        this.destinationNodeID = destinationNodeID;
    }

    public String getEdgeType() {
        return edgeType;
    }

    public String getSourceNodeID() {
        return sourceNodeID;
    }

    public String getDestinationNodeID() {
        return destinationNodeID;
    }


}