package teams;

 public class Team {
     private String name;
     private String homeGround;

     public Team(String name, String homeGround) {
         this.name = name;
         this.homeGround = homeGround;
     }

     public String getName() {
         return name;
     }

     public String getHomeGround() {
         return homeGround;
     }
 }