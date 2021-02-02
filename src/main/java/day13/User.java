package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public  User (String username){
        this.username = username;
        this.subscriptions= new ArrayList<>();
    }
    public void subscribe (User user){
        this.subscriptions.add(user);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public boolean isSubscribe(User user){
        for (User curUser: subscriptions){
           if (curUser.getUsername().equals(user.getUsername()))
                    return true;
        }
        return false;
    }
    public boolean isFriend (User user){
       return this.isSubscribe(user) && user.isSubscribe(this);
    }

    public void  sendMessage (User user, String text){
    MessageDatabase.addNewMessage(this,user,text);
    }
    public String toString(){
        return username;
    }
}
