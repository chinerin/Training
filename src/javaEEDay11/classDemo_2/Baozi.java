package javaEEDay11.classDemo_2;

/**
 * @PackageName:javaEEDay11.classDemo_2
 * @ClassName:Baozi
 * @Description:
 * @author: CK
 * @data: 2020/7/7 17:29
 */
public class Baozi {
    private boolean isHaveBaozi = false;

    public Baozi() {
    }

    public Baozi(boolean isHaveBaozi) {
        this.isHaveBaozi = isHaveBaozi;
    }

    public boolean isHaveBaozi() {
        return isHaveBaozi;
    }

    public void setHaveBaozi(boolean haveBaozi) {
        isHaveBaozi = haveBaozi;
    }
}

