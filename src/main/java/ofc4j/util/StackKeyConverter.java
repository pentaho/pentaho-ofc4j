/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2026 by Pentaho Canada Inc. : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2030-06-15
 ******************************************************************************/
package ofc4j.util;

import ofc4j.model.elements.StackedBarChart.StackKey;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.path.PathTrackingWriter;

public class StackKeyConverter extends ConverterBase<StackKey> {

	
	@SuppressWarnings("unchecked")
	public boolean canConvert(Class arg0) {
		return StackKey.class.isAssignableFrom(arg0);
	}

	@Override
	public void convert(StackKey o, PathTrackingWriter writer,
			MarshallingContext mc) {
		 writeNode(writer, "text", o.getText());
	        writeNode(writer, "colour", o.getColour());
	        writeNode(writer, "font-size", o.getFontSize());
		
	}

	

}
