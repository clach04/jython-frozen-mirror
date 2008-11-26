// Autogenerated AST node
package org.python.antlr.ast;
import java.util.ArrayList;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.adapter.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class ExtSlice extends sliceType {
    private java.util.List<sliceType> dims;
    public java.util.List<sliceType> getInternalDims() {
        return dims;
    }
    public Object getDims() {
        return new ListWrapper(dims, AstAdapters.sliceAdapter);
    }
    public void setDims(Object dims) {
        this.dims = AstAdapters.to_sliceList(dims);
    }


    private final static String[] fields = new String[] {"dims"};
    public String[] get_fields() { return fields; }

    public ExtSlice() {}
    public ExtSlice(Object dims) {
        setDims(dims);
    }

    public ExtSlice(Token token, java.util.List<sliceType> dims) {
        super(token);
        this.dims = dims;
        if (dims == null) {
            this.dims = new ArrayList<sliceType>();
        }
        for(PythonTree t : this.dims) {
            addChild(t);
        }
    }

    public ExtSlice(Integer ttype, Token token, java.util.List<sliceType> dims)
    {
        super(ttype, token);
        this.dims = dims;
        if (dims == null) {
            this.dims = new ArrayList<sliceType>();
        }
        for(PythonTree t : this.dims) {
            addChild(t);
        }
    }

    public ExtSlice(PythonTree tree, java.util.List<sliceType> dims) {
        super(tree);
        this.dims = dims;
        if (dims == null) {
            this.dims = new ArrayList<sliceType>();
        }
        for(PythonTree t : this.dims) {
            addChild(t);
        }
    }

    public String toString() {
        return "ExtSlice";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("ExtSlice(");
        sb.append("dims=");
        sb.append(dumpThis(dims));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitExtSlice(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (dims != null) {
            for (PythonTree t : dims) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

}
