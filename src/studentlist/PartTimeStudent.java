package studentlist;

/**
 *
 * @author HP jan 2021
 */
public class PartTimeStudent extends Student {
    
    // this is done
    
    private int numCourses;

    public PartTimeStudent(int numCourses, String name) {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
  
}
