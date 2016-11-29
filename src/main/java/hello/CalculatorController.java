package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/plus")
    public ResultResponse plus(@RequestParam(value="first", defaultValue="0") double first,
                                   @RequestParam(value="second", defaultValue="0") double second) {
        return new ResultResponse(first + second);
    }

    @GetMapping("/minus")
    public ResultResponse minus(@RequestParam(value="first", defaultValue="0") double first,
                                   @RequestParam(value="second", defaultValue="0") double second) {
        return new ResultResponse(first - second);
    }

    @GetMapping("/multiply")
    public ResultResponse multiply(@RequestParam(value="first", defaultValue="0") double first,
                                   @RequestParam(value="second", defaultValue="0") double second) {
        return new ResultResponse(first * second);
    }

    @GetMapping("/divide")
    public ResultResponse divide(@RequestParam(value="first", defaultValue="0") double first,
                                   @RequestParam(value="second", defaultValue="0") double second) {
        return new ResultResponse(first / second);
    }

    @GetMapping("/pow")
    public ResultResponse pow(@RequestParam(value="first", defaultValue="0") double first,
                                   @RequestParam(value="second", defaultValue="0") double second) {
        return new ResultResponse(Math.pow(first, second));
    }
}
