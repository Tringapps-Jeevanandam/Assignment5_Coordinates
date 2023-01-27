package je;

import java.util.*;

class point1 implements Cloneable {
    float x1;
    float x2;
    float y1;
    float y2;
    point1(float x1,float x2,float y1,float y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    boolean equals(){
        if((x1==x2) && (y1==y2)){
             return true;
        }
        else {
            return false;
        }
    }
    public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
        }  
    
}

public class point{
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        System.out.println("Enter x2 and y2:");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        sc.close();
        point1 obj1 = new point1(x1, x2, y1, y2);
        System.out.println("Point1 equals Point2: "+obj1.equals());
        point1 obj2 = (point1)obj1.clone();
        System.out.println("Original Point (x1,y1) "+obj1.x1+" "+obj1.y1+" (x2,y2) "+obj1.x2+" "+obj1.y2);
        System.out.println("After Cloning (x1 ,y1) "+obj2.x1+" "+obj2.y1+" (x2,y2) "+obj2.x2+" "+obj2.y2);
    }

    
}

