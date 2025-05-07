import java.util.ArrayList;
import java.util.Scanner;

public class Apex {

    public static void main(String[] args) {
        Legend giby = new Giby();
        giby.setHeath(100);
        giby.setMan(true);
        giby.setLegendaryStory("very gay");
        giby.setDm(30);
        Gun gun = new Gun();
        Inventar inventar = new Inventar();
        giby.setGun(gun);
        giby.setInventar(inventar);


        Pistol p2020 = new Pistol();
        gun.setPistol(p2020);
        p2020.setName("p2020");
        p2020.setClipSize(10);
        Nade fragGranade = new Nade();
        gun.setNade(fragGranade);
        fragGranade.setName("fragGranade");
        Rifle hamlock = new Rifle();
        hamlock.setName("hamlock");
        gun.setRifle(hamlock);
        hamlock.setClipSize(20);
        inventar.setInvSize(6);

        Legend revenant = new Revenant();
        revenant.setHeath(1000);
        revenant.setMan(true);
        revenant.setLegendaryStory("ahuienaya");
        revenant.setDm(55);
        Legend bloodhound = new Bloodhound();
        bloodhound.setHeath(100);
        bloodhound.setMan(true);
        bloodhound.setLegendaryStory("philosophic");
        bloodhound.setDm(40);
        Legend ash = new Ash();
        ash.setHeath(60);
        ash.setMan(false);
        ash.setLegendaryStory("long");
        ash.setDm(30);
        Legend pathfinder = new Pathfinder();
        pathfinder.setHeath(100);
        pathfinder.setMan(true);
        pathfinder.setLegendaryStory("main");
        pathfinder.setDm(20);


        //здесь создаётся лист с легендами
        ArrayList<Legend> legends = new ArrayList<>();
        legends.add(bloodhound);
        legends.add(revenant);
        legends.add(giby);
        legends.add(ash);
        legends.add(pathfinder);



        ArrayList<String> sories = new ArrayList<>();
        sories.add(ash.getLegendaryStory());
        sories.add(revenant.getLegendaryStory());
        sories.add(giby.getLegendaryStory());
        sories.add(bloodhound.getLegendaryStory());
        sories.add(pathfinder.getLegendaryStory());
        Apex apex = new Apex();
        apex.printAnyList(sories);







        //Apex apex = new Apex();

        //Apex.printAllLegends(legends);
        //System.out.println(giby.getHeath());
        //ArrayList<String> names = new ArrayList<>();
        //names.add(ash.getLegendaryStory());
        //names.add(revenant.getLegendaryStory());
        //names.add(giby.getLegendaryStory());
        //names.add(bloodhound.getLegendaryStory());
        //names.add(pathfinder.getLegendaryStory());
        //apex.printAnyList(names);
        ArrayList<Object> allStats = new ArrayList<>();
        allStats.add(ash.getHeath());
        allStats.add(ash.getLegendaryStory());
        allStats.add(ash.getHeath());
        allStats.add(ash.isMan());
        allStats.add(revenant.getHeath());
        allStats.add(revenant.getLegendaryStory());
        allStats.add(revenant.getHeath());
        allStats.add(revenant.isMan());
        allStats.add(bloodhound.getHeath());
        allStats.add(bloodhound.getLegendaryStory());
        allStats.add(bloodhound.getHeath());
        allStats.add(bloodhound.isMan());
        allStats.add(giby.getHeath());
        allStats.add(giby.getLegendaryStory());
        allStats.add(giby.getHeath());
        allStats.add(giby.isMan());
        //apex.printObjectList(allStats);
//        apex.task4(legends);
        apex.duel(ash, bloodhound);
        giby.smallHealUp(25);
        System.out.println(giby);


    }
    public void printAnyList(ArrayList<String> stories) {

        for (String story : stories) {
            System.out.println(story);
        }

    }


   //public void printObjectList(ArrayList<Object> allStats) {
   //   for (Object stats : allStats) {
   //       if (stats instanceof String){
   //           System.out.println(stats);
   //       }
   //       if (stats instanceof Boolean) {
   //           Boolean s = (Boolean) stats;
   //           if (s == true) {
   //               System.out.println(false);
   //           }
   //           if (s == false) {
   //               System.out.println(true);
   //           }
   //       }
   //       if (stats instanceof Integer) {
   //           Integer d = (Integer) stats;
   //           System.out.println(d * 2);
   //       }

   //   }

   //}



    public static void printAllLegends(ArrayList<Legend> legends) {
        for (Legend legend : legends) {
            legend.shoots();
            legend.quot();
            legend.jumps();
            legend.actInLobby();
            legend.loot();
            legend.kill();
        }

    }
    public void task4 (ArrayList<Legend> legends) {
        for (Legend legend : legends) {
            if (legend instanceof Giby) {
                Giby giby = (Giby) legend;
                System.out.println(giby.getLegendaryStory());
            }
            if (legend instanceof Revenant) {
                System.out.println(legend.isMan());
            }
            if (legend instanceof Ash) {
                System.out.println(legend.getHeath());
            }

        }
    }
    public void duel (Legend legend1, Legend legend2) {
        int healthLeftLegend1 = legend1.getHeath();
        int healthLeftLegend2 = legend2.getHeath();


        while (healthLeftLegend1 > 0 && healthLeftLegend2 > 0) {

            healthLeftLegend1 = legend1.getHeath() - legend2.getDm();
            legend1.setHeath(healthLeftLegend1);
            healthLeftLegend2 = legend2.getHeath() - legend1.getDm();
            legend2.setHeath(healthLeftLegend2);

            logikQuot(legend2, healthLeftLegend1);
            logikQuot(legend1, healthLeftLegend2);

        }
    }

    private void logikQuot(Legend legend2, int healthLeftLegend1) {
        if (healthLeftLegend1 <= 0) {
            System.out.println(legend2.getClassName() + " wins");
            legend2.quot();
        }
    }





}