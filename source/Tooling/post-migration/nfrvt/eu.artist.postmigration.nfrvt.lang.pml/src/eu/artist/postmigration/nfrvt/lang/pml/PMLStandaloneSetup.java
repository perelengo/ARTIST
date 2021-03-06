/*
* generated by Xtext
*/
package eu.artist.postmigration.nfrvt.lang.pml;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PMLStandaloneSetup extends PMLStandaloneSetupGenerated{

	private static Injector injector = null;
	
	public static void doSetup() {
		injector = new PMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public static Injector getInjector() {
		return injector;
	}
}

