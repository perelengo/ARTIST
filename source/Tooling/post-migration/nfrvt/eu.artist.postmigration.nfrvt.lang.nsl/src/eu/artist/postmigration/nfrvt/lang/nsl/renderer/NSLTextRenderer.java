/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/*
* generated by Xtext
*/
package eu.artist.postmigration.nfrvt.lang.nsl.renderer;

import eu.artist.postmigration.nfrvt.lang.common.renderer.ARTISTCommonRenderer;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
public class NSLTextRenderer extends ARTISTCommonRenderer {

	protected String render(ParenthesizedArithmeticExpression e) {
		return "(" + doRender(e.getValue()) + ")";
	}
	
	protected String render(QuantitativePropertyExpression e) {
		return e.getValue().getName();
	}
	
	protected String render(Property property) {
		return property.getName() + " (" + property.getDirection().getLiteral() + ")";
	}
}