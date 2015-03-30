package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplication pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ServiceApplicationProcessor implements IMatchProcessor<ServiceApplicationMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSub the value of pattern parameter sub in the currently processed match
   * @param pSup the value of pattern parameter sup in the currently processed match
   * 
   */
  public abstract void process(final org.eclipse.uml2.uml.Class pSub, final org.eclipse.uml2.uml.Class pSup);
  
  @Override
  public void process(final ServiceApplicationMatch match) {
    process(match.getSub(), match.getSup());
    
  }
}
