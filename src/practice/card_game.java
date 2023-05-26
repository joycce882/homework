package practice;

import java.util.Random;
import java.util.Stack;

class  Poker
{
    int point;
    String style;
    public Poker()
    {
       System.out.println("这是一个无参构造器");
    }
    public Poker(String style,int point )
    {
        this.point = point;
        this.style = style;
        System.out.println("这是一个有参构造器");
    }
    void info()
    {
        System.out.println("这张牌的信息为：");
        System.out.println("点数："+point+"，花色："+style);
    }
}
public class card_game {

    public static String[] style = {"♠","♦","♥","♣"};
    public static String[] point = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static String[] creat()
    {
        String[] card = new String[52];
        for(int i = 0; i < 52; i++)
        {
            card[i] = style[(i/13%4)] + point[(i%13)];
        }
        return card;
    }
    public static void wash(String[] card)
    {
        for(int i = 0; i < 10000; i++)
        {
            Random ran = new Random();
            int r1 = ran.nextInt(card_game.point.length);
            int r2 = ran.nextInt(card_game.style.length);
            swap(card,r1,r2);
        }
    }
    public static void swap(String[] card, int i, int j){
        String temp = "";
        temp = card[i];
        card[i] = card[j];
        card[j] = temp;
    }
    public static void display(String[] card)
    {
        wash(card);
        for (String s : card) {
            System.out.print(s + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        String[] cards = card_game.creat();
        wash(cards);
        display(cards);

    }

}
