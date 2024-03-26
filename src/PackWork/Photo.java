package PackWork;

import PackWork.ExecutionTime;

public class Photo extends ExecutionTime{
    int height;
    int width;
    
    public void afisareAtribute(){
        System.out.println(this.getStartTime() + " " + this.getEndTime() + " " + height + " " + width);
    }
    
    @Override
    public void method() {
        System.out.println("clasa Photo");
    }
}

