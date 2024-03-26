package PackWork;

import PackWork.AbstractClass;

public class ExecutionTime extends AbstractClass{
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    
    public void afisareAtribute(){
        System.out.println(startTime + " " + endTime);
    }

    @Override
    public void method() {
        System.out.println("clasa ExecutionTime");
    }
}
