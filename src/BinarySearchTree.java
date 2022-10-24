import java.util.Comparator;

/**
 * A binary search tree class with insertion, removal and lookup.
 * A comparator is used to order the items in the tree.  All tree
 * items must be distinct according to the comparator.  If no comparator
 * is supplied the natural order of tree elements is used.
 */
public class BinarySearchTree<E> {

    /**
     * Root of the tree.
     */
    protected BinaryTreeNode<E> root = null;

    /**
     * Comparator used to order the items in the tree.  If null,
     * the natural order of the items will be used.
     */
    private Comparator<E> comparator;

    /**
     * Constructs an empty BST that can only accept Comparables
     * as items.
     */
    public BinarySearchTree() {
        this(null);
    }

    /**
     * Constructs a BST that orders its items according to the
     * given comparator.
     */
    public BinarySearchTree(Comparator<E> c) {
        comparator = c;
    }

    /**
     * Returns the root of the tree.
     */
    protected BinaryTreeNode getRoot() {
        return root;
    }

    /**
     * Makes the given node the new root of the tree.
     */
    protected void setRoot(BinaryTreeNode<E> node) {
        if (node != null) {
            node.removeFromParent();
        }
        root = node;
    }

}


