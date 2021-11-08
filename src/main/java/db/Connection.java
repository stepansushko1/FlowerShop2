package db;

import order.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Connection {
    public static Connection thisConnection;
    public List<Integer> userIDs;

    public Connection() {
        this.userIDs  = new ArrayList<>();
    }

    public static Connection getConnection(){
        if (thisConnection == null){
            thisConnection = new Connection();
        }
        return thisConnection;
    }

    public void addUserId(User user){
        userIDs.add(user.id);
    }

    public void removeUserId(User user){
        for (int i = 0; i < userIDs.size(); i++){
            if (Objects.equals(userIDs.get(i), user.id))
                userIDs.remove(i);
        }
    }
}