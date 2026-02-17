import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Bullet {
    String str();
    double dbl();
}

class AnnotationMain{
    @Bullet (str="Camlin", dbl=51.36658)
    public void anyMethod(){
        try {
            Method mtd = AnnotationMain.class.getMethod("anyMethod");
            Bullet b = mtd.getAnnotation(Bullet.class);
            if(b == null)
                throw new NullPointerException("annotation not found");
            else{
                System.out.println("str : " + b.str());
                System.out.println("dbl : " + b.dbl());
            }
        }   
        catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }
    }
    
    public static void main(String args[]) throws NoSuchMethodException{
        AnnotationMain object = new AnnotationMain();
        object.anyMethod();
    }
}