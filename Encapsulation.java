
//In Encapsulation Variable and method in same class
public class Encapsulation {

    private String mobileNum ="7798156445";

    private String photos;

    private  String name ="manik";

    //Getter Method to access private variable mobileNum
    public String  provider(){
        return mobileNum;
    }


    public void setMobileNum(String  mobileNum){
        this.mobileNum=mobileNum;
    }
}

class ExternalGroup extends Encapsulation{
    public static void main(String[] args) {

        ExternalGroup group=new ExternalGroup();

        long loginId=1L;

        if(loginId == 1L)
            group.setMobileNum(null);
        else
            group.setMobileNum("123456798");

        System.out.println(group.provider());

    }
}



