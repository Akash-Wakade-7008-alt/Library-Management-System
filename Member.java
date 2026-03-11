class Member
{

 int studentId;
 String studentName;
 Bool borrowStatus;

 void checkStudentDetails()
 {
  
  System.out.printf("Student id : %d \n",studentId);
  System.out.printf("Student name : %s \n",studentName);
    
    if(borrowStatus==true)   
        System.out.println("Book Borrow Sattus : YEs");
    else
        System.out.println("Book Borrow Status : No");

 }



}