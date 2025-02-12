import java.util.ArrayList;
import java.util.Scanner;

class User {
String userID;
String name;
int age;
ArrayList<String> friendIDs;
User next;
User(String userID, String name, int age) {
this.userID = userID;
this.name = name;
this.age = age;
this.friendIDs = new ArrayList<>();
this.next = null;
}
}

class SocialMedia {
User head;
void addUser(String userID, String name, int age) {
User newUser = new User(userID, name, age);
if (head == null) {
head = newUser;
return;
}
User temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newUser;
}
User searchUser(String key) {
User temp = head;
while (temp != null) {
if (temp.userID.equals(key) || temp.name.equals(key)) {
return temp;
}
temp = temp.next;
}
return null;
}
void addFriend(String userID1, String userID2) {
User user1 = searchUser(userID1);
User user2 = searchUser(userID2);
if (user1 != null && user2 != null && !user1.friendIDs.contains(userID2)) {
user1.friendIDs.add(userID2);
user2.friendIDs.add(userID1);
}
}
void removeFriend(String userID1, String userID2) {
User user1 = searchUser(userID1);
User user2 = searchUser(userID2);
if (user1 != null && user2 != null) {
user1.friendIDs.remove(userID2);
user2.friendIDs.remove(userID1);
}
}
ArrayList<String> findMutualFriends(String userID1, String userID2) {
User user1 = searchUser(userID1);
User user2 = searchUser(userID2);
ArrayList<String> mutualFriends = new ArrayList<>();
if (user1 != null && user2 != null) {
for (String friend : user1.friendIDs) {
if (user2.friendIDs.contains(friend)) {
mutualFriends.add(friend);
}
}
}
return mutualFriends;
}
void displayFriends(String userID) {
User user = searchUser(userID);
if (user != null) {
System.out.println("Friends of " + user.name + ": " + user.friendIDs);
}
}
void countFriends(String userID) {
User user = searchUser(userID);
if (user != null) {
System.out.println(user.name + " has " + user.friendIDs.size() + " friends.");
}
}
}

public class SocialMediaApp {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
SocialMedia sm = new SocialMedia();
sm.addUser("U1", "Abhinav", 21);
sm.addUser("U2", "Kshitiz", 22);
sm.addUser("U3", "Osama", 122);
sm.addFriend("U1", "U2");
sm.addFriend("U1", "U3");
sm.displayFriends("U1");
sm.countFriends("U1");
System.out.println("Mutual friends: " + sm.findMutualFriends("U2", "U3"));
sm.removeFriend("U1", "U3");
sm.displayFriends("U1");
scanner.close();
}
}

