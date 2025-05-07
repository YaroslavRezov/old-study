public class YesJava46SuperSub extends YesJava46Super {
    int max(int x, int y)  {
        return 2 * super.max(x, y) ;
    }
}
