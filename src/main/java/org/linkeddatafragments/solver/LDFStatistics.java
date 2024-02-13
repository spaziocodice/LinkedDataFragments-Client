package org.linkeddatafragments.solver;

import org.apache.jena.graph.Node;
import org.apache.jena.graph.Triple;
import org.linkeddatafragments.model.LinkedDataFragmentGraph;


public class LDFStatistics {

    private final LinkedDataFragmentGraph ldfG;

    public LDFStatistics(LinkedDataFragmentGraph graph) {
        this.ldfG = graph;
    }

    public long getStatistic(Node subject, Node predicate, Node object) {
        return ldfG.getCount(Triple.createMatch(subject, predicate, object));
    }

}