class Box {
    double width;
    double height;
    double depth;
    Box() 
    {
        width = 1;
        height = 1;
        depth = 1;
    }
    double volume() 
    {
        return width * height * depth;
    }
}
class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        System.out.println("Volume of the box is: " +myBox.volume());
    }
}