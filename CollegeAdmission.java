
// college admission
public class CollegeAdmission {

    //Static variable
    static int totalseat=1000;

    //instance variable
    int seatFilled=0;


    //Function for available seat
    public int availableSeat(){
        int aSeat= totalseat-seatFilled;
        return aSeat;
    }

    //function for admission of the student if seat is available
    public void admissionStudent(){
        if(seatFilled<totalseat){
            seatFilled++;
            System.out.println(" Your admission is conform:"+ seatFilled);
        }else {
            System.out.println("No seats is available ");
        }
    }

    public static void main(String[] args) {
        CollegeAdmission admission= new CollegeAdmission();

        admission.seatFilled=900;

        System.out.println("Available seat:" +admission.availableSeat());

        admission.admissionStudent();

        System.out.println("Available seat after admission:"+admission.availableSeat());

    }
}