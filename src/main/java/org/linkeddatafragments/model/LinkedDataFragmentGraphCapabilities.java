package org.linkeddatafragments.model;


import org.apache.jena.graph.Capabilities;

public class LinkedDataFragmentGraphCapabilities implements Capabilities {
    @Override
    public boolean sizeAccurate() {
        return true;
    }

    @Override
    public boolean addAllowed() {
        return addAllowed(false);
    }

    public boolean addAllowed(boolean every) {
        return every;
    }

    @Override
    public boolean deleteAllowed() {
        return deleteAllowed(false);
    }

    public boolean deleteAllowed(boolean every) {
        return every;
    }

    public boolean canBeEmpty() {
        return false;
    }

    public boolean iteratorRemoveAllowed() {
        return false;
    }

    public boolean findContractSafe() {
        return true;
    }

    @Override
    public boolean handlesLiteralTyping() {
        return true;
    }
}
