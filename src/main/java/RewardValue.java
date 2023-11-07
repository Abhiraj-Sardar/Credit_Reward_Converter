
class RewardValue {
    double cash;
    float miles;
    public RewardValue(double cash){
        this.cash=cash;
    }
    public RewardValue(float miles){
        this.miles=miles;
    }
    public double getCashValue(){
        return miles*0.0035;
    }
    public double getMilesValue(){
        miles=(float)cash/(float)0.0035;
        return miles;
    }

}
