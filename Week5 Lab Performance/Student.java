class Student{
    private int studentId;
    private String name;
    private double marks;

    public void setStudentId(int id){
        if(this.studentId!=0 && id!=this.studentId){
            System.out.println("Updating student information...");
        }
        if(id>=0){
        this.studentId=id;
        }
        else{
            System.out.println("Invalid student ID! ID must be positive.");
        }
    }

    public void setName(String name){
        if(this.name!=null && !name.equals(this.name)){
            System.out.println("Updating student information...");
        }
        this.name=name;
    }

    public void setMarks(double marks){
        if(this.marks!=0 && marks!=this.marks){
            System.out.println("Updating student information...");
        }
        if(marks>=0 && marks<=100){
        this.marks=marks;
        }
        else{
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        }
    }

    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }

    public void displayInfo(){
        System.out.println("ID: "+getStudentId());
        System.out.println("Name: "+getName());
        System.out.println("Marks: "+getMarks());
        System.out.println();
        System.out.println();
    }

} 