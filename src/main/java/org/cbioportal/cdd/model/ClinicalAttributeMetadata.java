/*
 * Copyright (c) 2018 Memorial Sloan-Kettering Cancer Center.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF MERCHANTABILITY OR FITNESS
 * FOR A PARTICULAR PURPOSE. The software and documentation provided hereunder
 * is on an "as is" basis, and Memorial Sloan-Kettering Cancer Center has no
 * obligations to provide maintenance, support, updates, enhancements or
 * modifications. In no event shall Memorial Sloan-Kettering Cancer Center be
 * liable to any party for direct, indirect, special, incidental or
 * consequential damages, including lost profits, arising out of the use of this
 * software and its documentation, even if Memorial Sloan-Kettering Cancer
 * Center has been advised of the possibility of such damage.
 */

package org.cbioportal.cdd.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;

import java.util.*;

/**
 * @author Avery Wang, Manda Wilson 
 */
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({
    "column_header",
    "display_name",
    "description",
    "datatype",
    "attribute_type",
    "priority",
})
public class ClinicalAttributeMetadata {

    @ApiModelProperty(value = "The column header")
    @JsonProperty("column_header")
    private String columnHeader;
    @ApiModelProperty(value = "The name to be displayed in the cBio Portal")
    @JsonProperty("display_name")
    private String displayName;
    @ApiModelProperty(value = "The description")
    @JsonProperty("description")
    private String description;
    @ApiModelProperty(value = "The data type", allowableValues = "NUMBER,STRING")
    @JsonProperty("datatype")
    private String datatype;
    @ApiModelProperty(value = "The attribute type", allowableValues = "PATIENT,SAMPLE")
    @JsonProperty("attribute_type")
    private String attributeType;
    @ApiModelProperty(value = "Higher priority attributes are given prominence in the cBio Portal, zero priority attributes are hidden")
    @JsonProperty("priority")
    private String priority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
    * No args constructor for use in serialization
    *
    */
    private ClinicalAttributeMetadata() {}


    /**
    *
    * @param columnHeader
    * @param priority
    * @param attributeType
    * @param datatype
    * @param displayName
    * @param description
    */
    public ClinicalAttributeMetadata(String columnHeader, String displayName, String description, String datatype, String attributeType, String priority) {
        this.columnHeader = columnHeader;
        this.displayName = displayName;
        this.description = description;
        this.datatype = datatype;
        this.attributeType = attributeType;
        this.priority = priority;
    }

    /**
    *
    * @return
    * The columnHeader
    */
    @JsonProperty("column_header")
    public String getColumnHeader() {
        return columnHeader;
    }

    /**
    *
    * @param normalizedColumnHeader
    * The normalized_column_header
    */
    @JsonProperty("normalized_column_header")
    public void setNormalizedColumnHeader(String normalizedColumnHeader) {
        this.columnHeader = normalizedColumnHeader;
    }

    /**
    *
    * @return
    * The displayName
    */
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    /**
    *
    * @param displayName
    * The display_name
    */
    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
    *
    * @return
    * The description
    */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
    *
    * @param description
    * The description
    */
    @JsonProperty("description")
    public void setDescriptions(String description) {
        this.description = description;
    }

    /**
    *
    * @return
    * The datatype
    */
    @JsonProperty("datatype")
    public String getDatatype() {
        return datatype;
    }

    /**
    *
    * @param datatype
    * The datatype
    */
    @JsonProperty("datatype")
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    *
    * @return
    * The attributeType
    */
    @JsonProperty("attribute_type")
    public String getAttributeType() {
        return attributeType;
    }

    /**
    *
    * @param attributeType
    * The attribute_type
    */
    @JsonProperty("attribute_type")
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
    *
    * @return
    * The priority
    */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
    *
    * @param priority
    * The priority
    */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
