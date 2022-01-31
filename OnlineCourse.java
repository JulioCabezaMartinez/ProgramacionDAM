package Github;

/**
 *
 * @author JulioCabeza
 */
public class OnlineCourse {
    protected String name;
    protected String ID;
    protected int duration;
    protected String teacher;
    
    private boolean validName(String name){
        if(name.length()<4){
            return false;
        }
        return true;
    }
    
    private String correctTeacher(String teacher){
        String name="";
        String subname="";
        for (int i=0; i<teacher.length()-1; i++){
            if (teacher.charAt(i)== ' '){
                name=teacher.substring(0, i);
                subname=teacher.substring(i+1);
            }
        }
        return name + ", " + subname;
    }
    
    private boolean validId(String id){
        if(id.charAt(0)==name.charAt(0) && id.charAt(id.length()-1)==teacher.charAt(0)){
            return true;
        }
        return false;
    }
    
    private boolean validDuration(int duration){
        if(duration <=30){
            return true;
        }
        return false;
    }
    
    public OnlineCourse(){
        this.name="";
        this.ID="";
        this.duration=0;
        this.teacher="";
    }
    
    public OnlineCourse(String name, String ID, int duration, String teacher){
        this.name=validName(name);
        this.ID=validId(ID);
        this.duration=validDuration(duration);
        this.teacher=correctTeacher(teacher);
    }
    
    public OnlineCourse(OnlineCourse copia){
        this.name=copia.name;
        this.ID=copia.ID;
        this.duration=copia.duration;
        this.teacher=copia.teacher;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setId(String id){
        this.ID=id;
    }
    
    public void setDuration(int duration){
        this.duration=duration;
    }
    
    public void setTeacher(String teacher){
        this.teacher=teacher;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getId(){
        return this.ID;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    public String getTeacher(){
        return this.teacher;
    }
    
    public String toString(){
        return "The name of Course is " + this.name + ", with ID: " + this.ID + ", with a duration of " + this.duration + " hours and the teacher is " + this.teacher;
    }
    
    public void clone(OnlineCourse copia){
        this.ID=copia.ID;
        this.name=copia.name;
        this.duration=copia.duration;
        this.teacher=copia.teacher;
    }
    
    public boolean equals(OnlineCourse compa){
        if(compa.name.equals(this.name) && compa.ID.equals(this.ID) && compa.duration==this.duration && compa.teacher.equals(this.teacher)){
            return true;
        }
        return false;
    }
}
