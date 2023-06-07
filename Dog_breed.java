package oops;
class Dog{
    private String name;
    private String breed;
    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
}

public class Dog_breed {
    public static void main(String[]args){
        Dog dog1=new Dog("Brito","German sheapard");
        Dog dog2=new Dog("Bolt","Rotwheeler");
        System.out.println(dog1.getName()+" is a "+dog1.getBreed());
        System.out.println(dog2.getName()+" is a "+dog2.getBreed());
        System.out.println("UPDATE");
        dog1.setBreed("GSD");
        dog2.setName("Rocky");
        System.out.println(dog1.getName()+" is now a "+dog1.getBreed());
        System.out.println(dog2.getName()+" is now a "+dog2.getBreed());
    }
}
