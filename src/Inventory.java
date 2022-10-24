import java.io.*;
import java.util.Scanner;

/**
 * This program creates a BST/AVL based inventory database from a file, the file
 * is a command line argument.
 *
 * Useage:
 *   java program -[a|b] input_name_file output_name_file
 *
 * @author Nirre Pluf {@literal }
 * @version 0.2, Oct. 24, 2022
 */

public class Inventory {
    public static void main(String[] args) {
        int updates = 0;  
        BinarySearchTree<String> tree = null;  

        if(!argsOK(args))
            System.exit(1);

        /* use the list specified by the user... */
        if(args[0].equals("-a")) {
            tree = new AVLTree<String>();  
        }
        else {
            tree = new BinarySearchTree<String>();  
        }


        final long startTime = System.currentTimeMillis();
        updates = readInventoryFile(args[1], tree);
        displayInventoryInfo(args[2], tree, updates);
        final long endTime = System.currentTimeMillis();

        /* just subtract the two times */
        long difference = endTime - startTime;
        System.out.println("Time to complete: " + difference + " msec");
    }  


    /**
     *  This method the inventory file and stores in a tree
     *
     *  @param  inFile is the inventory filename (command line argument)
     *  @param  tree is the inventory database (a BST or AVL)
     *  @return the number of database updates made
     */
    private static int readInventoryFile(String inFile, BinarySearchTree<String> tree) {
        int numUpdates = 0;

        return numUpdates;
    }


    /**
     *  This method displays the inventory database information (screen and file) 
     *
     *  @param  outFile is the output filename (command line argument)
     *  @param  tree is the inventory database (a BST or AVL)
     *  @param  updates is the number of database updates made
     */
     private static void displayInventoryInfo(String outFile, BinarySearchTree<String> tree, int updates) {

    }


   /**
     * Checks the command line args are correct (1 string)
     *
     * @param args String[] first is inventory file
     * @return true if everything is OK, false otherwise
     */
    private static boolean argsOK(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: java program -[a|b] inventoryFile outputFile ");
            System.out.println("  -[a|b]         tree type (avl, bst) ");
            System.out.println("  inventoryFile  file containing inventory ");
            System.out.println("  outputFile     file to write tree string ");
            return false;
        }
        return true;
    }

}  


