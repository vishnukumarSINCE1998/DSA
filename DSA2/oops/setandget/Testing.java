package oops.setandget;
class Tree{
    private String name;
    private int height;


    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setHeight(int r){
        height=r;
    }
    public int getHeight(){
        return height;
    }
}
public class Testing {
    public static void main (String args[]){
    Tree t1=new Tree();
    t1.setName("coconuttree");
    t1.setHeight(102);

    System.out.println(t1.getName());
    System.out.println(t1.getHeight());

    }
}
