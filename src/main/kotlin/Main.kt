import java.io.File

fun main(args: Array<String>) {
    println("Hello World!")
val contactHandler: ContactHandler = ContactHandler()

    contactHandler.ReadAndCreateFile()
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
                contactHandler.SaveFile()
                loop = false
            }
        }
    }


}