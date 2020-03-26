package hafta04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class LabBinarySearchTree<T extends Comparable<T>> extends BinarySearchTree<T> {
    public LabBinarySearchTree(){
        //Bu metodu değiştirmeyin
    }
    public LabBinarySearchTree(BTNode<T> root) {
        //Bu metodu değiştirmeyin
        super(root);
    }

    
    @Override
    protected Object clone() throws CloneNotSupportedException {
       
        BTNode root= getRoot();
        if(getRoot()==null){
            
            return null; 
        }
        else{
            
            if(root.left!=null){
                
            }
        }
        return null;
    }

    @Override
    public BTNode<T> successor(T value) {
        BTNode root = find(getRoot(),value);
        if(root==null)
            return null;
        else if(root.right!=null)
        {
            root=root.right;
        
            if(root.left==null)
                return root;
            else
            {
                while(root.left!=null){    
                        root=root.left;
                }
                return root;
            }      
        }
        return null;
    }

    @Override
    public BTNode<T> predecessor(T value) {
         
        BTNode root = find(getRoot(),value);
        if(root==null)
            return null;
        else if(root.left!=null)
        {
            root=root.left;
        
            if(root.right==null)
                return root;
            else
            {
                while(root.right!=null){    
                        root=root.right;
                }
                return root;
            }      
        }
        return null;
    }

    @Override
    public BTNode<T> findParent(BTNode<T> node) {
        BTNode root= getRoot();
        
        return null;
    }
/*
    @Override
    public Hafta04.BTNode<T> findParent(Hafta04.BTNode<T> node) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

}


    

