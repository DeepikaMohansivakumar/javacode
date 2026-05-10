class puffs{
    public puffs(){
        System.out.println("Helloooo I'm Puffs");
    }
    public puffs(String variety){
        System.out.println("Im puffs made with "+variety);
    }
}
class samosa extends puffs{
    public samosa(){
        super("Onion");
        System.out.println("Helloo I'm Samosa");
    }
    public samosa(String variety){
        super();
        System.out.println("Im samosa made with "+variety);
    }
}
class Super{
    public static void main(String[] args) {
        samosa yummy=new samosa();
    }
}