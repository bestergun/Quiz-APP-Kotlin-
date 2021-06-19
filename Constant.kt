package com.example.myapplication

 object Constant {
     fun getQuestion(): ArrayList<Question>{
         val questionArray = ArrayList<Question>()

         val question1 = Question(
             1,
             "What are the other types of OLAP apart from ROLAP?",
             "HOLAP",
             "MOLAP",
             "DOLAP",
             "Both a and b above",
             2
         )
         questionArray.add(question1)

         val question2 = Question(
             2,
             "A network router joins two _________ together?",
             "Computers",
             "Switches",
             "Networks",
             "Gateway",
             3
         )
         questionArray.add(question2)

         val question3 = Question(
             3,
             "Which of the following below is a loopback IP address?",
             "127.0.0.0",
             "127.0.1.1",
             "127.0.1.0",
             "127.0.0.1",
             4
         )
         questionArray.add(question3)

         val question4 = Question(
             4,
             "Ping command works on which protocol?",
             "ICMP",
             "TCP",
             "IP",
             "UDP",
             1
         )
         questionArray.add(question4)

         val question5 = Question(
             5,
             "Transport layer of OSI model lies between Network and ___________ layer",
             "Application",
             "Data link",
             "Session",
             "Presentation",
             3
         )
         questionArray.add(question5)

         val question6 = Question(
             6,
             "Which of the following protocols below work in the application layer?",
             "POP",
             "PPP",
             "FTP",
             "Both a and d above",
             4
         )
         questionArray.add(question6)

         val question7 = Question(
             7,
             "What is the port number for HTTP?",
             "20",
             "80",
             "25",
             "65",
             2
         )
         questionArray.add(question7)

         val question8 = Question(
             8,
             "From the options below, which suits best for MODEM?",
             "a device that modulates an analog carrier signal to encode digital information",
             "a device that modulates a digital carrier signal to encode analog information",
             "a device that modulates an analog carrier signal to decode digital information",
             "a device that modulates a digital carrier signal to decode analog information",
             1
         )
         questionArray.add(question8)

         val question9 = Question(
             9,
             "What is the size of an IP address?",
             "64 bit",
             "128 bit",
             "16 bit",
             "32 bit",
             4
         )
         questionArray.add(question9)

         val question10 = Question(
             10,
             "MAC addresses are also known as?",
             "Hardware address",
             "Physical address",
             "both and b above",
             "IP address",
             3
         )
         questionArray.add(question10)

         return questionArray
     }
}