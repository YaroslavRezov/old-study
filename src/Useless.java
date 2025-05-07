import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Useless {
    public static int seesh = 0;
    public static final ArrayList<String> checkingStaticAr = new ArrayList<>();
    public int asdfg = 5;
    public static int asdfgh;
    int hoh;
    int lolhoh;
    String haha;
    private int uselessNum;
    static boolean catchDetector = false;


    //  private static Object s;
    //  String result = "done";
    //  int dick;
    //  long cock = 12345L;

    //int x; has default initialization
    // private String brand;
    // private boolean empty;
    // public void shed () {
    //    dick = 6;
    //  public static void main(String... _ags) {
    //  long cock = 12345L;
    // int g = 124;
    //int g = null; doesn't work
    //String gay = null; works, cuz it only unprimitives can point on nothing, so null
    //String gay = "fewfwf"; fine
    //int lean = gay.length(); fine
    //int lesb = lean.lenght(); you got bamboozled, primitives doesnt have methods
    //int s3, s2, s1 = 5; only s1 is initialized, other are only declared
    // int s5 = 5, int s6 = 6 is illegal as int s6, String s8;
    //  Useless useless = new Useless();
    //System.out.println(s);
    // int x = 1_000000;
    //  double d = 1_234_.0; doesnt work
    //  double d2 = 1_234._0; doent work
    //  double d4 = 1_234.0_; doesnt work
    //  double d5 = 1_234.0;
    //useless.shed();

    //int h =12;
    //short x = h; doesnt comlpie
    //  int i = 11;
    // long v = i;
    //  float h = i;
    //  int d = h;
    //  System.out.println(useless.dick);
    //useless.bullshit();
    //int rel = useless.bullshit();     ahtung!!
    //System.out.println(rel);
    //  System.out.print("Empty = " + useless.empty);
    //  System.out.print("Empty = " + useless.brand);
    // int g = 5;
    //System.out.println(g);
    // public void bullshit() {
    //    int x; hasn't default initialization
    //    int y = 20;
    //    int rel = x + y;
    //    return rel;
    //}
    //     System.out.println("gay");
    //
    //int x7 = 9L; doesnt cuz L for long like float and requers cast
    // int x = 0b101;
    // int x1 =0xE;
    // double x3 = 0xE;
    //double x4 = 1_2_.0_0; shit
    //int x6 = 1_2_; shit but 1_2_3 fine

    // Ash ash1 = new Ash();
    // Ash ash2 = new Ash();
    // Ash ash3 = ash1;
    //  int x = 5;
    //  float d = 5.6f;
    //  double f = 55.66;
    //  double h = x + d + f;
    //  System.out.println(h);
    //  int x = 10000000;
    //  int y = 70;
    //  boolean g = false;
    // int d = x / y;
    // System.out.println(!g); if ! then false > true and reverse
    //  short d = 14;
    // short v = 15;         OIIIII!!!
    // short i = (short) (v + d);  when you try to make some shit as + = / * it automatically trans to int
    //long x = 5;
    // int y = 10;
    //           !!!!without cast!!!!
    // x += y;
    // System.out.println(x);
    //  int x = 6;
    //  int v = (x=5); instantly initialize as 5 gets x
    //  int
    //  System.out.println(x);
    //  int x = 5;
    //  int y = 5;
    //  System.out.println(x == y);
    //  if (x == 4)
    //       System.out.println("dick");
    //  int y = 2;
    //  int x = (y > 5) ? (2 * y) : (3 * y);  tell to sasha at lease once in every damn situation
    // System.out.println(x);
    //  int x = 0;
    //  while (x < 2) {
    //      x++;
    //      if (x == 2)
    //          System.out.println(x);
    //  }
    //  for ( ; ; ){
    //      System.out.println("infinite"); бескончный for выглядит так
    //  } for each is only for collections arrays and those eho implements  java.lang.iterable
    //  ArrayList<String> values = new ArrayList<>();
    //  values.add("dick");
    // values.add("cock");
    //  int r = 0;
    //  for ( ; r < values.size();r++) {
//
    //     System.out.println(values.get(r));
    // }
    // Iterator<String> i = values.iterator();
    // while (i.hasNext()) {
    //     String value = i.next();
    //     System.out.println(value);
    // }
    // OUTER_LOOP: for (int t = 5; t<0; t--) {}
    //   OTHER_LOOP...
    //    break OUTER_LOOP;
    // int d = 2;
    //   d += 2 ;
    //      System.out.println( d + "d");
//
//
//
//
//
//
    //    //  for (int i = 0; ; i++) System.out.print(i);
//
//
//
    //  }
    //  public void go (long x) {
    //      System.out.println(x);


    //   }


    public static void main(String[] args) {
        // byte x = 5;
        // byte y = 10;
        // int z = x + y;
        // int x = 0;
        // while (x++ < 10) {}
        // String massage = x > 10 ? "Grater than" : false;
        // System.out.println(massage);
        // long x = 10;
        // int y = (int) (x) * 2;  or (int) (2 * x)
        // List<Integer> list = new ArrayList<Integer>();
        // list.add(10);
        // list.add(14);
        // for (int x : list) {
        //     System.out.println(x + ", ");
        //     break;
        // }
        // int x = 4;
        // long y = x * 4 - x++;
        // System.out.println(y);
        // if (y<10) System.out.println("too low");
        // else System.out.println("just right");
        // else System.out.println("too Hihgh");
        // int x = 5;
        // if (x > 2) {
        //     if (x < 4) {
        //         System.out.println(10);
        //     }
        //     else System.out.println(8);
        // } else System.out.println(7);
        // System.out.println(x > 2 ? (x < 4 ? 10 : 8) : 7);
        // boolean x = true, z = true;
        // int y = 20;
        // x = ( y != 10 ) ^ (z = false);
        // System.out.println(x+", "+y+", "+z);
        // for(int i=1; i < 10; ++i ) {
        //     System.out.println("Zdarova, suka");
        // }
        // byte  a = 40, b = 50;
        // byte sum= (byte) (a + b);
        // System.out.println(sum);
        // int x = 50 % 3;
        // System.out.println(x);
        // int x = 0;
        // String s = null;
        // if (x==s) {
        //     System.out.println("cock");
        // } else System.out.println("dick");
        //
        // int x1= 50, x2=75;
        // boolean b =x1 >= x2;
        // if(b = true) System.out.println("cock");
        // else System.out.println("dick");
        // int c =7;
        // int res = 4;
        // res += c;
        // System.out.println(res);
        // int x = 1, y = 15;
        // while (x < 10)
        //     y--;
        //             x++;
        // System.out.println(x+", "+ y);
        // do {
        //     int y = 1;
        //     System.out.println(y++ + " ");
        // } while (y <= 10); y isnt seeable maybe do isnt loop statement
        // boolean keepshitting = true;
        // int result = 15, i = 10;
        // do {
        //     i--;                       вернулось и разок еще минуснуло
        //     if(i==8) keepshitting = false;
        //     result -=2;
        // } while (keepshitting);
        // System.out.println(result);
        //  int count = 0;
        // ROW_LOOP: for (int row = 1; row <=3; row++)
        //     for (int col = 1; col <= 2; col++) {
        //         if(row * col % 2 == 0) continue ROW_LOOP;
        //         count++;
        //     }
        //  System.out.println(count);
        // int m = 9, n =1, x = 0;
        // while (m > n) {
        //     m--;
        //     n += 2;
        //     x += m / n;
        // }
        // System.out.println(x);
        // final char a = 'A', d = 'D';
        // char grade = 'B';
        // switch (grade) {
        //     case a:
        //     case 'B': System.out.println("great");
        //     case 'C': System.out.println("good"); break;
        //     case d:
        //     case 'F': System.out.println("blyat");
        //
        // }
        // String d = "hello world";
        // String[] strings = d.split("o");
        // System.out.println(strings.length);
        // for (String string : strings)
        // System.out.println(string);
        // d.concat(" hello");
        // System.out.println(d);
        // String s = "1";
        // s += 1;
        // s +=1;
        // s+= "1";
        // System.out.println(s);
        // String s ="Сидаров";
        // String replace = s.replace("С", "П");
        // String sa = new String ("Sasha");
        // String pa = new String ("Sasha");
        // System.out.println(sa.hashCode());
        // System.out.println(pa.hashCode());

        // System.out.println(sa == pa);

        // System.out.println(replace);
        // String mes = " Ты чё, бля ";
        // String rep = null;
        // boolean hasSwear = mes.contains("бля");
        // if (hasSwear) {
        //     rep = mes.replace("бля", "***");
        // }
        // System.out.println(rep);
        // int dick[], cock; frist is [] second is int bruh shit
        //String mes = " пиздец как мнгого времени ";
        // String rep = null;
        // boolean hasSwear = mes.contains("пиздец");
        // if (hasSwear) {
        //     rep = mes.replace("из", "**");
        // }
        // System.out.println(rep);


        // System.out.println("ABC".contains("ABC"));
        // System.out.println("ABC".startsWith("AB"));
        // int [] dick = new int [3];
        // dick[0]=1;
        // dick[1]=2;
        // dick[2]=3;
        // int dick1[] = new int[] {1, 2, 3 };
        // int[] dick2 = new int[] {1, 3, 2, 4, 5 };
        // int[][] pop = new int[][] {dick, dick1, dick2};
        // Arrays.sort(dick2);
        // for(int cock : dick2) {
        //     System.out.println(cock);
        // }

        // int[][] pop1= new int[3][dick2.length];
        // for (int outer1 = 0; outer1 < pop1.length; outer1++) {

        // }
        // pop1[0] = dick;
        // pop1[1] = dick1;
        // pop1[2] = dick2;
        // for (int outer = 0; outer < elMassive.length; outer++) {

        //     System.out.print("|");
        //     for (int inner = 0; inner < elMassive[outer].length; inner++) {

        //         int innerStrinner = elMassive[outer][inner];
        //         String bob = Integer.toString(innerStrinner);
        //         if(bob.length() == 1)
        //             System.out.print(elMassive[outer][inner] + "     |");
        //         else
        //             System.out.print(elMassive[outer][inner] + "  |");
        //     }
        //     System.out.println(" ");
        //     //System.out.println("___________");
        // }
        // first is numbering, second is showing
        // int[] elMassive = new int[]{7, 4, 2, 5, 1};
        // ArrayList<Integer> List = new ArrayList<>();
        // java.util.List<int[]> List1 = Arrays.asList(elMassive);
        /*
        el test
         */
        // int numFish = 4;
        // String fish = "tuna";
        // String anfish = numFish + 1;
        // StringBuilder booba = new StringBuilder("cock");
        // StringBuilder dicka = new StringBuilder(booba.substring(1,3));
        // booba.substring(1,3);
        // System.out.println(dicka);
        // String s = "hello";
        // String t = new String(s);
        // System.out.println(t);
        // if ("hello".equals(s)) System.out.println("one");
        // if (t == s) System.out.println("two");
        // if (t.equals(s)) System.out.println("three");
        // if ("hello" == s) System.out.println("four");
        // if ("hello" == t) System.out.println("five");
        // StringBuilder sb = new StringBuilder();
        // sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        // System.out.println(sb);
        // String s = "java";
        // String ss = new String("java");
        // ss = "java";
        // StringBuilder sb = new StringBuilder("java"); eve equals shows false
        // if (s == (sb) ) {
        //     System.out.println(true);
        // }
        //  String roar1 = "roar";
        //  StringBuilder roar2 = new StringBuilder("roar");
        //  new Useless().roar(roar1, roar2);
        //  System.out.println(roar1 + " " + roar2);
        //  String letters = "abcdef";
        //  System.out.println(letters.length());
        //  System.out.println(letters.charAt(3));
        //  System.out.println(letters.charAt(6));
        //  String num = "012345678";
        //  System.out.println(num.substring(1, 3));
        //  System.out.println(num.substring(7, 7));
        //  System.out.println(7);
        //  String s = "purr";
        //  s.toUpperCase();
        //  s.trim();
        //  s.substring(1, 3);
        //  s += " two";
        //  System.out.println(s.length());
        //  System.out.println(s);
        // String s = " 6";
        // s += 2;
        // s += 'c';
        // s += false;
        // if (s == "2cfasle") System.out.println("cock");
        // if (s.equals("2cface")) System.out.println("dick");
        // int num = 0;
        // StringBuilder sb = new StringBuilder("abcdefg");
        // num += sb.substring(1, 2).length();
        // // num += sb.substring(6, 6).length();
        // num += sb.substring(6, 5).length();
        // System.out.println(num);
        // StringBuilder sb = new StringBuilder("0123456789");
        // sb.delete(2, 8);
        // sb.append("-").insert(2, "+");
        // System.out.println(sb);
        // StringBuilder b = "rumble";
        // b.append(4).
        //  StringBuilder puzzel = new StringBuilder("Java");
        // puzzel.append("vaj$").substring(0, 4);
        // puzzel.append("vaj$").delete(0, 3).deleteCharAt(puzzel.length() - 1);
        // puzzel.append("vaj$").delete(0, 3).delete(0, 3).deleteCharAt(puzzel.length());
        // System.out.println(puzzel);
        //  int[][] dick = new int[5][];
        //  Object[][][] cock = new Object[3][0][5];
        // String beans[] = new beans[6];
        //  java.util.Date[] dates[] = new java.util.Date[2][];
        //  int[][] jeans = new int[];
        // char[] c = new char[2];
        // int lenth = c.length;
        // int lenth = c.capacity(); -
        // int lenth = c.capacity; -
        // int lenth = c.length();-
        // int lenth = c.size(); -
        // int lenth = c.size; -
        // int lenth = c.
        //  ArrayList list = new ArrayList();
        //  int l = list.capacity();
        //  l = list.capacity;
        //  l = list.lenght;
        //  l = list.lenght();
        //  l = list.size;
        //  l = list.size();
        // List<String> list = new ArrayList<String>();
        // list.add("one");
        // list.add("two");
        // list.add(7);
        // for (String s : list) System.out.println(s);
        //  ArrayList<Integer> list = new ArrayList<>();
        //  list.add(4);
        //  list.add(5);
        //  list.set(1, 6);
        //  list.remove(0);
        //  for (Integer v : list) {
        //      System.out.println(v);
        //  }
        // int[] random = {6, -4, 12, 0, -10};
        // int x  = 12;
        // int y = Arrays.binarySearch(random, x);
        // System.out.println(y);
        // ArrayList<String> cock = new ArrayList<>();
        // try {
        //     cock.remove(0);
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println(cock);
        // }
        //  ArrayList<String> dick = new ArrayList<>();
        //  dick.add("penis");
        //  System.out.println(dick.equals(cock));
        // String[] cock = new String[2];
        // cock[0] = "penis";
        // cock[1] = "pop";
        // String[] dick = new String[2];
        // dick[0] = "penis";
        // dick[1] = "pop";
        // System.out.println(dick.equals(cock));
        // List<Integer> list = Arrays.asList(10, 4 ,-1, 5);
        // Collections.sort(list);
        // Integer array[] = list.toArray(new Integer[4]);
        // System.out.println(array[0]);
        // String names[] = {"Tom", "Dick", "Seer"};
        // List<String> list = new ArrayList<>( names.asList());
        // names1 = names.asList();
        // list.set(0, "Sue");
        // System.out.println(names[0]);
        // List<String> hex = Arrays.asList("30", "8", "3A", "ff");
        // Collections.sort(hex);
        // int x = Collections.binarySearch(hex, "8");
        // int y = Collections.binarySearch(hex, "3A");
        // int d = Collections.binarySearch(hex, "4F");
        // System.out.println(x + " " + y + " " + d);
        // List<Integer> cocks = new ArrayList<>();
        // cocks.add(Integer.parseInt("5"));
        // cocks.add(Integer.valueOf("6"));
        // cocks.add(7);
        // cocks.add(null);
        // for (int cock : cocks) {
        //     System.out.println(cock);
        // }
        //  List<String> one = new ArrayList<>();
        //  one.add("abc");
        //  List<String> two = new ArrayList<>();
        //  two.add("abc");
        //  if (one == two) {
        //      System.out.println("A");
        //  } else if (one.equals(two)) {
        //      System.out.println("B");
        //  }
        //  else {
        //      System.out.println("C");
        //  }
        //  LocalDate date = LocalDate.of(2014, Month.JUNE, 21);
        // LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        // date.plusDayes(2);
        // date.plusHours(3);
        // System.out.println(date.getYear());
        // LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        // date.plusDays(2);
        // date.plusYears(3);
        // System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        // LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        // Period p = Period.of(1, 2, 3);
        // d = d.minus(p);
        // DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        // System.out.println(d.format(f));
        // LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        // Period p = Period.ofDays(1).ofYears(2);
        // d = d.minus(p);
        // DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        // System.out.println(f.format(d));
        /* el task

         */
        // LocalDateTime date = LocalDateTime.now();
        // date = date.plusHours(3);
        // System.out.println(date);
        // Date date2 = new Date(2022, Calendar.JANUARY, 30);
        // Calendar date3 = Calendar.getInstance();
        // Date dateCock = new Date(2022, Calendar.JANUARY, 30);
        // date3.setTime(dateCock);
        // date3.add(Calendar.DATE, 3);
        // date3.setTime(dateCock);
        // System.out.println(date3);
        Useless useless = new Useless();
        // useless.MakeDate(date2);
        // System.out.println(useless.MakeDate(date2));
        // LocalDate dateShit = LocalDate.of(2022, 1,27);
        // does it crate under var sout(LocalDate.of(2022, 1,22))
        // LocalDateTime dateBullShit = LocalDateTime.of(2022, 1, 27, 1, 0);
        // DateTimeFormatter ForDateBullShit = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        // DateTimeFormatter ForDateBullShit1 = DateTimeFormatter.ofPattern("MM dd, yy");
        // DateTimeFormatter ForDateBullShit2 = DateTimeFormatter.ofPattern("dd, MM");
        // DateTimeFormatter ForDateBullShit3 = DateTimeFormatter.ofPattern("hh:mm");
        // System.out.println(dateBullShit.format(ForDateBullShit));
        // System.out.println(dateBullShit.format(ForDateBullShit1));
        // System.out.println(dateBullShit.format(ForDateBullShit2));
        // System.out.println(dateBullShit.format(ForDateBullShit3));
        // dateBullShit.format(ForDateBullShit3));
        // LocalDateTime fuck = LocalDateTime.now();
        //System.out.println(fuck.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        //int dick = useless.cock(5);
        //System.out.println(dick);
        // cocking(); works becous static
        // checkingStaticAr.add("shit");
        /* checkingStaticAr.add("cum"); fine because valeus are ref. type
         */
        // checkingStaticAr.remove(1);
        // System.out.println(checkingStaticAr);
        // asdfgh = useless.asdfg;
        // System.out.println(asdfgh); // thats how you can get instance var value
        // System.out.println(useless.hoh);
//        int num = 4;
////        System.out.println(num);
//        Integer i = new Integer(2);
//        useless.hah(i);
//        useless.hah(i);
        //System.out.println(hoh);
//        useless.setUselessNum(1);
//        useless.setUselessNum(-1);
//        System.out.println(useless.getUselessNum());
        /*
        el test chapter 4
         */
//        useless.unknown(true);
//        useless.unknown(true, true);
//        useless.unknown(true,  true, true);
//        useless.unknown(true, {ture});
//        useless.unknown(true, {true, ture});
//        useless.unknown(true, new boolean[2]);


        /*
        super() for calling cons from ancestor
         */

        /*
        test 5
         */
        Useless useless1 = new Useless();
//        try {
//            useless1.lovly(false);
//        } catch (NullPointerExceptionSub ex){
//            System.out.println(ex.getLocalizedMessage());
//        }
//         catch (NullPointerException e) {
////            useless1 = new Useless();
////            catchDetector = true;
////            if (catchDetector == true) {
////                useless1.lovly();
////            }
//             System.out.println(e.getLocalizedMessage());
//
////            System.exit(0);
//        }
//
//        finally {
//            System.out.println("who cares ^\n" +
//                    "        / | \\\n" +
//                    "       /  |  \\\n" +
//                    "          |, when we have finally");
//        }
//        System.out.println("shit");
        /*
        test 6
         */
//        char cock = '1';
//        int dick = 1;
//
//        System.out.println(dick);


        

    }


    /*
el test  ^
       / | \
      /  |  \
         |
         chapter 6
 */
    public void lovly (boolean catchDetector) {
        if (catchDetector) {
            throw new NullPointerExceptionSub("fuck sub");
        }
        else {
            throw new NullPointerException("super fuck");
        }
    }

    /*
    i have written nothing
el test  ^
       / | \
      /  |  \
         |
         chapter 5
 */

//    public int unknown(boolean b, boolean... b2) {
//        return b2.length;
//    }
//    public void more7(int... nums) {}
//    public void more6(String s, int... nums) {}
//    public void more5(int... nums, String s) {} shit
//    public void more4(String... s, int... nums) {} shit
//    public void more3(String[] s, ...int nums) {} shit
//    public void more2(String... s, int[] nums) {} shit
//    public void more1(String[] s, int[] nums) {}
//    public int methodReturnIntNull() {
//        return null;  shit, but would work with string
//    }
//    public int methodReturnSemicolon() {
//        return; shit
//    }
//    public int methodReturnBareInt() {
//        return 9; works
//    }
//    public void methodReturnVoidNull() {
//        return null; shit
//    }
//    public void methodReturnVoid() {
//        return; WORKS!!!!
//    }
//    final static void method4() {}
//    static final void method5() {}
//    void final method90 {} shit
//   final void method() {}
/*
el test  ^
       / | \
      /  |  \
         |
         chapter 4
 */
//    public int getUselessNum() {
//        return uselessNum;
//    }
//    public void setUselessNum(int uselessNum) {
//        if(uselessNum >= 0) {
//            this.uselessNum = uselessNum;
//        }
//    }oi
//
//
//   public Useless(int hoh, int lolhoh) {
////       System.out.println(hoh);
////       this(hoh, lolhoh, "dick");
//   }
//   public Useless(int hoh, int lolhoh, String haha) {
//       this.lolhoh = lolhoh;
//       this.hoh = hoh;
//       this.haha = haha;
//   }
//   public static void eatingShit(int num) {
//        num = 8;
//   }
//    public int hoh;
//    {
//        hoh = 10;
//        System.out.println(this.hoh);
//    }


    // public void setHoh(int hoh) {
    //     this.hoh = hoh;
    // }
    // public int getHoh() {
    //      return this.hoh;
    // }
    //
//    public void hah (int dick) {
////        System.out.println(dick);
//    }
//    public void hah (Object o){
////        System.out.println(o);
//    }
//
//    public static final int BUCKET_OF_CUM = 100;
//     protected void cock() {
//        // BUCKET_OF_CUM = 5;
//        System.out.println("cock");
//    }
//     static void cocking() {
//        System.out.println("cocking");
//    }

    // long cock() {
    //     return 9L;
    // }
    //int cock (int a) {
    //      if (a == 5) {
    //          return a;
    //      }
    //      else
    //      return 0;
    // }
    //     System.out.println("cock");
    // }
    //  public Date MakeDate (Date date) {
    //      Calendar cal = Calendar.getInstance();
    //      cal.setTime(date);
    //      cal.add(Calendar.HOUR, 3);
    //      return (Date) cal.getTime();
    // }
    // public void roar(String roar1, StringBuilder roar2) {
    //     roar1.concat("bruh");
    //     roar2.append("bruh");
    // }

}




