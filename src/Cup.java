public class Cup {
    private String liquidType;
    private int precentageFul;


     public Cup (int precentageFul, String liquidType){
         this.liquidType = liquidType;
         this.precentageFul = precentageFul;
    }
    public int getPrecentageFul (){
         return precentageFul;
    }
    public String getLiquidType(){
         return liquidType;
    }

    public void setPrecentageFul(int precentageFul){

         if (precentageFul >100 || precentageFul <0){
             throw new IllegalArgumentException("NO don't do this");
         }
         this.precentageFul = precentageFul;
    }
    public void setLiquidType(String liquidType){
         if (liquidType==null){
             return;
         }
         this.liquidType = liquidType;
    }

    public boolean isEmpty(){
         return precentageFul == 0;
    }



}

