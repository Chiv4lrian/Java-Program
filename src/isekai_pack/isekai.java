package isekai_pack;

import java.util.*;
public class isekai {
    //still a beta I will improve and add functions later on...
    public static void main(String[] args) {
        //imp commands
        Scanner user = new Scanner(System.in);
        Random any = new Random();
        int race;
        double potionheal = 40;
        String out;
        int con = 0;
        int strt = 0;
        boolean run = true;
        //GAMESTATSCLASS
        //DRAGONITE
        double dragonitehp = 540;
        double dragmana = 200;
        double dragpot = 10;
        double dragatk = 30;
        double dragreduc = 20;
        double dragatkgrow = 20;
        double draghpgrow = 35;
        //High Elf
        double highhp = 250;
        double highmana = 300;
        double highpot = 15;
        double highatk = 15;
        double highreduc = 20;
        double highatkgrow = 11;
        double highhpgrow = 8;
        //Superhuman
        double superhp = 100;
        double supermana = 100;
        double superpot = 10;
        double superatk = 9;
        double superreduc = 50;
        double superatkgrow = 14;
        double superhpgrow = 11;
        //GODKIN
        double godhp = 120;
        double godmana = 500;
        double godpot = 1;
        double godatk = 40;
        double godreduc = 1000;
        double godatkgrow = 50;
        double godhpgrow = 50;
        // ELEMENTAL
        double elemhp = 150;
        double elemmana = 450;
        double elempot = 10;
        double elematk = 20;
        double elemreduc = 40;
        double elematkgrow = 10;
        double elemhpgrow = 5;
        // SAGE
        double sagehp = 250;
        double sagemana = 600;
        double sagepot = 10;
        double sageatk = 25;
        double sagereduc = 70;
        double sageatkgrow = 15;
        double sagehpgrow = 5;
        // ???
        double transcendencehp = 1000;
        double transcendencemana = 100;
        double transcendencepot = 1;
        double transcendenceatk = 1000;
        double transcendenceatkgrow = 1;
        double transcendencehpgrow = 1;
        double transdmgreduc = 40;
        //ENEMYSTATS(small)
        String [] mobs = {"skeleton","goblin", "slime", "imp", "bandit"};
        double mobhp = 200;  // not fix since beta
        double mobatk = 20; //since beta
        //ENEMYSTATS(rare)
        //String [] rare = {"Dragon", "Orc", "Hobgoblin","Slime King","Demon", "Angel"};
        //double rarehp = 200;
        //double rareatk = 70;
        //ENEMYBOSS
        //String [] boss = {"CRAZY SCIENTIST", "DOOM" , "THE GOD OF DESTRUCTION", "DRAGON KING", "ULTIMATE SLIME", "DEMON LORD", "RAFAEL \"THE COMMANDMENT\"" };
        //double bosshp = 1500;
        //double bossatk = 200;
        //double bossrevive = 1;
        //double bosshpgrowth = 500;
        //double bossatkgrowth = 100;

        //Details
        System.out.println("TO PLAY THE GAME PLEASE ENTER YOUR NAME");
        String name = user.nextLine();
        System.out.println("PLEASE ENTER AGE");
        int age = user.nextInt();
        do {
            System.out.println("PRESS 1 TO START GAME");
            strt = user.nextInt();
        } while (strt!=1);
        REINCARNATE:
        while (strt==1) {
            System.out.println("\t\tGAME STARTING...........");
            for (int i = 3; i>=1 ; i--) {
                System.out.println("\t\t\t"+i);
            }

            String [] playerlines = {"WHERE AM I?","WHO AM I?","I SEE I WAS INSIDE A GAME"};
            String [] npclineintro = {"You have awakened mortal!","WELCOME OUR HERO PLEASE SAVE US!","WELCOME TO THE WORLD OF ARNOM \"PLAYER\""};
            String [] story = {"OUR KINGDOM IS IN PERIL PLEASE SAVE US HERO FROM ANOTHER WORLD!","MORTAL THIS IS THE POWER OF THE ???!, SAVE THE WORLD", "TO GO BACK TO YOUR WORLD YOU MUST SAVE OUR WORLD \"HUMAN\""};
            //PlayerRace
            String [] playerrace = {"Dragonite = 1","High Elf = 2", "Superhuman = 3", "Godkin = 4", "Elemental = 5", "Sage = 6", "??? = 7"};
            //Introduction
            System.out.println("------------------------------------------------------------");
            String plines = playerlines[any.nextInt(playerlines.length)];
            System.out.println(plines);
            //NPCLINES
            String npclines = npclineintro [any.nextInt(npclineintro.length)];
            System.out.println("------------------------------------------------------------");
            System.out.println(npclines);
            String npclines2 = story [any.nextInt(story.length)];
            System.out.println("------------------------------------------------------------");
            System.out.println(npclines2);
            //PlayerLines
            System.out.println("------------------------------------------------------------");
            System.out.println("I guess this is my fate now");
            System.out.println("------------------------------------------------------------");
            //NPC lines
            System.out.println("\nLight: Fear not I am your Guide to awaken your power, feel the mana in the air and choose a class!");
            System.out.println("\n"+name+": woah so this is mana");
            System.out.println("\nLight: Focus!\n");
            System.out.println(Arrays.toString(playerrace));
            //class
            System.out.println("\nPlease Choose A Class");
            race = user.nextInt();
            while (race>7) {
                do {
                    System.out.println("Please select an appropriate class");
                    race = user.nextInt();
                } while (race>7);
            }
            //race info
            switch (race) {
                case 1:
                    System.out.println("YOU HAVE SELECTED DRAGONITE AS A CLASS");
                    System.out.println("\nDragonite Stats \nDragonite HP = " +dragonitehp+"\nDragon Mana = "+dragmana+"\nDragon Attack = "+dragatk+"\nDragon HP Growth = "+draghpgrow+"\nDragon Attack Growth = "+dragatkgrow);
                    break;
                case 2:
                    System.out.println("YOU HAVE SELECTED HIGH ELF AS A CLASS");
                    System.out.println("\nHigh ELF Stats \nHigh Elf HP = " +highhp+"\nHigh Elf Mana = "+highmana+"\nHigh Elf Attack = "+highatk+"\nHigh Elf HP Growth = "+highhpgrow+"\nHigh Elf Attack Growth = "+highatkgrow);
                    break;
                case 3:
                    System.out.println("YOU HAVE SELECTED SUPERHUMAN AS A CLASS");
                    System.out.println("\nSuperHuman Stats \nSuperHuman HP = " +superhp+"\nSuperHuman Mana = "+supermana+"\nSuperHuman Attack = "+superatk+"\nSuperHuman HP Growth = "+superhpgrow+"\nSuperHuman Attack Growth = "+superatkgrow);
                    break;
                case 4:
                    System.out.println("YOU HAVE SELECTED GODKIN AS A CLASS");
                    System.out.println("\nGodkin Stats \nGodkin HP = " +godhp+"\nGodkin Mana = "+godmana+"\nGodkin Attack = "+godatk+"\nGodkin HP Growth = "+godhpgrow+"\nGodkin Attack Growth = "+godatkgrow);
                    break;
                case 5:
                    System.out.println("YOU HAVE SELECTED ELEMENTAL AS A CLASS");
                    System.out.println("\nElemental Stats \nElemental HP = " +elemhp+"\nElemental Mana = "+elemmana+"\nElemental Attack = "+elematk+"\nElemental HP Growth = "+elemhpgrow+"\nElemental Attack Growth = "+elematkgrow);
                    break;
                case 6:
                    System.out.println("YOU HAVE SELECTED SAGE AS A CLASS");
                    System.out.println("\nSage Stats \nSage HP = " +sagehp+"\nSage Mana = "+sagemana+"\nSage Attack = "+sageatk+"\nSage HP Growth = "+sagehpgrow+"\nSage Attack Growth = "+sageatkgrow);
                    break;
                case 7:
                    System.out.println("YOU HAVE SELECTED ??? AS A CLASS");
                    System.out.println("\n\"SECRET CLASS TRANSCENDENCE\"");
                    System.out.println("\nSecret Class Stats \nTranscendence HP = " +transcendencehp+"\nTranscendence Mana = "+transcendencemana+"\nTranscendence Attack = "+transcendenceatk+"\nTranscendence HP Growth = "+transcendencehpgrow+"\nTranscendence Attack Growth = "+transcendenceatkgrow);
                    break;

            }
            //GameStart
            if (race==1) {
                System.out.println("---------------------------------------------------------------");
                System.out.println("THE ADVENTURE BEGINS....");
                System.out.println("---------------------------------------------------------------");
                out = user.nextLine();
                START:
                while(run) {
                    String mob = mobs [any.nextInt(mobs.length)];
                    double mohp = any.nextDouble(mobhp);
                    double moatk = any.nextDouble(mobatk);
                    System.out.println();
                    System.out.println("\t[!An Enemy Appeared!]\n\t\t\""+mob+"\"");

                    while(mohp>0) {
                        System.out.println("Your Current Stats:\nDragonite HP = " +dragonitehp+"\nDragon Mana = "+dragmana);
                        System.out.println("\nMob Hp = "+mohp);
                        System.out.println("Mob Attack = "+moatk);
                        //functions
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("------------------------CHOOSE AN ACTION-----------------------");
                        System.out.println("\t[ATTACK = 1]");
                        System.out.println("\t[DEFEND = 2]");
                        System.out.println("\t[DRINK POTION = 3]");
                        System.out.println("\t[RUN! = 4]");
                        String in = user.nextLine();

                        if(in.equals("1")) {
                            mohp -= dragatk;
                            dragonitehp -= moatk;
                            System.out.println("You damage "+mob+" worth "+dragatk);
                            System.out.println("You receive "+moatk+" from "+mob+" attack and you have a HP worth "+dragonitehp );
                            System.out.println("---------------------------------------------------------------");
                            dragonitehp += draghpgrow;
                            dragatk += dragatkgrow;

                            if(dragonitehp<1) {
                                System.out.println("SO YOU HAVE CHOSEN DEATH?!");
                                break;
                            }
                        }
                        else if (in.equals("2")) {
                            double reduce = moatk/dragreduc;
                            dragonitehp -= reduce ;
                            System.out.println("YOU USE A UNIQUE SKILL \"DRAGON KING'S PROTECTION\"");
                            System.out.println("You used DRAGON KING'S PROTECTION! and you received damage worth "+reduce);
                        }
                        else if (in.equals("3")) {
                            if(dragpot>0) {
                                dragonitehp += potionheal;
                                dragpot--;
                                System.out.println("YOU HAVE USED AN ELIXIR AND HEALED HP WORTH "+potionheal+" \nYour initial HP:"+dragonitehp);
                            }
                            else {
                                System.out.println("You don't have any elixir left");
                            }
                        }
                        else {
                            System.out.println("YOU HAVE JUST ESCAPED FROM A MERE!!!["+mob+"]\n\t--WHAT A COWARD--");
                            continue START;
                        }

                    }
                    if(transcendencehp<0) {
                        System.out.println("-----You are way too Weak-----");
                        break;
                    }
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("YOU HAVE DEFEATED :"+ mob);
                    System.out.println("Current HP = " + transcendencehp);
                    System.out.println("-------------------------------------------------------------------------");
                    if (any.nextInt(100) < transcendencepot) {
                        transcendencepot++;
                        System.out.println(" [ The " + mob + " dropped a mysterious elixir. ]");
                        System.out.println("WOAH THE ELIXIR OF THE *???*");
                        System.out.println(" You now have " + transcendencepot + " elixirs left");
                        System.out.println("-------------------------------------------------------------------------");
                    }
                }
            }

            else if (race==2) {
                System.out.println("---------------------------------------------------------------");
                System.out.println("THE ADVENTURE BEGINS....");
                out = user.nextLine();

                START:
                while(run) {
                    String mob = mobs [any.nextInt(mobs.length)];
                    double mohp = any.nextDouble(mobhp);
                    double moatk = any.nextDouble(mobatk);
                    System.out.println();
                    System.out.println("\t[!An Enemy Appeared!]\n\t\t\""+mob+"\"");

                    while(mohp>0) {
                        System.out.println("Your Current Stats:\nHigh Elf HP = " +highhp+"\nHigh Elf Mana = "+highmana);
                        System.out.println("\nMob Hp = "+mohp);
                        System.out.println("Mob Attack = "+moatk);
                        //functions
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("----------------------CHOOSE AN ACTION-------------------------");
                        System.out.println("\t[ATTACK = 1]");
                        System.out.println("\t[DEFEND = 2]");
                        System.out.println("\t[DRINK POTION = 3]");
                        System.out.println("\t[RUN! = 4]");
                        String in = user.nextLine();

                        if(in.equals("1")) {
                            mohp -= highatk;
                            highhp -= moatk;
                            System.out.println("You damage "+mob+" worth "+highatk);
                            System.out.println("You receive "+moatk+" from "+mob+" attack and you have a HP worth "+highhp );
                            System.out.println("---------------------------------------------------------------");
                            highhp += highhpgrow;
                            highatk += highatkgrow;

                            if(highhp<1) {
                                System.out.println("SO YOU HAVE CHOSEN DEATH?!");
                                break;
                            }
                        }
                        else if (in.equals("2")) {
                            double reduce = moatk/highreduc;
                            highhp -= reduce ;
                            System.out.println("YOU USE A UNIQUE SKILL \"MOONLIGHT SHADOW\"");
                            System.out.println("You used MOONLIGHT SHADOW! and you received damage worth "+reduce);
                        }
                        else if (in.equals("3")) {
                            if(highpot>0) {
                                highhp += potionheal;
                                highpot--;
                                System.out.println("YOU HAVE USED AN ELIXIR AND HEALED HP WORTH "+potionheal+" \nYour initial HP:"+highhp);
                            }
                            else {
                                System.out.println("You don't have any elixir left");
                            }
                        }
                        else {
                            System.out.println("YOU HAVE JUST ESCAPED FROM A MERE!!!["+mob+"]\n\t--WHAT A COWARD--");
                            continue START;
                        }

                    }
                    if (highhp<0) {
                        System.out.println("------You are way too Weak-----");
                        break;
                    }
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("YOU HAVE DEFEATED :"+ mob);
                    System.out.println("Current HP = " + highhp);
                    System.out.println("-------------------------------------------------------------------------");
                    if (any.nextInt(100) < highpot) {
                        highpot++;
                        System.out.println(" [ The " + mob + " dropped a mysterious elixir. ]");
                        System.out.println("WOAH THE ELIXIR OF THE *???*");
                        System.out.println(" You now have " + highpot + " elixirs left");
                        System.out.println("-------------------------------------------------------------------------");
                    }
                }
            }
            else if (race==3){
                System.out.println("---------------------------------------------------------------");
                System.out.println("THE ADVENTURE BEGINS....");
                out = user.nextLine();

                START:
                while(run) {
                    String mob = mobs [any.nextInt(mobs.length)];
                    double mohp = any.nextDouble(mobhp);
                    double moatk = any.nextDouble(mobatk);
                    System.out.println();
                    System.out.println("\t[!An Enemy Appeared!]\n\t\t\""+mob+"\"");

                    while(mohp>0) {
                        System.out.println("Your Current Stats:\nSuperHuman HP = " +superhp+"\nSuperHuman Mana = "+supermana);
                        System.out.println("\nMob Hp = "+mohp);
                        System.out.println("Mob Attack = "+moatk);
                        //functions
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("----------------------CHOOSE AN ACTION-------------------------");
                        System.out.println("\t[ATTACK = 1]");
                        System.out.println("\t[DEFEND = 2]");
                        System.out.println("\t[DRINK POTION = 3]");
                        System.out.println("\t[RUN! = 4]");
                        String in = user.nextLine();

                        if(in.equals("1")) {
                            mohp -= superatk;
                            superhp -= moatk;
                            System.out.println("You damage "+mob+" worth "+superatk);
                            System.out.println("You receive "+moatk+" from "+mob+" attack and you have a HP worth "+superhp );
                            System.out.println("---------------------------------------------------------------");
                            superhp += superhpgrow;
                            superatk += superatkgrow;

                            if(superhp<1) {
                                System.out.println("SO YOU HAVE CHOSEN DEATH?!");
                                break;
                            }
                        }
                        else if (in.equals("2")) {
                            double reduce = moatk/superreduc;
                            superhp -= reduce ;
                            System.out.println("YOU USE A UNIQUE SKILL \"UNBREAKABLE\"");
                            System.out.println("You used UNBREAKABLE! and you received damage worth "+reduce);
                        }
                        else if (in.equals("3")) {
                            if(superpot>0) {
                                superhp += potionheal;
                                superpot--;
                                System.out.println("YOU HAVE USED AN ELIXIR AND HEALED HP WORTH "+potionheal+" \nYour initial HP:"+superhp);
                            }
                            else {
                                System.out.println("You don't have any elixir left");
                            }
                        }
                        else {
                            System.out.println("YOU HAVE JUST ESCAPED FROM A MERE!!!["+mob+"]\n\t--WHAT A COWARD--");
                            continue START;
                        }
                    }
                    if(superhp<0) {
                        System.out.println("-----You are way too Weak-----");
                        break;
                    }
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("YOU HAVE DEFEATED :"+ mob);
                    System.out.println("Current HP = " + superhp);
                    System.out.println("-------------------------------------------------------------------------");
                    if (any.nextInt(100) < superpot) {
                        superpot++;
                        System.out.println(" [ The " + mob + " dropped a mysterious elixir. ]");
                        System.out.println("WOAH THE ELIXIR OF THE *???*");
                        System.out.println(" You now have " + superpot + " elixirs left");
                        System.out.println("-------------------------------------------------------------------------");
                    }
                }
            }
            else if (race==4){
                System.out.println("---------------------------------------------------------------");
                System.out.println("THE ADVENTURE BEGINS....");
                out = user.nextLine();

                START:
                while(run) {
                    String mob = mobs [any.nextInt(mobs.length)];
                    double mohp = any.nextDouble(mobhp);
                    double moatk = any.nextDouble(mobatk);
                    System.out.println();
                    System.out.println("\t[!An Enemy Appeared!]\n\t\t\""+mob+"\"");

                    while(mohp>0) {
                        System.out.println("Your Current Stats:\nGodkin HP = " +godhp+"\nGodkin Mana = "+godmana);
                        System.out.println("\nMob Hp = "+mohp);
                        System.out.println("Mob Attack = "+moatk);
                        //functions
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("-----------------------CHOOSE AN ACTION------------------------");
                        System.out.println("\t[ATTACK = 1]");
                        System.out.println("\t[DEFEND = 2]");
                        System.out.println("\t[DRINK POTION = 3]");
                        System.out.println("\t[RUN! = 4]");
                        String in = user.nextLine();

                        if(in.equals("1")) {
                            mohp -= godatk;
                            godhp -= moatk;
                            System.out.println("You damage "+mob+" worth "+godatk);
                            System.out.println("You receive "+moatk+" from "+mob+" attack and you have a HP worth "+godhp );
                            System.out.println("---------------------------------------------------------------");
                            godhp += godhpgrow;
                            godatk += godatkgrow;
                            if(godhp<1) {
                                System.out.println("SO YOU HAVE CHOSEN DEATH?!");
                                break;
                            }
                        }
                        else if (in.equals("2")) {
                            double reduce = moatk/godreduc;
                            godhp -= reduce ;
                            System.out.println("YOU USE A UNIQUE SKILL \"CHOSEN ONE\"");
                            System.out.println("You used CHOOSEN ONE! and you received damage worth "+reduce);
                        }
                        else if (in.equals("3")) {
                            if(godpot>0) {
                                godhp+=potionheal;
                                godpot--;
                                System.out.println("YOU HAVE USED AN ELIXIR AND HEALED HP WORTH "+potionheal+" \nYour initial HP:"+godhp);
                            }
                            else {
                                System.out.println("You don't have any elixir left");
                            }
                        }
                        else {
                            System.out.println("YOU HAVE JUST ESCAPED FROM A MERE!!!["+mob+"]\n\t--WHAT A COWARD--");
                            continue START;
                        }

                    }
                    if(godhp<0) {
                        System.out.println("-----You are way too Weak-----");
                        break;
                    }
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("YOU HAVE DEFEATED :"+ mob);
                    System.out.println("Current HP = " + godhp);
                    System.out.println("-------------------------------------------------------------------------");
                    if (any.nextInt(100) < godpot) {
                        godpot++;
                        System.out.println(" [ The " + mob + " dropped a mysterious elixir. ]");
                        System.out.println("WOAH THE ELIXIR OF THE *???*");
                        System.out.println(" You now have " + godpot + " elixirs left");
                        System.out.println("-------------------------------------------------------------------------");
                    }
                }
            }
            else if (race==5){
                System.out.println("---------------------------------------------------------------");
                System.out.println("THE ADVENTURE BEGINS....");
                out = user.nextLine();

                START:
                while(run) {
                    String mob = mobs [any.nextInt(mobs.length)];
                    double mohp = any.nextDouble(mobhp);
                    double moatk = any.nextDouble(mobatk);
                    System.out.println();
                    System.out.println("\t[!An Enemy Appeared!]\n\t\t\""+mob+"\"");

                    while(mohp>0) {
                        System.out.println("Your Current Stats:\nElemental HP = " +elemhp+"\nElemental Mana = "+elemmana);
                        System.out.println("\nMob Hp = "+mohp);
                        System.out.println("Mob Attack = "+moatk);
                        //functions
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("----------------------CHOOSE AN ACTION-------------------------");
                        System.out.println("\t[ATTACK = 1]");
                        System.out.println("\t[DEFEND = 2]");
                        System.out.println("\t[DRINK POTION = 3]");
                        System.out.println("\t[RUN! = 4]");
                        String in = user.nextLine();

                        if(in.equals("1")) {
                            mohp -= elematk;
                            elemhp -= moatk;
                            System.out.println("You damage "+mob+" worth "+elematk);
                            System.out.println("You receive "+moatk+" from "+mob+" attack and you have a HP worth "+elemhp );
                            System.out.println("---------------------------------------------------------------");
                            elemhp += elemhpgrow;
                            elematk += elematkgrow;
                            if(elemhp<1) {
                                System.out.println("SO YOU HAVE CHOSEN DEATH?!");
                                break;
                            }
                        }
                        else if (in.equals("2")) {
                            double reduce = moatk/elemreduc;
                            elemhp -= reduce ;
                            System.out.println("YOU USE A UNIQUE SKILL \"HEAVEN AND EARTH\"");
                            System.out.println("You used HEAVEN AND EARTH! and you received damage worth "+reduce);
                        }
                        else if (in.equals("3")) {
                            if(elempot>0) {
                                elemhp += potionheal;
                                elempot--;
                                System.out.println("YOU HAVE USED AN ELIXIR AND HEALED HP WORTH "+potionheal+" \nYour initial HP:"+elemhp);
                            }
                            else {
                                System.out.println("You don't have any elixir left");
                            }
                        }
                        else {
                            System.out.println("YOU HAVE JUST ESCAPED FROM A MERE!!!["+mob+"]\n\t--WHAT A COWARD--");
                            continue START;
                        }
                    }
                    if(elemhp<0) {
                        System.out.println("------You are way too Weak------");
                        break;
                    }
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("YOU HAVE DEFEATED :"+ mob);
                    System.out.println("Current HP = " + elemhp);
                    System.out.println("-------------------------------------------------------------------------");
                    if (any.nextInt(100) < elempot) {
                        elempot++;
                        System.out.println(" [ The " + mob + " dropped a mysterious elixir. ]");
                        System.out.println("WOAH THE ELIXIR OF THE *???*");
                        System.out.println(" You now have " + elempot + " elixirs left");
                        System.out.println("-------------------------------------------------------------------------");
                    }
                }
            }
            else if (race==6){
                System.out.println("---------------------------------------------------------------");
                System.out.println("THE ADVENTURE BEGINS....");
                out = user.nextLine();

                START:
                while(run) {
                    String mob = mobs [any.nextInt(mobs.length)];
                    double mohp = any.nextDouble(mobhp);
                    double moatk = any.nextDouble(mobatk);
                    System.out.println();
                    System.out.println("\t[!An Enemy Appeared!]\n\t\t\""+mob+"\"");

                    while(mohp>0) {
                        System.out.println("Your Current Stats:\nSage HP = " +sagehp+"\nSage Mana = "+sagemana);
                        System.out.println("\nMob Hp = "+mohp);
                        System.out.println("Mob Attack = "+moatk);
                        //functions
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("--------------------------CHOOSE AN ACTION---------------------");
                        System.out.println("\t[ATTACK = 1]");
                        System.out.println("\t[DEFEND = 2]");
                        System.out.println("\t[DRINK POTION = 3]");
                        System.out.println("\t[RUN! = 4]");
                        String in = user.nextLine();

                        if(in.equals("1")) {
                            mohp -= sageatk;
                            sagehp -= moatk;
                            System.out.println("You damage "+mob+" worth "+sageatk);
                            System.out.println("You receive "+moatk+" from "+mob+" attack and you have a HP worth "+sagehp );
                            System.out.println("---------------------------------------------------------------");
                            sagehp += sagehpgrow;
                            sageatk += sageatkgrow;
                            if(sagehp<1) {
                                System.out.println("SO YOU HAVE CHOSEN DEATH?!");
                                break;
                            }
                        }
                        else if (in.equals("2")) {
                            double reduce = moatk/sagereduc;
                            sagehp -= reduce ;
                            System.out.println("YOU USE A UNIQUE SKILL \"BARRIER\"");
                            System.out.println("You have a Barrier! and you received damage worth "+reduce);

                        }
                        else if (in.equals("3")) {
                            if(sagepot>0) {
                                sagehp+=potionheal;
                                sagepot--;
                                System.out.println("YOU HAVE USED AN ELIXIR AND HEALED HP WORTH "+potionheal+" \nYour initial HP:"+sagehp);
                            }
                            else {
                                System.out.println("You don't have any elixir left");
                            }
                        }
                        else {
                            System.out.println("YOU HAVE JUST ESCAPED FROM A MERE!!!["+mob+"]\n\t--WHAT A COWARD--");
                            continue START;
                        }
                    }
                    if(sagehp<0) {
                        System.out.println("------You are way too Weak-------");
                        break;
                    }
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("YOU HAVE DEFEATED :"+ mob);
                    System.out.println("Current HP = " + sagehp);
                    System.out.println("-------------------------------------------------------------------------");
                    if (any.nextInt(100) < sagepot) {
                        sagepot++;
                        System.out.println(" [ The " + mob + " dropped a mysterious elixir. ]");
                        System.out.println("WOAH THE ELIXIR OF THE *???*");
                        System.out.println(" You now have " + sagepot + " elixirs left");
                        System.out.println("-------------------------------------------------------------------------");
                    }

                }
            }
            else if (race==7){
                System.out.println("---------------------------------------------------------------");
                System.out.println("THE ADVENTURE BEGINS....");
                out = user.nextLine();
                START:
                while(run) {
                    String mob = mobs [any.nextInt(mobs.length)];
                    double mohp = any.nextDouble(mobhp);
                    double moatk = any.nextDouble(mobatk);
                    double reduc = any.nextDouble(transdmgreduc);

                    while(mohp>0) {
                        System.out.println("Your Current Stats:\nTranscendence HP = " +transcendencehp+"\nTranscendence Mana = "+transcendencemana);
                        System.out.println("\nMob Hp = "+mohp);
                        System.out.println("Mob Attack = "+moatk);
                        System.out.println();
                        System.out.println("\t[!An Enemy Appeared!]\n\t\t\""+mob+"\"");
                        //functions

                        System.out.println("---------------------------------------------------------------");
                        System.out.println("-----------------------CHOOSE AN ACTION------------------------");
                        System.out.println("\t[ATTACK = 1]");
                        System.out.println("\t[DEFEND = 2]");
                        System.out.println("\t[DRINK POTION = 3]");
                        System.out.println("\t[RUN! = 4]");
                        String in = user.nextLine();

                        if(in.equals("1")) {
                            mohp -= transcendenceatk;
                            transcendencehp -= moatk;
                            System.out.println("You damage "+mob+" worth "+transcendenceatk);
                            System.out.println("You receive "+moatk+" from "+mob+" attack and you have a HP worth "+transcendencehp );
                            System.out.println("---------------------------------------------------------------");
                            transcendencehp += transcendencehpgrow;
                            transcendenceatk += transcendenceatkgrow;
                            if(transcendencehp<1) {
                                System.out.println("SO YOU HAVE CHOSEN DEATH?!");
                                break;
                            }
                        }
                        else if (in.equals("2")) {
                            double reduce = moatk/reduc;
                            transcendencehp -= reduce ;
                            System.out.println("YOU USE A UNIQUE SKILL \"THE CHOSEN ONE\"");
                            System.out.println("You have the Jurisdiction of the ALMIGHTY! and you received damage worth "+reduce);
                        }
                        else if (in.equals("3")) {
                            if(transcendencepot>0) {
                                transcendencehp += potionheal;
                                transcendencepot--;
                                System.out.println("YOU HAVE USED AN ELIXIR AND HEALED HP WORTH "+potionheal+" \nYour initial HP:"+transcendencehp);
                            }
                            else {
                                System.out.println("You don't have any elixir left");
                            }
                        }
                        else {
                            System.out.println("YOU HAVE JUST ESCAPED FROM A MERE!!!["+mob+"]\n\t--WHAT A COWARD--");
                            continue START;
                        }
                    }
                    if(transcendencehp<0) {
                        System.out.println("-----You are way too Weak------");
                        break;
                    }
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("YOU HAVE DEFEATED :"+ mob);
                    System.out.println("Current HP = " + transcendencehp);
                    System.out.println("-------------------------------------------------------------------------");
                    if (any.nextInt(100) < transcendencepot) {
                        transcendencepot++;
                        System.out.println(" [ The " + mob + " dropped a mysterious elixir. ]");
                        System.out.println("WOAH THE ELIXIR OF THE *???*");
                        System.out.println(" You now have " + transcendencepot + " elixirs left");
                        System.out.println("-------------------------------------------------------------------------");
                    }
                }
            }
            System.out.println("------------GAME OVER----------------");
            System.out.println("\tWOULD YOU LIKE TO BE REINCARNATED AGAIN?");
            System.out.println("---ENTER 1 FOR YES AND ENTER 0 IF NO---");
            con = user.nextInt();
            if (con==1) {
                System.out.println("reincarnating........");
                continue REINCARNATE;
            }
            else {
                System.out.println("\tGOODBYE CRUEL WORLD");
            }
        }
    }
}



