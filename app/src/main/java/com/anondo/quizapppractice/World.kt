package com.anondo.quizapppractice

object World {

    val question = mutableListOf<Quiz>(
        Quiz(
            "What is the capital of BD?",
            listOf("Noakhali", "Bogura", " Dhaka", "Rangpur"),
            1
        ),
        Quiz(
            "What is the Industrial Capital of Bangladesh?",
            listOf("Noakhali", "Bogura", " Dhaka", "Rangpur"),
            2
        ),
        Quiz(
            "What is the capital of India?",
            listOf("Mumbai", "New Delhi", "Kolkata", "Chennai"),
            1
        ),
        Quiz(
            "What is the capital of USA?",
            listOf("New York", "Washington D.C.", "Los Angeles", "Chicago"),
            1
        ),
        Quiz(
            "What is the capital of Canada?",
            listOf("Toronto", "Ottawa", "Vancouver", "Montreal"),
            1
        ),
        Quiz(
            "What is the capital of Australia?",
            listOf("Sydney", "Melbourne", "Canberra", "Perth"),
            2
        ),
        Quiz(
            "What is the capital of Bangladesh?",
            listOf("Noakhali", "Bogura", "Dhaka", "Rangpur"),
            2
        ),
        Quiz(
            "What is the capital of Pakistan?",
            listOf("Karachi", "Lahore", "Islamabad", "Peshawar"),
            2
        ),
        Quiz(
            "What is the capital of Nepal?",
            listOf("Pokhara", "Kathmandu", "Biratnagar", "Lalitpur"),
            1
        ),
        Quiz("What is the capital of Sri Lanka?", listOf("Kandy", "Colombo", "Galle", "Jaffna"), 1),
        Quiz(
            "What is the capital of China?",
            listOf("Shanghai", "Beijing", "Hong Kong", "Guangzhou"),
            1
        ),
        Quiz("What is the capital of Japan?", listOf("Osaka", "Kyoto", "Tokyo", "Nagoya"), 2),
        Quiz("What is the capital of France?", listOf("Paris", "Lyon", "Marseille", "Nice"), 0),
        Quiz(
            "What is the capital of Germany?",
            listOf("Munich", "Berlin", "Frankfurt", "Hamburg"),
            1
        ),
        Quiz("What is the capital of Italy?", listOf("Venice", "Milan", "Rome", "Florence"), 2),
        Quiz(
            "What is the capital of Spain?",
            listOf("Barcelona", "Madrid", "Seville", "Valencia"),
            1
        ),
        Quiz("What is the capital of Portugal?", listOf("Lisbon", "Porto", "Braga", "Coimbra"), 0),
        Quiz(
            "What is the capital of Russia?",
            listOf("Moscow", "Saint Petersburg", "Kazan", "Sochi"),
            0
        ),
        Quiz("What is the capital of Ukraine?", listOf("Kyiv", "Odesa", "Lviv", "Kharkiv"), 0),
        Quiz(
            "What is the capital of Brazil?",
            listOf("Rio de Janeiro", "São Paulo", "Brasília", "Salvador"),
            2
        ),
        Quiz(
            "What is the capital of Argentina?",
            listOf("Rosario", "Córdoba", "Buenos Aires", "Mendoza"),
            2
        ),
        Quiz(
            "What is the capital of South Africa?",
            listOf("Pretoria", "Cape Town", "Johannesburg", "Durban"),
            0
        ),
        Quiz("What is the capital of Egypt?", listOf("Alexandria", "Cairo", "Giza", "Luxor"), 1),
        Quiz(
            "What is the capital of Saudi Arabia?",
            listOf("Jeddah", "Riyadh", "Mecca", "Medina"),
            1
        ),
        Quiz("What is the capital of UAE?", listOf("Dubai", "Abu Dhabi", "Sharjah", "Ajman"), 1),
        Quiz("What is the capital of Turkey?", listOf("Istanbul", "Ankara", "Izmir", "Antalya"), 1),
        Quiz("What is the capital of Iran?", listOf("Tehran", "Mashhad", "Isfahan", "Shiraz"), 0),
        Quiz("What is the capital of Iraq?", listOf("Basra", "Baghdad", "Mosul", "Erbil"), 1),
        Quiz(
            "What is the capital of Afghanistan?",
            listOf("Kandahar", "Kabul", "Herat", "Mazar-i-Sharif"),
            1
        ),
        Quiz(
            "What is the capital of Thailand?",
            listOf("Chiang Mai", "Phuket", "Bangkok", "Pattaya"),
            2
        ),
        Quiz(
            "What is the capital of Malaysia?",
            listOf("Penang", "Kuala Lumpur", "Malacca", "Johor Bahru"),
            1
        ),
        Quiz(
            "What is the capital of Singapore?",
            listOf("Singapore", "None", "Sentosa", "Changi"),
            0
        ),
        Quiz(
            "What is the capital of Indonesia?",
            listOf("Bali", "Surabaya", "Jakarta", "Medan"),
            2
        ),
        Quiz(
            "What is the capital of Philippines?",
            listOf("Manila", "Cebu", "Davao", "Quezon City"),
            0
        ),
        Quiz(
            "What is the capital of Vietnam?",
            listOf("Hanoi", "Ho Chi Minh City", "Da Nang", "Hue"),
            0
        ),
        Quiz(
            "What is the capital of South Korea?",
            listOf("Busan", "Seoul", "Incheon", "Daegu"),
            1
        ),
        Quiz(
            "What is the capital of North Korea?",
            listOf("Pyongyang", "Kaesong", "Hamhung", "Nampo"),
            0
        ),
        Quiz(
            "What is the capital of Myanmar?",
            listOf("Yangon", "Naypyidaw", "Mandalay", "Bago"),
            1
        ),
        Quiz(
            "What is the capital of Bhutan?",
            listOf("Thimphu", "Paro", "Punakha", "Phuentsholing"),
            0
        ),
        Quiz(
            "What is the capital of Maldives?",
            listOf("Male", "Addu City", "Fuvahmulah", "Kulhudhuffushi"),
            0
        ),
        Quiz(
            "What is the capital of Qatar?",
            listOf("Doha", "Al Rayyan", "Umm Salal", "Al Wakrah"),
            0
        ),
        Quiz("What is the capital of Oman?", listOf("Muscat", "Salalah", "Nizwa", "Sohar"), 0),
        Quiz(
            "What is the capital of Kuwait?",
            listOf("Hawalli", "Kuwait City", "Ahmadi", "Jahra"),
            1
        ),
        Quiz("What is the capital of Jordan?", listOf("Amman", "Zarqa", "Irbid", "Aqaba"), 0),
        Quiz("What is the capital of Lebanon?", listOf("Tripoli", "Beirut", "Sidon", "Byblos"), 1),
        Quiz(
            "What is the capital of Israel?",
            listOf("Jerusalem", "Tel Aviv", "Haifa", "Eilat"),
            0
        ),
        Quiz(
            "What is the capital of Greece?",
            listOf("Athens", "Thessaloniki", "Patras", "Crete"),
            0
        ),
        Quiz(
            "What is the capital of Sweden?",
            listOf("Stockholm", "Gothenburg", "Malmo", "Uppsala"),
            0
        ),
        Quiz(
            "What is the capital of Norway?",
            listOf("Oslo", "Bergen", "Trondheim", "Stavanger"),
            0
        ),
        Quiz("What is the capital of Finland?", listOf("Helsinki", "Turku", "Tampere", "Oulu"), 0),
        Quiz(
            "What is the capital of Denmark?",
            listOf("Aarhus", "Odense", "Copenhagen", "Aalborg"),
            2
        ),
        Quiz("What is the capital of Switzerland?", listOf("Zurich", "Bern", "Geneva", "Basel"), 1),
        Quiz(
            "What is the capital of Netherlands?",
            listOf("Rotterdam", "Amsterdam", "The Hague", "Utrecht"),
            1
        )
    )


}