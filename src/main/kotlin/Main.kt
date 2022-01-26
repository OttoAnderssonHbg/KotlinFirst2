fun main(args: Array<String>) {
    println("Hello World!")
val contactHandler: ContactHandler = ContactHandler()
    val loop: Boolean = true
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

            }
            4 -> {

            }
            5 -> {

            }
            6 -> {

            }
        }
    }


}