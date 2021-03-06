/*
* generated by Xtext
*/
package eu.artist.postmigration.nfrvt.lang.gel;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class GELStandaloneSetupGenerated implements ISetup {

	public Injector createInjectorAndDoEMFRegistration() {
		eu.artist.postmigration.nfrvt.lang.common.ARTISTCommonStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new eu.artist.postmigration.nfrvt.lang.gel.GELRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.artist.eu/postmigration/nfrvt/lang/gel/GEL")) {
		EPackage.Registry.INSTANCE.put("http://www.artist.eu/postmigration/nfrvt/lang/gel/GEL", eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("gel", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("gel", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("eval", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("eval", serviceProvider);
		


	}
}
