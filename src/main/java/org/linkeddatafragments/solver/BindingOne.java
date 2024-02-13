package org.linkeddatafragments.solver;

import org.apache.jena.atlas.iterator.Iter;
import org.apache.jena.graph.Node;
import org.apache.jena.sparql.core.Var;
import org.apache.jena.sparql.engine.binding.Binding;

import java.util.Iterator;
import java.util.function.BiConsumer;

public class BindingOne implements Binding {
    private final Var var;
    private final Node value;

    public BindingOne(Var var, Node node) {
        this.var = var;
        this.value = node;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Iterate over all the names of variables.
     */
    @Override
    public Iterator<Var> vars() {
        return Iter.singleton(var);
    }

    @Override
    public void forEach(BiConsumer<Var, Node> action) {
        action.accept(var, value);
    }

    @Override
    public boolean contains(Var n) {
        return var.equals(n);
    }

    @Override
    public Node get(String varName) {
        return Binding.super.get(varName);
    }

    @Override
    public boolean contains(String varName) {
        return Binding.super.contains(varName);
    }

    @Override
    public Node get(Var v) {
        if (v.equals(var))
            return value;
        return null;
    }
}
