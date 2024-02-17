package org.example.standard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StandardController {
    @RequestMapping("/standards")
    public List<Standard> getAllStandards() {
        return Arrays.asList(
                new Standard("1", "A", "Mr. Harry"),
                new Standard("2", "A", "Mr. Charles"),
                new Standard("4", "C", "Mr. Ronald"),
                new Standard("3", "B", "Mr. John")
        );
    }
}
