/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.configuration.parser;

/**
 * Enumerates elements used by instance management parser.
 * 
 * @author Derek
 */
public interface IInstanceManagementParser {

    // Root element name.
    public static final String ROOT = "instance-management";

    public static enum TopLevelElements {

	/** Persistence configurations */
	PersistenceConfigurations("persistence-configurations"),

	/** Connector configurations */
	ConnectorConfigurations("connector-configurations");

	/** Event code */
	private String localName;

	private TopLevelElements(String localName) {
	    this.localName = localName;
	}

	public static TopLevelElements getByLocalName(String localName) {
	    for (TopLevelElements value : TopLevelElements.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }

    public static enum PersistenceConfigurationsElements {

	/** MongoDB configuration elements */
	MongoConfigurations("mongodb-configurations");

	/** Event code */
	private String localName;

	private PersistenceConfigurationsElements(String localName) {
	    this.localName = localName;
	}

	public static PersistenceConfigurationsElements getByLocalName(String localName) {
	    for (PersistenceConfigurationsElements value : PersistenceConfigurationsElements.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }

    public static enum MongoDbElements {

	/** Default MongoDB configuration */
	DefaultMongoConfiguration("default-mongodb-configuration"),

	/** Alternate MongoDB configuration */
	AlternateMongoConfiguration("alternate-mongodb-configuration");

	/** Event code */
	private String localName;

	private MongoDbElements(String localName) {
	    this.localName = localName;
	}

	public static MongoDbElements getByLocalName(String localName) {
	    for (MongoDbElements value : MongoDbElements.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }

    public static enum ConnectorConfigurationsElements {

	/** Solr configuration elements */
	SolrConfigurations("solr-configurations");

	/** Event code */
	private String localName;

	private ConnectorConfigurationsElements(String localName) {
	    this.localName = localName;
	}

	public static ConnectorConfigurationsElements getByLocalName(String localName) {
	    for (ConnectorConfigurationsElements value : ConnectorConfigurationsElements.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }
}