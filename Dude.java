class Bank{

    private Bank(Monk monk){
        System.out.println(monk.getAge());
    }
}
class Monk extends Bank{
    int age = 78;
   Monk(){
       super(null);
   }
   public int getAge(){
       return age;
   }
}
class Dude{
    public static void main(String[] args) {
        Monk monk = new Monk();

    }
}