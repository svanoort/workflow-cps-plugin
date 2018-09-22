package org.jenkinsci.plugins.workflow.cps;

import hudson.ExtensionPoint;
import hudson.model.Descriptor;
import org.jenkinsci.plugins.workflow.steps.StepDescriptor;

import java.io.Serializable;

/**
 * @author Sam Van Oort
 */
public class StepPermissions implements ExtensionPoint {

    /** */
    public static class StepExecutionNotPermittedException extends Exception implements Serializable {

        String functionName;
        StepPermissions

        public StepExecutionNotPermittedException(String functionName, StepPermissions blockingPermissionsCheck) {

        }
    }

    public abstract void isAllowed(String functionName) throws  StepExecutionNotPermittedException;

    public abstract class StepPermissionsDescriptor extends Descriptor<StepPermissions> {

    }
}
