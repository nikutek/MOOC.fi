
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<String> exerciseList;

    public ExerciseManagement() {
    this.exerciseList = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList(){
        return this.exerciseList;
    }
    
    public void add(String exercise){
        exerciseList.add(exercise);
    }


    

}
