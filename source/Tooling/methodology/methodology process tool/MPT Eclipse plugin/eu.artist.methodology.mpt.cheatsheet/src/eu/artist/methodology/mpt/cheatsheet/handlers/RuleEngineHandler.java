/*******************************************************************************
 *  Copyright (c) 2014 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *  
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli
 *******************************************************************************/
package eu.artist.methodology.mpt.cheatsheet.handlers;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import eu.artist.methodology.mpt.cheatsheet.rules.RulesVariable;
import eu.artist.methodology.mpt.model.GlobalVariable;
import eu.artist.methodology.mpt.model.Result;
import eu.artist.methodology.mpt.rule.api.RuleEngine;
import eu.artist.premigration.tft.tft.views.MigrationGoalsView;

public class RuleEngineHandler extends AbstractHandler {
	public RuleEngineHandler() {
	
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
	try {
		
		Bundle bundle = Platform.getBundle("eu.artist.methodology.mpt.cheatsheet");
		URL rulesFileURL = bundle.getEntry("resources/RuleSet_1.drl");
		
		IFile ifile = null;
		try {
		  ifile = MigrationGoalsView.xmlFile;
		} catch (Exception exc) {
			//return "error code 1: " + exc.getMessage();
			return "error";
		}
		
		if (ifile == null) {
			
			System.out.println("IFile is null.");
			//return "error code 2: selected file does not reside in the workspace" ;
			return "error";
			
		} else {
		
			File mgFile = null, rulesFile = null;
			try {

				mgFile = ifile.getRawLocation().makeAbsolute().toFile();
				
				URL resolvedFileURL = FileLocator.toFileURL(rulesFileURL);
				URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
				rulesFile = new File(resolvedURI);
						   
				//rulesFile = new File(FileLocator.resolve(rulesFileURL).toURI());
			} catch (URISyntaxException e1) {
				e1.printStackTrace();
				//return "error code 3: " + e1.getMessage();
				return "error";
			} catch (IOException e1) {
				e1.printStackTrace();
				//return "error code 4: " + e1.getMessage();
				return "error";
			} catch (Exception e1) {
				e1.printStackTrace();
				//return "error code 5: " + e1.getMessage();
				return "error";
			}

			RuleEngine.INSTANCE.loadMATReport(mgFile);
			RuleEngine.INSTANCE.setRuleFile(rulesFile);
		
			GlobalVariable r_variable = new GlobalVariable("rulesVariable", new RulesVariable());
			List<GlobalVariable> variables = new ArrayList<GlobalVariable>();
			variables.add(r_variable);
		
			RuleEngine.INSTANCE.fireRules(variables);
			Result result = RuleEngine.INSTANCE.getResult();
		
			System.out.println("Result: " + result.getStringResult());
			//System.out.println(((RulesVariable)r_variable.getVariable()).getRuleString());
			System.out.println(RulesVariable.rules);
			
			//ArrayList <String> rules_array = ((RulesVariable) r_variable.getVariable()).getRuleString();
			//ArrayList <String> rules_array = RulesVariable.rules;
			
			//is_rule_satisfied = ((Boolean) result.getBooleanResult()).toString();
			//return rules_array.size();
			return "pass";
		}
		
	} catch (Exception e) {
			e.printStackTrace();
			//return "error code 6: " + e.getMessage();
			return "error";
	}		
	
  }
}