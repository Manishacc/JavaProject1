
class Employee {  
    private String name;  
    private int gid;  
      
    public String getName() {  
         return name;  
    }  

    public void setName(String name) {  
        this.name = name;  
    }  

    public int getId() {  
        return gid;  
    }  
    
    public void setId(int gid) {  
        this.gid = gid;  
    }  
}  

class Programmer extends Employee{
    
    String role;
    double salary;
    String gitHubLink;

    public String getRole() {  
        return role;  
      }  
     
      public void setRole(String role) {  
         this.role = role; 
      }

    public double getSal() {  
       return salary;  
     }  
    
     public void setSal(double salary) {  
        this.salary = salary; 
     }

     public String getLink() {  
        return gitHubLink;  
      }  
     
      public void setLink(String gitHubLink) {  
         this.gitHubLink = gitHubLink; 
      }
}

class Tester extends Employee{
    
    String role;
    double salary;

    public String getRole() {  
        return role;  
      }  
     
      public void setRole(String role) {  
         this.role = role; 
      }

    public double getSal() {  
       return salary;  
     }  
    
     public void setSal(double salary) {  
        this.salary = salary; 
     }
}

    
public class Organisation{
    public static void main(String[] args){
        
         Programmer p1 = new Programmer();
         Tester t1 = new Tester();

         t1.setName("Natasha");
         t1.setId(1234);
         t1.setRole("tester");
         t1.setSal(500000);

         p1.setName("Rishab");
         p1.setId(5678);
         p1.setRole("programmer");
         p1.setSal(1200000);
         p1.setLink("https://github/rishab");

    
            System.out.println("Employee Name: " + p1.getName());
            System.out.println("Employee GID: " + p1.getId());
            System.out.println("Employee Role: " + p1.getRole());
            System.out.println("Employee salary: " + p1.getSal());
            System.out.println("Employee GitHub link: " + p1.getLink());
            System.out.println();

            System.out.println("Employee Name: " + t1.getName());
            System.out.println("Employee GID: " + t1.getId());
            System.out.println("Employee Role: " + t1.getRole());
            System.out.println("Employee salary: " + t1.getSal());

    }

}

