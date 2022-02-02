package chapter9_lang_utils;

import chapter7_OOP2.Point;

public class Point3D {
    int x,y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
        this(0, 0, 0);
    }

    public boolean equals(Object obj) {
        Point3D tmp = (Point3D) obj;
        if ((tmp.x == this.x) && (tmp.y == this.y) && (tmp.z == this.z)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "[x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
