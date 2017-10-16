
import java.rmi.*;
import java.rmi.server.*;

public class SNTImplementation extends UnicastRemoteObject
        implements ISNT {

        public static boolean KtSNT(int n) {
        //n < 2 khong phai la so nguyen to
        if (n < 2) 
            {
                return false;
            }
        //kiem tra so nguyen to khi n >= 2
        int i,a = (int) Math.sqrt(n);
            for (i = 2; i <= a; i++) {
                if (n % i == 0) 
                {
                    return false;
                }
        }
        return true;
    }

    public SNTImplementation() throws RemoteException {
        //There is no action need in this moment.
    }
    
    @Override
    public String getGreetingMessage(String args[]) throws RemoteException {
       String s="";
        for(String arg : args )
        {
        	if(KtSNT(Integer.parseInt(arg)))
        	s = s + arg +" ";
        }
        return s;
    }
}
