package com.chapter5.ricksGuitars.cohesivespec;

import java.util.*;

public class InstrumentSpec {
	private Map properties;

	public InstrumentSpec(Map properties) {
		if (properties == null) {
			this.properties = new HashMap();
		} else {
			this.properties = new HashMap(properties);
		}
	}

	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}

	public Map getProperties() {
		return properties;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext();) {
			String propertyName = (String) i.next();
			if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
				return false;
			}
		}
		return true;
	}
}
