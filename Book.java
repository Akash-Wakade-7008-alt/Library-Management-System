class Book 
{

int bookId;
String bookName;
String authorName;
Bool availabilityStatus;

void displayDetails()
{
    System.out.printf("Book Id : %d",bookId);
    System.out.printf("Book Name : %s",bookName);
    System.out.printf("Author Name : %s",authorName);

    if(availabilityStatus==true)
    
        System.out.printf("The book %s is available",bookName);
    else

        System.out.printf("The book %s is not available",bookName);
}

void checkAvailability()
{ 
   if(availabilityStatus==true)
    
        System.out.printf("The book %s is available",bookName);
    else

        System.out.printf("The book %s is not available",bookName);
        
}

}