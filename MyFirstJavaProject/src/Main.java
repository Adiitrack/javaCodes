class ContactsManager{
    Contact[] myFriends;
    String name;
    int Friendscount;
    ContactsManager(){
        Friendscount=0;
        myFriends=new Contact[500];
    }

    void addcontact(Contact contact, String name){
        myFriends[Friendscount]=contact;
        Friendscount++;
        this.name=name;

    }
    Contact searchContact(String searchName){
        for(int i=0;i<Friendscount;i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
class Contact{
    String name;
    String email;
    String phoneNumber;
}
class Main{
    public static void main(String[] args){
        ContactsManager myContactManager=new ContactsManager();
    }
}