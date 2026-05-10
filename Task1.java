class A{
    String dogName;
    public void bone(){
        System.out.println(dogName+"Likes Cookies......");
    }
}
class B extends A{
    public void dogName(String dogName){
        this.dogName=dogName;
    }
    public void like() {
        bone();
    }
}
class Task1{
    public static void main(String[] args) {
        B obj=new B();
        obj.dogName("Simbahh ");
        obj.like();
    }
}