import java.util.Comparator;  

/**
 * A simple AVL tree class.  
 */  
public class AVLTree<E> extends BinarySearchTree<E> {

    /**
     * Constructs an empty AVL that only accepts Comparables.
     */
    public AVLTree() {
        this(null);
    }

    /**
     * Constructs an AVL that orders its items according 
     * to the given comparator.
     */
    public AVLTree(Comparator<E> c){
        super(c);
    }

}


