
package ClassPerson;

/**
 *
 * @author usuario
 */
public class Teacher extends Person{
    private Student class[];
    private Course teach;
    private int tam;
    
    public Teacher(){
        class=new Student[0];
        teach=new Course();
        int tam=0;
    }
    
    public Teacher(Teacher copy){
        this.tam=copy.tam;
        for(int i; i<this.tam; i++){
            this.class[i]=copy.class[i];
        }
        this.teach=copy.teach;
        this.class=copy.class;
    }
    
    public Teacher(String na, String su, String em ,Course teach, Student[] class2, String tama?o){
        this.setName(na);
        this.setSurname(su);
        this.setEmail(em);
        
        this.tam=Integer.parseInt(tama?o);
        for(int i; i<this.tam; i++){
            this.class[i]=class2[i];
        }
        this.teach=teach;
    }
    
    public void setTam(int tam){
        this.tam=tam;
    }
    
    public int getTam(){
        return this.tam;
    }
    
    public void setClass(Student[] class){
    for(int i; i<this.tam; i++){
            this.class[i]=class[i];
        }
    }
    
    public Student[] getClass(){
        return this.class;
    }
    
    public void setTeach(Course teach){
        this.teach=teach;
    }
    
    public Course getTeach(){
        return this.teach;
    }
    
    public String toString(){
        return "This teacher teaches a " + this.teach.toString + " class with this number of students " + this.tam)};
    }
        
    public Teacher clone(){
        Teacher clon=new Teacher(this);
        return clon;
    }
    
    public boolean equals(Teacher other){
        if(this.tam==other.tam && this.class==other.class && this.teach==other.teach){
            return true;
        }
        return false;
    }
}
