package project3imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseOwner {
	
    private String name;
    private String location;
    
    private List<Review> reviews;

    private List<Messages> messages;
    
    private List<HouseCleaner> pastCleaners;

    private int balance;
    
    Scanner sc = new Scanner(System.in);

    public HouseOwner(String name, String location, int balance){
        this.name = name;
        this.location = location;
        this.balance = balance;
        reviews = new ArrayList<>();
        messages = new ArrayList<>();
        pastCleaners = new ArrayList<>();
    }
    public List<HouseCleaner> searchCleaner(List<HouseCleaner> h){
        
        List<HouseCleaner> t = new ArrayList<>();
        String location;
        int price;
        System.out.println("Enter the location: ");
        location = sc.nextLine();
        System.out.println("Enter the price: ");
        price = sc.nextInt();

        for(int i = 0; i< h.size(); i++){
        	  if(h.get(i).getPrice() <= price && h.get(i).getLocation().equals(location)){
                  t.add(h.get(i));
       }

        }
        return t;
    }

    public void bookCleaner(HouseCleaner h){
        pastCleaners.add(h);
        makePayment(h);
        h.getPayment();
    }

    public void addBalance(int m){
        balance += m;
    }
    public void makePayment(HouseCleaner h){
        if(balance >= h.getPrice()){
            balance -= h.getPrice();
        }
        else{
            System.out.println("There is not enough balance!");
        }
    }

    public void addReview(Review r){
        reviews.add(r);
    }
    public void addMessage(Messages m){
        messages.add(m);
    }
    public void sendMessage(HouseCleaner h){
       
        String message;
        System.out.println("Enter the message: ");
        message = sc.nextLine();
        Messages m = new Messages(message, this.name);
        h.addMessage(m);

    }

    public void makeComment(HouseCleaner h){
     
        String comment;
        float star;
        System.out.println("Enter the comment: ");
        comment = sc.nextLine();
        System.out.println("Enter the star: ");
        star = sc.nextFloat();
        Review r = new Review(comment,star);
        h.addReview(r);
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

    public List<HouseCleaner> getPastCleaners() {
        return pastCleaners;
    }

    public void setPastCleaners(List<HouseCleaner> pastCleaners) {
        this.pastCleaners = pastCleaners;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
