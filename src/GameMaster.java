import java.util.ArrayList;
import java.util.List;

public class GameMaster {
    public static void main(String[] args) {
        List<Character> party = new ArrayList<Character>();
        
        Hero hero=new Hero("勇者",100,"剣");
        Wizard wizard=new Wizard("魔法使い",60,20);
        Thief thief = new Thief("盗賊",70);

        party.add(hero);
        party.add(wizard);
        party.add(thief);

        ArrayList<Monster> monsters = new ArrayList<>();

        Matango matango = new Matango("お化けキノコ",'A',45);
        Goblin goblin= new Goblin("ゴブリン",'A',50);
        Slime slime = new Slime("スライム",'A',40);

        monsters.add(matango);
        monsters.add(goblin);
        monsters.add(slime);

        System.out.println("---味方パーティ---");
        for(Character p :party){
            p.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster m :monsters){
            m.showStatus();
        }
        System.out.println();
        System.out.println("味方の総攻撃！");
        for(Character p :party){
            for(Monster m :monsters){
                p.attack(m);
            }
        }
        System.out.println();
        System.out.println("敵の総攻撃！");
        for(Monster m :monsters){
            for(Character p :party){
                m.attack(p);
            }
        }
        System.out.println();
        System.out.println("ダメージを受けた勇者が突然光りだした！");
        System.out.println("勇者はスーパーヒーローに進化した！");
        SuperHero superHero = new SuperHero(hero);
        party.set(0,superHero);
        for(Monster m :monsters){
            superHero.attack(m);
        }
        System.out.println();
        System.out.println("---味方パーティ最終ステータス---");
        for(Character p :party){
            p.showStatus();
            p.isAlive();
            if (p.getHp() <= 0) {
                System.out.println("生存状況：戦闘不能");
            } else {
                System.out.println("生存状況：生存");
            }
        }
        System.out.println();
        System.out.println("---敵グループ最終ステータス---");
        for(Monster m :monsters){
            m.showStatus();
            m.isAlive();
            if (m.getHp() <= 0) {
                System.out.println("生存状況：討伐済み");
            } else {
                System.out.println("生存状況：生存");
            }
        }
    }
}
