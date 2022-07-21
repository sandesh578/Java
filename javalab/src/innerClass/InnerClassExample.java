package innerClass;

class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }


    public void putTreeTopper(String color)
    {
        TreeTopper treetopper=new TreeTopper(color);
        treetopper.sparkle();
    }
    class TreeTopper {

        private String color;        

        public TreeTopper(String color) {
            this.color = color;
        }

        public void sparkle()
        {
           System.out.println("Sparkling "+this.color+" tree topper looks stunning with "+ChristmasTree.this.color+" Christmas tree!"); 
        }
        //accessing using class name
    }
}


public class InnerClassExample {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}
