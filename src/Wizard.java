class Wizard extends Character{
    public int mp;
    public Wizard(String name,int hp) {
        super(name,hp);
        this.mp=mp;
    }
    public void attack(Creature target){
        System.out.println(this.getName()+"は火の玉を放った！" + target.getName()+"に3のダメージを与えた！");
        this.mp-=3;
        target.setHp(target.getHp() - 3);
    }
}
