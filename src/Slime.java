final public class Slime extends Monster{
    public Slime(String name,char suffix,int hp) {
        super("スライム" , 'A',40);
    }
    public void attack(Creature target) {
        System.out.println("スライム" + suffix + "は体当たり攻撃！" + target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp() - 5);
    }
}
