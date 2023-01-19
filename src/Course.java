public class Course {
    private int id;
    private String teacherName;
    private String studentName;

    public Course(int id, String teacherName, String studentName) {
        if( id < 0){
            System.out.println("error 404!");
        }else {
            this.id = id;
        }

        if (teacherName.isEmpty()){
            System.out.println("Error 404!");
        }else {
            this.teacherName = teacherName;
        }

        if (studentName.isEmpty()){
            System.out.println("Error 404!");
        }else {
            this.studentName = studentName;
        }
    }

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if( id < 0){
            System.out.println("error 404!");
        }else {
            this.id = id;
        }
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        if (teacherName.isEmpty()){
            System.out.println("Error 404!");
        }else {
            this.teacherName = teacherName;
        }
    }

    public String getStudentName() {

        if (studentName.isEmpty()){

            return "Error 404!";
        }else {

            return studentName;
        }

    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
