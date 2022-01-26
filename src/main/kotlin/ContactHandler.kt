class ContactHandler {
    var contactlist: MutableList<Contacts> = mutableListOf()

    fun Menu(pick: Int): Int{
        println("--------------------")
        println("\n[1] Add Contact \n[2] Remove Contact \n[3] Edit Contact \n[4] Show Contacts \n[5] Sort Contacts \n[6] Save and exit ")
        println("\n--------------------")
        var pick = readln()!!.toInt()
        return pick
    }
    fun AddContact(){
        print("Enter Firstname: ")
        var firstname = readln()
        print("Enter Lastname: ")
        var lastname = readln()
        print("Enter phonenumber: ")
        var phonenumber = readLine()!!.toInt()
        print("Enter email: ")
        var email = readln()

        contactlist.add(Contacts(firstname,lastname,phonenumber,email))

    }

    fun RemoveContact(){

        for(i in 0 until  contactlist.count()){
            println("\nid:["+ i + "]"+" \n Firstname: " + contactlist[i].firstname + " \n Lastname: " + contactlist[i].lastname + " \n phonenumber: " + contactlist[i].phonenumber + " \n qemail: " + contactlist[i].email)


        }
        println("Enter id of requested contact")
        var id = readLine()!!.toInt()
        contactlist.removeAt(id)
    }

    fun EditContact(){
        for(i in 0 until  contactlist.count()){
            println("\nid:["+ i + "]"+" \n Firstname: " + contactlist[i].firstname + " \n Lastname: " + contactlist[i].lastname + " \n phonenumber: " + contactlist[i].phonenumber + " \n qemail: " + contactlist[i].email)


        }
        println("Enter id of requested contact")
        var id = readLine()!!.toInt()
        println(" \n[1]: Firstname: " + contactlist[id].firstname + " \n[2]: Lastname: " + contactlist[id].lastname + " \n[3]: phonenumber: " + contactlist[id].phonenumber + " \n [4]: gemail: " + contactlist[id].email)
        println("Enter number of requested edit")
        var pick = readln()!!.toInt()

        when(pick){
        1 -> {
            print("Enter Firstname: ")
            contactlist[id].firstname = readln()
        }
        2 -> {
            print("Enter Lastname: ")
            contactlist[id].lastname = readln()
        }
        3 -> {
            print("Enter phonenumber: ")
            contactlist[id].phonenumber = readln()!!.toInt()
        }
        4 -> {
            print("Enter email: ")
            contactlist[id].email = readln()
        }
        }

        fun PrintContacts(){
            for(i in 0 until  contactlist.count()){
                println("\n id:["+i+"] Firstname: "+ contactlist[i] + " Lastname: "+ contactlist[i].lastname )
            }
        }

        fun SortAndShow(){

        }
    }
}