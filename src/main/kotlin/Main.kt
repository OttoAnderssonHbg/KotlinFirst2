import java.io.File
var contactHandler: ContactHandler = ContactHandler()
val fileHandler: FileHandler = FileHandler()
//creates contacthandler and filehandler
fun main(args: Array<String>) {
    println("Hello World!")

     fileHandler.ReadAndCreateFile()
    //Reads or creates file
    var loop: Boolean = true

    while(loop){
       var pick = contactHandler.Menu(0)
        when(pick){
            1 -> {
                contactHandler.AddContact()
            }
            2 -> {
                contactHandler.RemoveContact()
            }
            3 -> {
                contactHandler.EditContact()
            }
            4 -> {
                contactHandler.PrintContacts()
            }
            5 -> {
                contactHandler.SortAndShow()
            }
            6 -> {
                fileHandler.SaveFile()
                loop = false
            }
        }
    }
   //Loop that executes method based on userinput.

}