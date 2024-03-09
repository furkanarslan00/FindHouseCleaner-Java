package project3imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HouseCleaner {
	
    private String name;
    private String location;
    int price;
    
    private List<Review> reviews;

    private List<Messages> messages;

    private int balance;
    
    Scanner sc = new Scanner(System.in);

    public HouseCleaner(String name, String location, int price){
        this.name = name;
        this.location = location;
        this.price = price;
        balance = 0;
        reviews = new ArrayList<>();
        messages = new ArrayList<>();
    }
    public void addReview(Review r){
        reviews.add(r);
    }
    public void addMessage(Messages m){
        messages.add(m);
    }
    public void sendMessage(HouseOwner h){
       
        String message;
        System.out.println("Enter the message: ");
        message = sc.nextLine();
        Messages m = new Messages(message, this.name);
        h.addMessage(m);
    }

    public void makeComment(HouseOwner h){
   
        String comment;
        float star;
        System.out.println("Enter the comment: ");
        comment = sc.nextLine();
        System.out.println("Enter the star: ");
        star = sc.nextFloat();
        Review r = new Review(comment,star);
        h.addReview(r);
    }
    


    public void getPayment(){
        balance += price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Messages> getMessages() {
        return messages;
    }

    public void setMessages(List<Messages> messages) {
        this.messages = messages;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
