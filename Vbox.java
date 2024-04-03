class Vbox {
    double width,height,depth,v;
    Vbox() 
    {
        width = 12;
        height = 13;
        depth = 14;
    }
    void volume() 
    {
        v= width * height * depth;
        System.out.println("Volume of the box is: " +v);
    }
      public static void main(String[] args) {
        Vbox myBox = new Vbox();
        myBox.volume();
    }
}