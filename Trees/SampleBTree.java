public class SampleBTree {
    public static void main(String sp[])
    {
        node root=new node(12);
      node obj=new node(10);
      root.left=obj;
      obj.left =new node(20);
      obj.right=new node(30);
      obj.right.right=new node(50);
      obj.right.left=new node(40);
      obj.printInorder(root);
    }
}
// Creatiion of a simple binary tree
class node{
   static int Key;
    node left;
    node right;
    node(int key)
    {
        node.Key=key;
    }
    void printInorder(node root)
    {
       if(root!=null)
       {
          printInorder(root.left);
          System.out.print(node.Key+" ");
          printInorder(root.right);
       }
    }

}
