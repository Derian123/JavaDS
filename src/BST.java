/**
 * Created by derianescobar on 11/6/17.
 */
public class BST {

    BSTNode root;

    public void add(int data){

        BSTNode nodeToAdd = new BSTNode(data);

        //If the tree is empty
        if(root == null){

            root = nodeToAdd;
        }

        BSTNode traversingNode = root;

        traverseAndAddNode(root, nodeToAdd);

    }

    public void traverseAndAddNode(BSTNode node, BSTNode nodeToAdd){

        if(nodeToAdd.data < node.data){

            if(node.leftChild == null){

                nodeToAdd.parent = node;
                node.leftChild = nodeToAdd;

            }
            else {
                traverseAndAddNode(node.leftChild, nodeToAdd);

            }
        }

        else if(nodeToAdd.data> node.data){

            if(node.rightChild == null){

                nodeToAdd.parent = node;
                node.rightChild = nodeToAdd;
            }

            else {

                traverseAndAddNode(node.rightChild, nodeToAdd);
            }
        }


    }

    public void inOrderTraverse(){

        //inorder

        BSTNode nodeToTraverse = root;

        if(root != null) {

            if (nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null) {

                System.out.println(nodeToTraverse.data);

            }else{

                inOrderTraversal(nodeToTraverse);

            }
        }

    }

    public void preTraverse(){

        //preorder traversal


        BSTNode nodeToTraverse = root;

        if(root != null) {

            if (nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null) {

                System.out.println(nodeToTraverse.data);

            } else {

               preOrderTraversal(nodeToTraverse);

            }
        }

    }

    public void postTraverse(){


        //postorder traversal



        BSTNode nodeToTraverse = root;

        if(root != null) {

            if (nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null) {

                System.out.println(nodeToTraverse.data);

            } else {

                postOrderTraversal(nodeToTraverse);

            }
        }

    }



    public void preOrderTraversal(BSTNode node){

        System.out.println(node.data);

        if(node.leftChild != null){

            preOrderTraversal(node.leftChild);
        }



        if(node.rightChild != null){

            preOrderTraversal(node.rightChild);
        }

    }


    public void inOrderTraversal(BSTNode node){

        if(node.leftChild != null){

            inOrderTraversal(node.leftChild);
        }

        System.out.println(node.data);

        if(node.rightChild != null){

            inOrderTraversal(node.rightChild);
        }

    }

    public void postOrderTraversal(BSTNode node){

        if(node.leftChild != null){

            postOrderTraversal(node.leftChild);
        }

        if(node.rightChild != null){

            postOrderTraversal(node.rightChild);
        }

        System.out.println(node.data);
    }

    public boolean delete(int data){

        BSTNode nodeToBeDeleted = find(data);

        if (nodeToBeDeleted.leftChild == null && nodeToBeDeleted.rightChild == null) {

            deleteNodeWithNoChildren(nodeToBeDeleted);

        }

        else if(nodeToBeDeleted.leftChild != null && nodeToBeDeleted.rightChild != null){

            deleteNodeWithTwoChildren(nodeToBeDeleted);
        }

        //left child will be deleted
        else if(nodeToBeDeleted.leftChild != null){

            deleteNodeWithOneChild(nodeToBeDeleted);


        }
        //right child will be deleted
        else if(nodeToBeDeleted.rightChild != null){

            deleteNodeWithOneChild(nodeToBeDeleted);

        }


        return false;





    }


    public void deleteNodeWithNoChildren(BSTNode nodeToBeDeleted) {

        //node has no children
        if (nodeToBeDeleted != null) {

            //check if the node to be deleted is the right or left child of the parent of the node
            if (nodeToBeDeleted.parent.leftChild == nodeToBeDeleted) {

                nodeToBeDeleted.parent.leftChild = null;
            } else if (nodeToBeDeleted.parent.rightChild == nodeToBeDeleted) {

                nodeToBeDeleted.parent.rightChild = null;
            }
        }
    }

    public void deleteNodeWithOneChild(BSTNode nodeToBeDeleted){

        if(nodeToBeDeleted.parent.leftChild == nodeToBeDeleted){

            if(nodeToBeDeleted.leftChild != null) {
                nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.leftChild;
            }
            else if(nodeToBeDeleted.rightChild != null){

                nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.rightChild;

            }
        }
        else if(nodeToBeDeleted.parent.rightChild == nodeToBeDeleted){

            if(nodeToBeDeleted.leftChild != null) {
                nodeToBeDeleted.parent.rightChild = nodeToBeDeleted.leftChild;
            }
            else if(nodeToBeDeleted.rightChild != null){

                nodeToBeDeleted.parent.rightChild = nodeToBeDeleted.rightChild;

            }
        }


    }

    public void deleteNodeWithTwoChildren(BSTNode nodeToBeDeleted){

        BSTNode minNode = minLeftTraverseal(nodeToBeDeleted.rightChild);

        deleteNodeWithOneChild(minNode);

        minNode.parent = nodeToBeDeleted.parent;
        minNode.leftChild = nodeToBeDeleted.leftChild;
        minNode.rightChild = nodeToBeDeleted.rightChild;

        if(nodeToBeDeleted.parent == null){

            root = minNode;
        }

        else {
            if (nodeToBeDeleted.parent.leftChild == nodeToBeDeleted) {

                nodeToBeDeleted.parent.leftChild = minNode;


            } else if (nodeToBeDeleted.parent.rightChild == nodeToBeDeleted) {

                nodeToBeDeleted.parent.rightChild = minNode;

            }
        }


    }
    public BSTNode minLeftTraverseal(BSTNode node){


        if(node.leftChild == null){

            return node;
        }

        return minLeftTraverseal(node.leftChild);
    }

    public BSTNode find(int data){

        if(root != null){

            return findNode(root, new BSTNode(data));
        }

        return null;
    }

    public BSTNode findNode(BSTNode search, BSTNode node){

        if(search == null){

            return null;
        }

        if(search.data == node.data){

            return search;
        }

        else{

            BSTNode returnNode = findNode(search.leftChild, node);

            if(returnNode == null){

                returnNode = findNode(search.rightChild, node);
            }

            return returnNode;
        }
    }

    public static void main(String[] args) {

        BST bst = new BST();

        bst.add(100);
        bst.add(50);
        bst.add(175);
        bst.add(10);
        bst.add(75);


        bst.delete(10);

        bst.postTraverse();

    }
}
