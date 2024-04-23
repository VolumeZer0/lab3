public class Sc implements StringChecker{
    public Sc(){
        
    }

    public boolean checkString(String s){
        if(s.substring(0,1).equalsIgnoreCase("k")){
            return true;
        }
        return false;
    }
}