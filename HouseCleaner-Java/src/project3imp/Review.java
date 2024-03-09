package project3imp;

public class Review {
    private String comment;
    private float stars;
    private String name;

    public Review(String comment, float stars){
        this.comment = comment;
        this.stars = stars;
    }
    
    
    public String getComment() {
        return comment;
      }

         public void setComment(String comment) {
      this.comment = comment;
     }
    
    
         public float getStars() {
             return stars;
           }

              public void setStars(float sters) {
           this.stars = stars;
          }

              public String getName() {
                  return name;
                }

                   public void setName(String name) {
                this.name = name;
               }

    
    
    
 
    
    
}
