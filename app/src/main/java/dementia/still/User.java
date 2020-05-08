package dementia.still;

public class User {
    private String name;
    private int productivity;
    private int love;

    public User(String name, int productivity, int love){
        this.name = name;
        this.productivity = productivity;
        this.love = love;
    }

    public String name(){
        return this.name;
    }
    public int productivity(){
        return productivity;
    }
    public int love(){
        return love;
    }

    public void change_name(String name){
        this.name = name;
    }

    public void change_productivity(int prod){
        this.productivity = prod;
    }

    public void change_love(int love){
        this.love = love;
    }
}
