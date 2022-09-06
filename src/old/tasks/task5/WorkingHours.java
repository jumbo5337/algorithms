package old.tasks.task5;


public class WorkingHours {

  private int beginHH;
  private int beginMM;
  private int endHH;
  private int endMM;
  private int beginMin;
  private int endMin;

    public int getBeginMin() {
        return beginMin;
    }

    public int getEndMin() {
        return endMin;
    }

    public WorkingHours(int beginHH, int beginMM, int endHH, int endMM) {
        this.beginHH = beginHH;
        this.beginMM = beginMM;
        this.endHH = endHH;
        this.endMM = endMM;
        this.beginMin = beginHH*60+beginMM;
        this.endMin = endHH*60+endMM;
    }


    @Override
    public String toString() {
        return "Начало рабочего дня в " + beginHH + ":" + beginMM + "\n"+
                "Конец рабочего дня в " + endHH + ":" + endMM;
    }
}
