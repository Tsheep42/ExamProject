public abstract class Monster implements Creature {
    private String name;
    public String getName() {return name;}
    private int hp;
    char suffix;
    public Monster(String name,char suffix,int hp){
        this.name = name;
        this.suffix = suffix;
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }else {
            this.hp = hp;
        }
    }
    public final boolean isAlive(){
        return hp > 0;
    }
    public void showStatus(){
        System.out.println(this.name + suffix + ": HP " + this.hp);
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
}
