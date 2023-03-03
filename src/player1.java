 class player1 {
    String name;
    int health;
    String gun;
   boolean isarmermodeon=false;

    public player1(String name) {
        this.name = name;
        this.health = 100;
    }

    public void shootplyergun1(boolean isarmermodeon){
        System.out.println("you have shoot " + name+ " with gun 1 \n with gun 1 you loose 30 points");

        this.isarmermodeon=isarmermodeon;
        if (this.isarmermodeon){
            health-=20;
            System.out.println("with armer mode you will lose 20 points");
            System.out.println("armer mode is enabled your remaining health is:"+health);
        }
        else {
            health-=30;
            System.out.println("without armer mode you will loose 30 points");
            System.out.println("armer mode is disabled remaining health:"+health );
        }
        if (health<=0){
            this.health=0;
            System.out.println(this.name+" has died");
        }
    }

    public void shootplyergun2(boolean isarmermodeon){
        this.isarmermodeon=isarmermodeon;

        System.out.println("you have shoot " + name +" with gun 2 \n with gun 2 you loose 50 points");
        if (this.isarmermodeon){
            System.out.println("with armer mode you will loose 30 points");
            health-=30;
            System.out.println("armer mode is enabled your remaining health is:"+health);
        }
        else {
            health-=50;
            System.out.println("without armer mode you will loose 50 points");
            System.out.println("armer mode is off");
            System.out.println("your remaining health is:"+health);
        }
        if (health<=0){
            this.health=0;
            System.out.println(this.name +" has died");
        }
    }

    public void heal(){
        if (health==0){
            System.out.println("player has died heal not possible");
        }
        else {
            health=100;
            System.out.println("player healed now health is:"+ health);
        }
    }
}





