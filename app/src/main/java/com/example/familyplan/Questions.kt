package com.example.familyplan

data class Questions(
    val title: String,
    val desc: String,
    var isExpandable: Boolean = false
)

val question1 = Questions(
    "Birth control over view",
    "What is family planning? \n\n What is contraception? \n\n Why is birth control important? \n\n I am married why is family planning important for me?"
)
val question2 = Questions(
    "IUD ",
    "I have varicose vein .is it true I should not use the pill?\n" +
            "I hear birth control pills cause cancer .is it true?\n" +
            "After I started taking pills my period has almost stopped .is this normal\n "
)
val question3 = Questions(
    "Barriers",
    "What should I do if a condom comes off inside me or breaks?\n" +
            "What if condom doesn’t fit well?\n" +
            "Can I reuse condom if I clean it carefully?\n "
)
val question4 = Questions(
    "Emergency pills",
    "What happens if I use emergency pills more than 5 days after having unprotected sex ?\n" +
            "I have heard that using emergency pills is the same as getting an abortion .is this true?\n" +
            "I tried using emergency pills but I was too late .what can I do ?\n "
)


val questionsList = arrayListOf(question1, question2, question3, question4)