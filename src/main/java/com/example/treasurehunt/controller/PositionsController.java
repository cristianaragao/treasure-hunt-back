package com.example.treasurehunt.controller;

import com.example.treasurehunt.model.Clue;
import com.example.treasurehunt.model.IntRequestBody;
import com.example.treasurehunt.model.ResponsePositions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/positions")
public class PositionsController {
    public static int getRandomNumber(int min, int max) {

        Random random = new Random();

        int randomNumber = random.nextInt(max - min) + min;

        return randomNumber;
    }

    @PostMapping
    public ResponseEntity<ResponsePositions> generatePositions(@RequestBody IntRequestBody request) {

        int total = request.getTotal();

        int positionPlayer = getRandomNumber(0, total);
        Map<String, Clue> clues = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            int n = getRandomNumber(0, total);

            while (clues.containsKey(n) || positionPlayer == n) {
                n = getRandomNumber(0, total);
            }

            Clue clue = new Clue(n, false, i >= 0 && i <= 2, i == 3, i == 4);
            clues.put(String.valueOf(n), clue);
        }

        ResponsePositions response = new ResponsePositions(positionPlayer, clues);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
