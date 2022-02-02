import java.io.File
class FileHandler {
    fun ReadAndCreateFile(){

        val filename = "ListOfContacts.txt"
        var fileObject = File(filename)
        var fileExists = fileObject.exists()
        if(fileExists){
            print("$filename file does exist.")

            val file = File("ListOfContacts.txt")
            val bufferedReader = file.bufferedReader()
            val text:List<String> = bufferedReader.readLines()

            for(i in 0 until text.count()){
                var result: MutableList<String> = (text[i].split(',').map { it.trim() }).toMutableList()
                contactHandler.contactlist.add(Contacts(result[0],result[1],result[2]!!.toInt(),result[3]))
            }

        } else {
            print("$filename file does not exist.")
            fileObject.createNewFile()
        }

    }
    //Method that tries to find file with list of contacts. If file does not exist then it creates new file, otherwise it reads it and saves the content in a list.
    fun SaveFile(){
        val filename="ListOfContacts.txt"
        File(filename).writeText("")
        for(i in 0 until contactHandler.contactlist.count()){

            var content:String=contactHandler.contactlist[i].firstname+","+contactHandler.contactlist[i].lastname+","+contactHandler.contactlist[i].phonenumber+","+contactHandler.contactlist[i].email
            File(filename).appendText(content)
            File(filename).appendText("\n")
        }
    }
    //Method that saves the content of the contact list by appending it to the list of contacts file.
}