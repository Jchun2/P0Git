public class Nation {
    String name;
    int population;
    Nation enemy;
    Nation ally;
    public Nation(String name, int population){
        this.name = name;
        this.population = population;

    }
    public void setEnemy(Nation n){
       // n = enemy;
        this.enemy=n;
        //System.out.println(this.name);
        Nation x = new Nation(this.name, this.population);
       // x = n.enemy;
        n.enemy = x ;
        //System.out.println(this.enemy);

       // Nation nation = this;
        //n.setEnemy(Nation this);
        //n.enemy.equals()
       // System.out.println(n.enemy.name);
        //n.enemy.name = this.name;
       // n.enemy.population.equals(this.population);
              //  (this.name, this.population);
       // n.enemy.equals()
        //n.setEnemy(new Nation(this.name, this.population));
       // n.enemy.equals(new Nation(this.name, this.population));



        //n.setEnemy(this);
        //Nation.enemy = n;
        //System.out.println(this.name);
        //this.enemy = n.enemy;
        //setEnemy(Nation.this);


        //n.enemy = this.Nation;


       // enemy =  n;
    }
    public void setAlly(Nation n){
        this.ally = n;
       // n.ally =
       // System.out.println("within setAlly - this.ally");
       // System.out.println(this.ally);
        //System.out.println("within setAlly");
        Nation y = new Nation(this.name, this.population);
        n.ally = y ;


        //setAlly(this);


        //..n.ally = new Nation(this.name, this.population) ;
    }

    public void backstab(){
        this.enemy = ally;
        //this.ally = enemy;
        //Nation.setEnemy(this.ally);
    }
    public String getRelationship(Nation n){
        String str = "";
        if(n.equals(enemy)){
            str += "enemy";
        } else if (n.equals(ally)) {

            str += "ally";
        }
        else{
            str +=  "no relationship";
        }
        return str;
    }

    public String toString() {
        String str = "";
        // System.out.println("2C");
        if (this.enemy == null && this.ally != null ) {

            str = this.name + " has " + population + " people. It has no enemy. Its ally is " + this.ally.name + ".";

        }

        else if (this.ally == null && this.enemy != null){
           // System.out.println("2C");
            str = this.name + " has " + population + " people. Its enemy is " + this.enemy.name + "It has no ally.";
           // System.out.println(this.name);
           // System.out.println(str);

        }
        else if (this.enemy == null && this.ally == null ) {
            //System.out.println("3C");
            str = name + " has " + population + " It has no enemy. It has no ally.";

        }

        else {
            //System.out.println("4C");
            str = name + " has " + population + " people. Its enemy is " + this.enemy.name + ". Its ally is " + this.ally.name;

        }

        return str;


    }
}
