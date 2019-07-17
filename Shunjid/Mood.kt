class Mood {
    private var isMoodHappy: Boolean = false
    private var yourName: String = ""
    
    fun setName(name: String){
        yourName = name
    }

    fun getHappy(){
        isMoodHappy = true
    }

    fun getSad(){
        isMoodHappy = false
    }

    fun whatMyMoodToday(){
        if(isMoodHappy == true){
            println(yourName + " is Happy Today")
        }else{
            println(yourName + " is Sad Today")
        }
    }
}

fun main(args: Array<String>) {
    val mood1 = Mood()
    val mood2 = Mood()
    mood1.setName("Showrov")
    mood1.getHappy()
    mood2.setName("June")
    mood2.getSad()

    mood1.whatMyMoodToday()
    mood2.whatMyMoodToday()
}