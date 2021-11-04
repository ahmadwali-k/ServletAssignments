package revature.Day3;

/**
 * good
 * code example with access modifiers and getters and setters
 */
class Student {
    private int id;
    private String name;
    private int passMark = 40;

    public int getId(){
        return id;
    }

    public void setId(int id) throws Exception {
        if(id < 0)
            throw new Exception("id cannot be -ve");
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isEmpty()){
            throw new Exception("name cannot be blank");
        }
        this.name = name;
    }

    public int getPassMark(){
        return this.passMark;
    }

}

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setId(2);
        student.setName("abc");

//        student.id = -1;
//        student.name = null;
//        student.passMark = 20;

        System.out.println("Student: Id = " + student.getId() + ", Name = "+
                student.getName() + ", Pass Mark = " + student.getPassMark());
    }
}

