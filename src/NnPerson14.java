//Write a class with the name Person. The class needs three fields (instance variables) with the names
// firstName, lastName of type String and age of type int.
public class NnPerson14 {
        String firstName, lastName;
        int age;

        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }
        public String getFullName(){
            return firstName + " " + lastName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public void setAge(int age){
            if (age < 0 || age > 100){
                age = 0;
            }
            this.age = age;
        }
        public boolean isTeen(){
            if (age > 12 && age <20 ){
                return true;
            }
            return false;
        }

        public static void main(String[] args){
            NnPerson14 obj = new NnPerson14();
            obj.setFirstName("");
            obj.setLastName("");
            obj.setAge(10);
            System.out.println("fullName=" + obj.getFullName());
            System.out.println("teen=" + obj.isTeen());
            obj.setFirstName("John");
            obj.setAge(18);
            System.out.println("fullName=" + obj.getFullName());
            System.out.println("teen=" + obj.isTeen());
            obj.setLastName("Smith");
            System.out.println("fullName=" + obj.getFullName());
        }
    }


