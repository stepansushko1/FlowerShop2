
package db;

import order.Receiver;
import order.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    Connection connect;

    @BeforeEach
    void setUp() {
        connect = new Connection();
    }

    @Test
    void getConnection() {
        assertEquals(new ArrayList<>(), connect.getConnection().userIDs);
    }

    @Test
    void addUserId() {
        User user1 = new Receiver();
        connect.addUserId(user1);
        assertEquals(1, connect.userIDs.size());
    }

    @Test
    void removeUserId() {
        User user2 = new Receiver();
        connect.addUserId(user2);
        connect.removeUserId(user2);
        assertEquals(0, connect.userIDs.size());
    }
}