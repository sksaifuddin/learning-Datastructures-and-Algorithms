class Student {
    int id;
    String name;
}

class TestStudent {
    public static void main( String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "saif";
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
}