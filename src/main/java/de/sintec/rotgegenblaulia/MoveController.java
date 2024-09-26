package de.sintec.rotgegenblaulia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoveController {

    private final GameService gameService;

    public MoveController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/move")
    public ResultDto foo(@RequestParam("field") String field) {
        var result = this.gameService.move(field);

        return new ResultDto(result, "success");
    }

}
