class Box1 {
    int width;
    int height;
    int depth;
    float volume (){
        return width*height*depth;
    }
}
public class Box
{
public static void main(String[] args) {
    Box1 b1=new Box1();
    Box1 b2=new Box1();
    b1.width=45;
    b1.height=68;
    b1.depth=86;
    b2.width=6;
    b2.height=50;
    b2.depth=37;
    float vol1=b1.volume();
     System.out.println(vol1);
     float vol2=b2.volume();
     System.out.println(vol2);

}
}








