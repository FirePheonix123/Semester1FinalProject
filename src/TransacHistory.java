public class TransacHistory {
    private String history;
    private  int sID;
    private  int aID;
    public TransacHistory(){
        this.history = "";
        aID = 0;
        sID = 0;
    }

    public void incIDA(){
        aID++;
    }
    public void incIDS(){
        sID++;
    }

    public String getHistory() {
        return history;
    }

    public int getAID(){
        return aID;
    }
    public int getSID(){
        return sID;
    }

    public void updateHistory(String str){
        history += "\n" + str;
    }
}
