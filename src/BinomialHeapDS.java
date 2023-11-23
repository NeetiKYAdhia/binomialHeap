public class BinomialHeapDS {

    public int value;
    public BinomialHeapDS parent;
    public BinomialHeapDS child;
    public BinomialHeapDS sibling;
    public int numOfChilds;

    public BinomialHeapDS(int v) {
        value = v;
        parent = null;
        child = null;
        sibling = null;
        numOfChilds = 0;
    }

    @Override
    public String toString() {
        return "key = " + value + ", has " + numOfChilds + " children";
    }

    public String printTree(int depth) {
        String result = "";
        for (int i = 0; i < depth; i++) {
            result += "  ";
        }
        result += toString() + "\n";
        BinomialHeapDS x = child;
        // goes recursively through every child of a given node
        while (x != null) {
            result += x.printTree(depth + 1);
            x = x.sibling;
        }

        return result;
    }
}
