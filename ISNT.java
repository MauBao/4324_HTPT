
import java.rmi.*;

public interface ISNT extends Remote
{
    public String getGreetingMessage(String args []) throws RemoteException;
}