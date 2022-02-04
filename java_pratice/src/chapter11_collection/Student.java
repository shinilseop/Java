package chapter11_collection;

public class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    int total;
    int schoolRank;
    int classRank;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        this.total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage() + "," + schoolRank + "," + classRank;
    }

    @Override
    public int compareTo(Object o) {
        return ((Student) o).total - this.total;
    }
}
