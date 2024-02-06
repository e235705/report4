package jp.ac.uryukyu.ie.e235705;

public class Warrior extends Hero{

    public Warrior (String _name, int _maximumHP, int _attack) {
        super(_name, _maximumHP, _attack);
    }

    @Override
    public void wounded(int damage){
        int nowHp = getHitPoint() - damage;
        setHitPoint(nowHp);
        if( nowHp < 0 ) {
            setDead(true);
            System.out.printf("戦士%sは道半ばで力尽きてしまった。\n", getName());
        }
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if(isDead() == false){
            int damage = (int)(this.getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }

    }
}
