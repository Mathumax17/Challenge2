class SoftwareEngineer {
    //Attributes
    //syntax=type+name+value
    String Name;
    String Pro_Language;
    int Id;
    String Fav_Project;
    // syntax of constructor =className + (pass the attribute)+{this . attributeName=attributeName;}
    SoftwareEngineer(String Name, String Pro_Language, String Id, String Fav_Project){
        this.Name=Name;
        this.Pro_Language=Pro_Language;
        this.Id=Id;
        this.Fav_Project=Fav_Project;

    }
    void Coding(){
        System.out.println("make codes for game");
    }
    void Comments(){
        System.out.println("add comments for coding");
    }
    void Checker(){
        System.out.println("Check the coding");
    }


}
