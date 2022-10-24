
public class LinkedBinaryTreeNode<E> implements BinaryTreeNode<E> {
    protected E data;
    protected LinkedBinaryTreeNode<E> parent = null;
    protected LinkedBinaryTreeNode<E> left = null;
    protected LinkedBinaryTreeNode<E> right = null;

    /**
     * Constructs a node as the root of its own one-element tree.
     * This is the only public constructor.  The only trees that
     * clients can make directly are simple one-element trees.
     */
    public LinkedBinaryTreeNode(E data) {
        this.data = data;
    }

    /**
     * Returns the data stored in this node.
     */
    public E getData() {
        return data;
    }

    /**
     * Modifies the data stored in this node.
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Returns the parent of this node, or null if this node is a root.
     */
    public BinaryTreeNode<E> getParent() {
      return parent;
    }

    /**
     * Returns the left child of this node, or null if it does
     * not have one.
     */
    public BinaryTreeNode<E> getLeft() {
      return left;
    }


    /**
     * Returns the right child of this node, or null if it does
     * not have one.
     */
    public BinaryTreeNode<E> getRight() {
      return right;
    }

}


