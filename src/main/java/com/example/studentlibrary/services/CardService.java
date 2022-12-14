package com.example.studentlibrary.services;

import com.example.studentlibrary.models.Card;
import com.example.studentlibrary.models.CardStatus;
import com.example.studentlibrary.models.Student;
import com.example.studentlibrary.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public Card createAndReturn(Student student){
        Card card = new Card();
        card.setStudent(student);
        student.setCard(card);

        cardRepository.save(card);

        return card;
    }

    public void deactivateCard(int student_id){
        cardRepository.deactivateCard(student_id, CardStatus.DEACTIVATED.toString());
    }
}
