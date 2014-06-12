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
package eu.artist.postmigration.nfrvt.lang.gml;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.containers.IAllContainersState.Provider;

import eu.artist.postmigration.nfrvt.lang.common.ARTISTCommonConverters;
import eu.artist.postmigration.nfrvt.lang.common.ARTISTQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class GMLRuntimeModule extends eu.artist.postmigration.nfrvt.lang.gml.AbstractGMLRuntimeModule {

////	@Override
////	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
////		return GMLImportUriGlobalScopeProvider.class;
////	}
//	
//	@Override
//	public Class<? extends XtextResourceSet> bindXtextResourceSet() {
//		return ARTISTResourceSet.class;
//	}
	
	@Override
	public Class<? extends Manager> bindIContainer$Manager() {
		return super.bindIContainer$Manager();
	}
	
	@Override
	public Class<? extends Provider> bindIAllContainersState$Provider() {
		return super.bindIAllContainersState$Provider();
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return ARTISTCommonConverters.class;
	}
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ARTISTQualifiedNameProvider.class;
	}
	
//	@Override
//	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
//		return ImportUriGlobalScopeProvider.class;
//	}
}
