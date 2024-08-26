import com.phone.Android;
import com.phone.IOS;
import com.phone.OS;

public class FactoryMain {
    public static void main(String args[]){
        OS obj=new IOS();
        obj.spec();
    }
}
