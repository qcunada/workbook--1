package week5.SoccerTournament;

public class Player { //defines the public class named Player
    private String name; //Player's name
    private String position; // Player's position
    private int number; // Player's jersey number

    public Player(String name, String position, int number){
        //constructor. sets up a player when created.
        this.name= name; //assign the name
        this.position= position; //assign the position
        this.number = number; //assign the number

    }
    public String getName(){  //getter: allow others classes to read values
        return name;
    }

    public void setName(String name) { //setter: allow others classes to change values
        this.name = name;
    }
    public String getPosition(){ //getter
        return position;
    }

    public void setPosition(String position) { //setter
        this.position = position;
    }
    public int getNumber(){ //getter
        return number;
    }

    public void setNumber(int number) {  //setter
        this.number = number;
    }
}
