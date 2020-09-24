/*
 * Copyright
 */

package org.germalus.backend.webrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Rest implementation of controller.
 *
 * @since 0.0.1
 */
@RestController
@RequestMapping("test")
public class MessageRest implements MessageController {
    @GetMapping("/message")
    @Override
    public final String getMessage() {
        return "My first string!";
    }
}