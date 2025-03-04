import java.util.Random;

public class Main {                                                                            //exercise 1
     public static void main(String[] args){
         Rectangle[] rectangles = new Rectangle[10];
         Random rand = new Random();

         for(int i=0;i<rectangles.length;i++){
             double length=1+rand.nextInt(10);
             double width=1+rand.nextInt(10);
             rectangles[i]=new Rectangle(length,width);
         }
         double totalArea=0;
         System.out.println("Generated rectangles:");
         for(int i=0;i<rectangles.length;i++){
             Rectangle rect = rectangles[i];
             System.out.println(" Rectangle "+(i+1)+" Length "+rect.getLength()+" Width "+rect.getWidth()+" perimeter "+rect.perimeter()+" area "+rect.area());
             totalArea += rect.area();
         }
         System.out.println("Total area of all rectangles=  "+totalArea);
    }
}